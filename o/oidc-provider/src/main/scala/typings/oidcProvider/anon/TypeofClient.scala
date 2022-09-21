package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofClient extends StObject {
  
  /* static member */
  def find(id: String): js.Promise[js.UndefOr[typings.oidcProvider.mod.Client]]
}
object TypeofClient {
  
  inline def apply(find: String => js.Promise[js.UndefOr[typings.oidcProvider.mod.Client]]): TypeofClient = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[TypeofClient]
  }
  
  extension [Self <: TypeofClient](x: Self) {
    
    inline def setFind(value: String => js.Promise[js.UndefOr[typings.oidcProvider.mod.Client]]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
  }
}
