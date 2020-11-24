package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadLineItemsRequest extends js.Object {
  
  /** Set to true to get upload status without actually persisting the line items. */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /** Format the line items are in. Default to CSV. */
  var format: js.UndefOr[String] = js.native
  
  /** Line items in CSV to upload. Refer to Entity Write File Format for more information on file format. */
  var lineItems: js.UndefOr[String] = js.native
}
object UploadLineItemsRequest {
  
  @scala.inline
  def apply(): UploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLineItemsRequest]
  }
  
  @scala.inline
  implicit class UploadLineItemsRequestOps[Self <: UploadLineItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLineItems(value: String): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
  }
}
