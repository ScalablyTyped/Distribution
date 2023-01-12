package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudSQLInstanceInfo extends StObject {
  
  /** Name of a Cloud SQL instance. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** External IP address of a Cloud SQL instance. */
  var externalIp: js.UndefOr[String] = js.undefined
  
  /** Internal IP address of a Cloud SQL instance. */
  var internalIp: js.UndefOr[String] = js.undefined
  
  /** URI of a Cloud SQL instance network or empty string if the instance does not have one. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Region in which the Cloud SQL instance is running. */
  var region: js.UndefOr[String] = js.undefined
  
  /** URI of a Cloud SQL instance. */
  var uri: js.UndefOr[String] = js.undefined
}
object CloudSQLInstanceInfo {
  
  inline def apply(): CloudSQLInstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSQLInstanceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudSQLInstanceInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
