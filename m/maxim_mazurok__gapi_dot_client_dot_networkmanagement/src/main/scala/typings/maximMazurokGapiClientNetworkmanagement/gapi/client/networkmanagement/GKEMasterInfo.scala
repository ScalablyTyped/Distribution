package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GKEMasterInfo extends StObject {
  
  /** URI of a GKE cluster network. */
  var clusterNetworkUri: js.UndefOr[String] = js.undefined
  
  /** URI of a GKE cluster. */
  var clusterUri: js.UndefOr[String] = js.undefined
  
  /** External IP address of a GKE cluster master. */
  var externalIp: js.UndefOr[String] = js.undefined
  
  /** Internal IP address of a GKE cluster master. */
  var internalIp: js.UndefOr[String] = js.undefined
}
object GKEMasterInfo {
  
  inline def apply(): GKEMasterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GKEMasterInfo]
  }
  
  extension [Self <: GKEMasterInfo](x: Self) {
    
    inline def setClusterNetworkUri(value: String): Self = StObject.set(x, "clusterNetworkUri", value.asInstanceOf[js.Any])
    
    inline def setClusterNetworkUriUndefined: Self = StObject.set(x, "clusterNetworkUri", js.undefined)
    
    inline def setClusterUri(value: String): Self = StObject.set(x, "clusterUri", value.asInstanceOf[js.Any])
    
    inline def setClusterUriUndefined: Self = StObject.set(x, "clusterUri", js.undefined)
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
  }
}
