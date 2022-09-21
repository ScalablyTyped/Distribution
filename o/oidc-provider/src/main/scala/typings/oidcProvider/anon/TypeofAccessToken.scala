package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccessToken extends StObject {
  
  /* static member */
  def revokeByGrantId(grantId: String): js.Promise[Unit]
}
object TypeofAccessToken {
  
  inline def apply(revokeByGrantId: String => js.Promise[Unit]): TypeofAccessToken = {
    val __obj = js.Dynamic.literal(revokeByGrantId = js.Any.fromFunction1(revokeByGrantId))
    __obj.asInstanceOf[TypeofAccessToken]
  }
  
  extension [Self <: TypeofAccessToken](x: Self) {
    
    inline def setRevokeByGrantId(value: String => js.Promise[Unit]): Self = StObject.set(x, "revokeByGrantId", js.Any.fromFunction1(value))
  }
}
