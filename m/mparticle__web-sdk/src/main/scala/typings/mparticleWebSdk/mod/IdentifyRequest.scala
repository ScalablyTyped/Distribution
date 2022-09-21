package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifyRequest extends StObject {
  
  var userIdentities: UserIdentities
}
object IdentifyRequest {
  
  inline def apply(userIdentities: UserIdentities): IdentifyRequest = {
    val __obj = js.Dynamic.literal(userIdentities = userIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifyRequest]
  }
  
  extension [Self <: IdentifyRequest](x: Self) {
    
    inline def setUserIdentities(value: UserIdentities): Self = StObject.set(x, "userIdentities", value.asInstanceOf[js.Any])
  }
}
