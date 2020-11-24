package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trust extends js.Object {
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The last heartbeat time when the trust was known to be connected. */
  var lastTrustHeartbeatTime: js.UndefOr[String] = js.native
  
  /** Optional. The trust authentication type, which decides whether the trusted side has forest/domain wide access or selective access to an approved set of resources. */
  var selectiveAuthentication: js.UndefOr[Boolean] = js.native
  
  /** Output only. The current state of the trust. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. Additional information about the current state of the trust, if available. */
  var stateDescription: js.UndefOr[String] = js.native
  
  /** Required. The target DNS server IP addresses which can resolve the remote domain involved in the trust. */
  var targetDnsIpAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The fully qualified target domain name which will be in trust with the current domain. */
  var targetDomainName: js.UndefOr[String] = js.native
  
  /** Required. The trust direction, which decides if the current domain is trusted, trusting, or both. */
  var trustDirection: js.UndefOr[String] = js.native
  
  /** Required. The trust secret used for the handshake with the target domain. This will not be stored. */
  var trustHandshakeSecret: js.UndefOr[String] = js.native
  
  /** Required. The type of trust represented by the trust resource. */
  var trustType: js.UndefOr[String] = js.native
  
  /** Output only. The last update time. */
  var updateTime: js.UndefOr[String] = js.native
}
object Trust {
  
  @scala.inline
  def apply(): Trust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trust]
  }
  
  @scala.inline
  implicit class TrustOps[Self <: Trust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLastTrustHeartbeatTime(value: String): Self = this.set("lastTrustHeartbeatTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTrustHeartbeatTime: Self = this.set("lastTrustHeartbeatTime", js.undefined)
    
    @scala.inline
    def setSelectiveAuthentication(value: Boolean): Self = this.set("selectiveAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectiveAuthentication: Self = this.set("selectiveAuthentication", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateDescription(value: String): Self = this.set("stateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateDescription: Self = this.set("stateDescription", js.undefined)
    
    @scala.inline
    def setTargetDnsIpAddressesVarargs(value: String*): Self = this.set("targetDnsIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setTargetDnsIpAddresses(value: js.Array[String]): Self = this.set("targetDnsIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDnsIpAddresses: Self = this.set("targetDnsIpAddresses", js.undefined)
    
    @scala.inline
    def setTargetDomainName(value: String): Self = this.set("targetDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDomainName: Self = this.set("targetDomainName", js.undefined)
    
    @scala.inline
    def setTrustDirection(value: String): Self = this.set("trustDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustDirection: Self = this.set("trustDirection", js.undefined)
    
    @scala.inline
    def setTrustHandshakeSecret(value: String): Self = this.set("trustHandshakeSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustHandshakeSecret: Self = this.set("trustHandshakeSecret", js.undefined)
    
    @scala.inline
    def setTrustType(value: String): Self = this.set("trustType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustType: Self = this.set("trustType", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
