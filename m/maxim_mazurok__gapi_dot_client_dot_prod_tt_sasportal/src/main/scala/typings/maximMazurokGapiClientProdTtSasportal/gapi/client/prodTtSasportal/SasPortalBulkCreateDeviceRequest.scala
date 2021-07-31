package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalBulkCreateDeviceRequest extends StObject {
  
  /** Required. A csv with each row representing a [device]. Each row must conform to the regulations described on CreateDeviceRequest's device field. */
  var csv: js.UndefOr[String] = js.undefined
}
object SasPortalBulkCreateDeviceRequest {
  
  @scala.inline
  def apply(): SasPortalBulkCreateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalBulkCreateDeviceRequest]
  }
  
  @scala.inline
  implicit class SasPortalBulkCreateDeviceRequestMutableBuilder[Self <: SasPortalBulkCreateDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: String): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
