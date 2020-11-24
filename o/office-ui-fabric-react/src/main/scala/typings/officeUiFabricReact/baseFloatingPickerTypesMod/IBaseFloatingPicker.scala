package typings.officeUiFabricReact.baseFloatingPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseFloatingPicker extends js.Object {
  
  /** Hides the picker */
  def hidePicker(): Unit = js.native
  
  /** Gets the input text */
  var inputText: String = js.native
  
  /** Whether the suggestions are shown */
  var isSuggestionsShown: Boolean = js.native
  
  /** On queryString changed */
  def onQueryStringChanged(input: String): Unit = js.native
  
  /** Shows the picker
    * @param updateValue - Optional param to indicate whether to update the query string
    */
  def showPicker(): Unit = js.native
  def showPicker(updateValue: Boolean): Unit = js.native
  
  /** Gets the suggestions */
  var suggestions: js.Array[_] = js.native
}
