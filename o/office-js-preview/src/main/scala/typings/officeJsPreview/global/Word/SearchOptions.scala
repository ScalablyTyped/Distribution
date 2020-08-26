package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the options to be included in a search operation.
  *
  * To learn more about how to use search options in the Word JavaScript APIs, read {@link https://docs.microsoft.com/office/dev/add-ins/word/search-option-guidance | Use search options to find text in your Word add-in}.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SearchOptions")
@js.native
class SearchOptions ()
  extends typings.officeJsPreview.Word.SearchOptions

/* static members */
@JSGlobal("Word.SearchOptions")
@js.native
object SearchOptions extends js.Object {
  /**
    * Create a new instance of Word.SearchOptions object
    */
  def newObject(context: ClientRequestContext): typings.officeJsPreview.Word.SearchOptions = js.native
}

