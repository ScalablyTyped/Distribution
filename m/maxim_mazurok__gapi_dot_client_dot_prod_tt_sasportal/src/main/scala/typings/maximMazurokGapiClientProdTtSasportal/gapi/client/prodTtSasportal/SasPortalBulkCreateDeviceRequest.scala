package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalBulkCreateDeviceRequest extends js.Object {
  
  /** Required. A csv with each row representing a [device]. Each row must conform to the regulations described on CreateDeviceRequest's device field. */
  var csv: js.UndefOr[String] = js.native
}
object SasPortalBulkCreateDeviceRequest {
  
  @scala.inline
  def apply(): SasPortalBulkCreateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalBulkCreateDeviceRequest]
  }
  
  @scala.inline
  implicit class SasPortalBulkCreateDeviceRequestOps[Self <: SasPortalBulkCreateDeviceRequest] (val x: Self) extends AnyVal {
    
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
    def setCsv(value: String): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
  }
}
