package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalListDevicesResponse extends StObject {
  
  /** The devices that match the request. */
  var devices: js.UndefOr[js.Array[SasPortalDevice]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListDevices method that indicates from where listing should continue. If the field is missing or empty, it means there is no more
    * devices.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SasPortalListDevicesResponse {
  
  inline def apply(): SasPortalListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListDevicesResponse]
  }
  
  extension [Self <: SasPortalListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SasPortalDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SasPortalDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
