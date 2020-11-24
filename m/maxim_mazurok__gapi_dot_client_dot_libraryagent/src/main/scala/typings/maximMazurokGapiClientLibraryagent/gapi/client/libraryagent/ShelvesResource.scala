package typings.maximMazurokGapiClientLibraryagent.gapi.client.libraryagent

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLibraryagent.anon.Accesstoken
import typings.maximMazurokGapiClientLibraryagent.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShelvesResource extends js.Object {
  
  var books: BooksResource = js.native
  
  /** Gets a shelf. Returns NOT_FOUND if the shelf does not exist. */
  def get(): Request[GoogleExampleLibraryagentV1Shelf] = js.native
  def get(request: Accesstoken): Request[GoogleExampleLibraryagentV1Shelf] = js.native
  
  /** Lists shelves. The order is unspecified but deterministic. Newly created shelves will not necessarily be added to the end of this list. */
  def list(): Request[GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(request: Callback): Request[GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
}
