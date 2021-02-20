package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInfo extends StObject {
  
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
  implicit class InstanceInfoMutableBuilder[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    @scala.inline
    def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    @scala.inline
    def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
    
    @scala.inline
    def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    @scala.inline
    def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value :_*))
    
    @scala.inline
    def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
