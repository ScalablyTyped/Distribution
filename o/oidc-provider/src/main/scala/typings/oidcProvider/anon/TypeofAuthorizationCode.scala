package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAuthorizationCode extends StObject {
  
  /* static member */
  def revokeByGrantId(grantId: String): js.Promise[Unit]
}
object TypeofAuthorizationCode {
  
  inline def apply(revokeByGrantId: String => js.Promise[Unit]): TypeofAuthorizationCode = {
    val __obj = js.Dynamic.literal(revokeByGrantId = js.Any.fromFunction1(revokeByGrantId))
    __obj.asInstanceOf[TypeofAuthorizationCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAuthorizationCode] (val x: Self) extends AnyVal {
    
    inline def setRevokeByGrantId(value: String => js.Promise[Unit]): Self = StObject.set(x, "revokeByGrantId", js.Any.fromFunction1(value))
  }
}
