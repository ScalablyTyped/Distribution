package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionModel[T] extends js.Object {
  /** Aria-label string for each suggested item. */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /** The suggested item of the type T */
  var item: T
  /** Whether the suggested item is selected or not. */
  var selected: scala.Boolean
}

