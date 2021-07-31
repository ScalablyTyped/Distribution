package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadLineItemsRequest extends StObject {
  
  /** Set to true to get upload status without actually persisting the line items. */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /** Format the line items are in. Default to CSV. */
  var format: js.UndefOr[String] = js.undefined
  
  /** Line items in CSV to upload. Refer to Entity Write File Format for more information on file format. */
  var lineItems: js.UndefOr[String] = js.undefined
}
object UploadLineItemsRequest {
  
  @scala.inline
  def apply(): UploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLineItemsRequest]
  }
  
  @scala.inline
  implicit class UploadLineItemsRequestMutableBuilder[Self <: UploadLineItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
