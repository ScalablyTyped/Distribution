package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalListDevicesResponse extends StObject {
  
  /** The devices that match the request. */
  var devices: js.UndefOr[js.Array[SasPortalDevice]] = js.native
  
  /**
    * A pagination token returned from a previous call to ListDevices method that indicates from where listing should continue. If the field is missing or empty, it means there is no more
    * devices.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SasPortalListDevicesResponse {
  
  @scala.inline
  def apply(): SasPortalListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListDevicesResponse]
  }
  
  @scala.inline
  implicit class SasPortalListDevicesResponseMutableBuilder[Self <: SasPortalListDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[SasPortalDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: SasPortalDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
