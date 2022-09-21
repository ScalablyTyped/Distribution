package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBackchannelAuthenti extends StObject {
  
  /* static member */
  def revokeByGrantId(grantId: String): js.Promise[Unit]
}
object TypeofBackchannelAuthenti {
  
  inline def apply(revokeByGrantId: String => js.Promise[Unit]): TypeofBackchannelAuthenti = {
    val __obj = js.Dynamic.literal(revokeByGrantId = js.Any.fromFunction1(revokeByGrantId))
    __obj.asInstanceOf[TypeofBackchannelAuthenti]
  }
  
  extension [Self <: TypeofBackchannelAuthenti](x: Self) {
    
    inline def setRevokeByGrantId(value: String => js.Promise[Unit]): Self = StObject.set(x, "revokeByGrantId", js.Any.fromFunction1(value))
  }
}
