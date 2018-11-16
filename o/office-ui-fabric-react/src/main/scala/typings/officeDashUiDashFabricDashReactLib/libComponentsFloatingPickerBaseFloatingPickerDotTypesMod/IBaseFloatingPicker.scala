package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseFloatingPicker extends js.Object {
  /** Gets the input text */
  var inputText: java.lang.String = js.native
  /** Whether the suggestions are shown */
  var isSuggestionsShown: scala.Boolean = js.native
  /** Gets the suggestions */
  var suggestions: js.Array[_] = js.native
  /** Hides the picker */
  def hidePicker(): scala.Unit = js.native
  /** On queryString changed */
  def onQueryStringChanged(input: java.lang.String): scala.Unit = js.native
  /** Shows the picker
       * @param updateValue - Optional param to indicate whether to update the query string
       */
  def showPicker(): scala.Unit = js.native
  /** Shows the picker
       * @param updateValue - Optional param to indicate whether to update the query string
       */
  def showPicker(updateValue: scala.Boolean): scala.Unit = js.native
}

