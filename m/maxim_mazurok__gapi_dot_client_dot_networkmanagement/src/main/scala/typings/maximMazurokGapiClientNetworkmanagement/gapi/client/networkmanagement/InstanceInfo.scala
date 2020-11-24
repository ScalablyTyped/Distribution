package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInfo extends js.Object {
  
  /** Name of a Compute Engine instance. */
  var displayName: js.UndefOr[String] = js.native
  
  /** External IP address of the network interface. */
  var externalIp: js.UndefOr[String] = js.native
  
  /** Name of the network interface of a Compute Engine instance. */
  var interface: js.UndefOr[String] = js.native
  
  /** Internal IP address of the network interface. */
  var internalIp: js.UndefOr[String] = js.native
  
  /** Network tags configured on the instance. */
  var networkTags: js.UndefOr[js.Array[String]] = js.native
  
  /** URI of a Compute Engine network. */
  var networkUri: js.UndefOr[String] = js.native
  
  /** Service account authorized for the instance. */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine instance. */
  var uri: js.UndefOr[String] = js.native
}
object InstanceInfo {
  
  @scala.inline
  def apply(): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInfo]
  }
  
  @scala.inline
  implicit class InstanceInfoOps[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExternalIp(value: String): Self = this.set("externalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalIp: Self = this.set("externalIp", js.undefined)
    
    @scala.inline
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    
    @scala.inline
    def setInternalIp(value: String): Self = this.set("internalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalIp: Self = this.set("internalIp", js.undefined)
    
    @scala.inline
    def setNetworkTagsVarargs(value: String*): Self = this.set("networkTags", js.Array(value :_*))
    
    @scala.inline
    def setNetworkTags(value: js.Array[String]): Self = this.set("networkTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTags: Self = this.set("networkTags", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
