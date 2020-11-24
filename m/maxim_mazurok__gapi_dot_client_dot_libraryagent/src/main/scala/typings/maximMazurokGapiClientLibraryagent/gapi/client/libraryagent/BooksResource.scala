package typings.maximMazurokGapiClientLibraryagent.gapi.client.libraryagent

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLibraryagent.anon.Accesstoken
import typings.maximMazurokGapiClientLibraryagent.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooksResource extends js.Object {
  
  /**
    * Borrow a book from the library. Returns the book if it is borrowed successfully. Returns NOT_FOUND if the book does not exist in the library. Returns quota exceeded error if the
    * amount of books borrowed exceeds allocation quota in any dimensions.
    */
  def borrow(): Request[GoogleExampleLibraryagentV1Book] = js.native
  def borrow(request: Accesstoken): Request[GoogleExampleLibraryagentV1Book] = js.native
  
  /** Gets a book. Returns NOT_FOUND if the book does not exist. */
  def get(): Request[GoogleExampleLibraryagentV1Book] = js.native
  def get(request: Accesstoken): Request[GoogleExampleLibraryagentV1Book] = js.native
  
  /**
    * Lists books in a shelf. The order is unspecified but deterministic. Newly created books will not necessarily be added to the end of this list. Returns NOT_FOUND if the shelf does
    * not exist.
    */
  def list(): Request[GoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(request: Alt): Request[GoogleExampleLibraryagentV1ListBooksResponse] = js.native
  
  /**
    * Return a book to the library. Returns the book if it is returned to the library successfully. Returns error if the book does not belong to the library or the users didn't borrow
    * before.
    */
  def `return`(): Request[GoogleExampleLibraryagentV1Book] = js.native
  def `return`(request: Accesstoken): Request[GoogleExampleLibraryagentV1Book] = js.native
}
