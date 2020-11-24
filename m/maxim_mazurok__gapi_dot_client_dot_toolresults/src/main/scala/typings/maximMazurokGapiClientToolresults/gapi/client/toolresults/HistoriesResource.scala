package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientToolresults.anon.CallbackFields
import typings.maximMazurokGapiClientToolresults.anon.FieldsHistoryId
import typings.maximMazurokGapiClientToolresults.anon.FieldsKey
import typings.maximMazurokGapiClientToolresults.anon.FilterByName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoriesResource extends js.Object {
  
  /**
    * Creates a History. The returned History will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to
    * project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing project does not exist
    */
  def create(request: CallbackFields): Request[History] = js.native
  def create(request: FieldsKey, body: History): Request[History] = js.native
  
  var executions: ExecutionsResource = js.native
  
  /**
    * Gets a History. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the History does not exist
    */
  def get(): Request[History] = js.native
  def get(request: FieldsHistoryId): Request[History] = js.native
  
  /**
    * Lists Histories for a given Project. The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same
    * modification time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the History does not exist
    */
  def list(): Request[ListHistoriesResponse] = js.native
  def list(request: FilterByName): Request[ListHistoriesResponse] = js.native
}
