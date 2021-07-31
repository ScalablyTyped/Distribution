package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Accesstoken
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Alt
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineitemsResource extends StObject {
  
  /** Retrieves line items in CSV format. YouTube & partners line items are not supported. */
  def downloadlineitems(request: Accesstoken): Request[DownloadLineItemsResponse] = js.native
  def downloadlineitems(request: Alt, body: DownloadLineItemsRequest): Request[DownloadLineItemsResponse] = js.native
  
  def uploadlineitems(request: Alt, body: UploadLineItemsRequest): Request[UploadLineItemsResponse] = js.native
  /** Uploads line items in CSV format. YouTube & partners line items are not supported. */
  def uploadlineitems(request: Callback): Request[UploadLineItemsResponse] = js.native
}
