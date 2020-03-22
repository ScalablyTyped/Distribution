package typings.officeUiFabricReact.baseFloatingPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseFloatingPicker extends js.Object {
  /** Gets the input text */
  var inputText: String = js.native
  /** Whether the suggestions are shown */
  var isSuggestionsShown: Boolean = js.native
  /** Gets the suggestions */
  var suggestions: js.Array[_] = js.native
  /** Hides the picker */
  def hidePicker(): Unit = js.native
  /** On queryString changed */
  def onQueryStringChanged(input: String): Unit = js.native
  /** Shows the picker
    * @param updateValue - Optional param to indicate whether to update the query string
    */
  def showPicker(): Unit = js.native
  def showPicker(updateValue: Boolean): Unit = js.native
}

