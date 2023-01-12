package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInfo extends StObject {
  
  /** Name of a Compute Engine instance. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** External IP address of the network interface. */
  var externalIp: js.UndefOr[String] = js.undefined
  
  /** Name of the network interface of a Compute Engine instance. */
  var interface: js.UndefOr[String] = js.undefined
  
  /** Internal IP address of the network interface. */
  var internalIp: js.UndefOr[String] = js.undefined
  
  /** Network tags configured on the instance. */
  var networkTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URI of a Compute Engine network. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Service account authorized for the instance. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine instance. */
  var uri: js.UndefOr[String] = js.undefined
}
object InstanceInfo {
  
  inline def apply(): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
