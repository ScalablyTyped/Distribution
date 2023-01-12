package typings.oidcProvider.anon

import typings.koa.mod.Context
import typings.oidcProvider.mod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSession extends StObject {
  
  /* static member */
  def find[T](cookieId: String): js.Promise[js.UndefOr[T]]
  
  /* static member */
  def findByUid(uid: String): js.Promise[js.UndefOr[Session]]
  
  /* static member */
  def get(ctx: Context): js.Promise[Session]
}
object TypeofSession {
  
  inline def apply(
    find: String => js.Promise[js.UndefOr[Any]],
    findByUid: String => js.Promise[js.UndefOr[Session]],
    get: Context => js.Promise[Session]
  ): TypeofSession = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findByUid = js.Any.fromFunction1(findByUid), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TypeofSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSession] (val x: Self) extends AnyVal {
    
    inline def setFind(value: String => js.Promise[js.UndefOr[Any]]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindByUid(value: String => js.Promise[js.UndefOr[Session]]): Self = StObject.set(x, "findByUid", js.Any.fromFunction1(value))
    
    inline def setGet(value: Context => js.Promise[Session]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
