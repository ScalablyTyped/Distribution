package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestions[T] extends js.Object {
  /** Execute the action selected. Can be SearchMore or ForceResolve actions. */
  def executeSelectedAction(): scala.Unit
  /** Focus on the ForceResolve action above the suggestions. If not available then focus on SearchMore action. */
  def focusAboveSuggestions(): scala.Unit
  /** Focus on the SearchMore action below the suggestions. If not available then focus on ForceResolve action. */
  def focusBelowSuggestions(): scala.Unit
  /** Focus the SearchMore action button. */
  def focusSearchForMoreButton(): scala.Unit
  /** Whether it has any suggested actions like ForceResolve or SearchMore. */
  def hasSuggestedAction(): scala.Boolean
  /** Whether any of the suggested actions (ForceResolve or SearchMore) is selected. */
  def hasSuggestedActionSelected(): scala.Boolean
  /** Returns true if the event was handled, false otherwise. */
  def tryHandleKeyDown(keyCode: scala.Double, currentSuggestionIndex: scala.Double): scala.Boolean
}

