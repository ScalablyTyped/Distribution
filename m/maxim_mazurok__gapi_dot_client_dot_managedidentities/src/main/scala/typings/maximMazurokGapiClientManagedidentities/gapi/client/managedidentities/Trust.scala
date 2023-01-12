package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trust extends StObject {
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The last heartbeat time when the trust was known to be connected. */
  var lastTrustHeartbeatTime: js.UndefOr[String] = js.undefined
  
  /** Optional. The trust authentication type, which decides whether the trusted side has forest/domain wide access or selective access to an approved set of resources. */
  var selectiveAuthentication: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The current state of the trust. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information about the current state of the trust, if available. */
  var stateDescription: js.UndefOr[String] = js.undefined
  
  /** Required. The target DNS server IP addresses which can resolve the remote domain involved in the trust. */
  var targetDnsIpAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The fully qualified target domain name which will be in trust with the current domain. */
  var targetDomainName: js.UndefOr[String] = js.undefined
  
  /** Required. The trust direction, which decides if the current domain is trusted, trusting, or both. */
  var trustDirection: js.UndefOr[String] = js.undefined
  
  /** Required. The trust secret used for the handshake with the target domain. This will not be stored. */
  var trustHandshakeSecret: js.UndefOr[String] = js.undefined
  
  /** Required. The type of trust represented by the trust resource. */
  var trustType: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Trust {
  
  inline def apply(): Trust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trust]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trust] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLastTrustHeartbeatTime(value: String): Self = StObject.set(x, "lastTrustHeartbeatTime", value.asInstanceOf[js.Any])
    
    inline def setLastTrustHeartbeatTimeUndefined: Self = StObject.set(x, "lastTrustHeartbeatTime", js.undefined)
    
    inline def setSelectiveAuthentication(value: Boolean): Self = StObject.set(x, "selectiveAuthentication", value.asInstanceOf[js.Any])
    
    inline def setSelectiveAuthenticationUndefined: Self = StObject.set(x, "selectiveAuthentication", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDescription(value: String): Self = StObject.set(x, "stateDescription", value.asInstanceOf[js.Any])
    
    inline def setStateDescriptionUndefined: Self = StObject.set(x, "stateDescription", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargetDnsIpAddresses(value: js.Array[String]): Self = StObject.set(x, "targetDnsIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setTargetDnsIpAddressesUndefined: Self = StObject.set(x, "targetDnsIpAddresses", js.undefined)
    
    inline def setTargetDnsIpAddressesVarargs(value: String*): Self = StObject.set(x, "targetDnsIpAddresses", js.Array(value*))
    
    inline def setTargetDomainName(value: String): Self = StObject.set(x, "targetDomainName", value.asInstanceOf[js.Any])
    
    inline def setTargetDomainNameUndefined: Self = StObject.set(x, "targetDomainName", js.undefined)
    
    inline def setTrustDirection(value: String): Self = StObject.set(x, "trustDirection", value.asInstanceOf[js.Any])
    
    inline def setTrustDirectionUndefined: Self = StObject.set(x, "trustDirection", js.undefined)
    
    inline def setTrustHandshakeSecret(value: String): Self = StObject.set(x, "trustHandshakeSecret", value.asInstanceOf[js.Any])
    
    inline def setTrustHandshakeSecretUndefined: Self = StObject.set(x, "trustHandshakeSecret", js.undefined)
    
    inline def setTrustType(value: String): Self = StObject.set(x, "trustType", value.asInstanceOf[js.Any])
    
    inline def setTrustTypeUndefined: Self = StObject.set(x, "trustType", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
