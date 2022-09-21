package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRefreshToken extends StObject {
  
  /* static member */
  def revokeByGrantId(grantId: String): js.Promise[Unit]
}
object TypeofRefreshToken {
  
  inline def apply(revokeByGrantId: String => js.Promise[Unit]): TypeofRefreshToken = {
    val __obj = js.Dynamic.literal(revokeByGrantId = js.Any.fromFunction1(revokeByGrantId))
    __obj.asInstanceOf[TypeofRefreshToken]
  }
  
  extension [Self <: TypeofRefreshToken](x: Self) {
    
    inline def setRevokeByGrantId(value: String => js.Promise[Unit]): Self = StObject.set(x, "revokeByGrantId", js.Any.fromFunction1(value))
  }
}
