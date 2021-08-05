package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverInstanceRequest extends StObject {
  
  /** Optional. Available data protection modes that the user can choose. If it's unspecified, data protection mode will be LIMITED_DATA_LOSS by default. */
  var dataProtectionMode: js.UndefOr[String] = js.undefined
}
object FailoverInstanceRequest {
  
  inline def apply(): FailoverInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverInstanceRequest]
  }
  
  extension [Self <: FailoverInstanceRequest](x: Self) {
    
    inline def setDataProtectionMode(value: String): Self = StObject.set(x, "dataProtectionMode", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionModeUndefined: Self = StObject.set(x, "dataProtectionMode", js.undefined)
  }
}
