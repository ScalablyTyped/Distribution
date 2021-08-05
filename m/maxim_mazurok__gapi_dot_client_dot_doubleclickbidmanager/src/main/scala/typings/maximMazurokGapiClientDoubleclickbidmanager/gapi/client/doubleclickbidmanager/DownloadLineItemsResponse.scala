package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadLineItemsResponse extends StObject {
  
  /** Retrieved line items in CSV format. For more information about file formats, see Entity Write File Format. */
  var lineItems: js.UndefOr[String] = js.undefined
}
object DownloadLineItemsResponse {
  
  inline def apply(): DownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadLineItemsResponse]
  }
  
  extension [Self <: DownloadLineItemsResponse](x: Self) {
    
    inline def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
  }
}
