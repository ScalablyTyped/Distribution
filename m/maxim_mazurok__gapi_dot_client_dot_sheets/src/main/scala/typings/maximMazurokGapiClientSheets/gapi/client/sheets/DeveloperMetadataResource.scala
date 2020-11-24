package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import typings.maximMazurokGapiClientSheets.anon.Accesstoken
import typings.maximMazurokGapiClientSheets.anon.Alt
import typings.maximMazurokGapiClientSheets.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataResource extends js.Object {
  
  /** Returns the developer metadata with the specified ID. The caller must specify the spreadsheet ID and the developer metadata's unique metadataId. */
  def get(): typings.gapiClient.gapi.client.Request[DeveloperMetadata] = js.native
  def get(request: Accesstoken): typings.gapiClient.gapi.client.Request[DeveloperMetadata] = js.native
  
  /**
    * Returns all developer metadata matching the specified DataFilter. If the provided DataFilter represents a DeveloperMetadataLookup object, this will return all DeveloperMetadata
    * entries selected by it. If the DataFilter represents a location in a spreadsheet, this will return all developer metadata associated with locations intersecting that region.
    */
  def search(request: Alt): typings.gapiClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
  def search(request: Callback, body: SearchDeveloperMetadataRequest): typings.gapiClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
}
