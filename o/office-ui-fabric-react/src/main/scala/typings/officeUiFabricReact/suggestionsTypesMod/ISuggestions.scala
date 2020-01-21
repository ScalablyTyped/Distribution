package typings.officeUiFabricReact.suggestionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestions[T] extends js.Object {
  /** Execute the action selected. Can be SearchMore or ForceResolve actions. */
  def executeSelectedAction(): Unit
  /** Focus on the ForceResolve action above the suggestions. If not available then focus on SearchMore action. */
  def focusAboveSuggestions(): Unit
  /** Focus on the SearchMore action below the suggestions. If not available then focus on ForceResolve action. */
  def focusBelowSuggestions(): Unit
  /** Focus the SearchMore action button. */
  def focusSearchForMoreButton(): Unit
  /** Whether it has any suggested actions like ForceResolve or SearchMore. */
  def hasSuggestedAction(): Boolean
  /** Whether any of the suggested actions (ForceResolve or SearchMore) is selected. */
  def hasSuggestedActionSelected(): Boolean
  /** Returns true if the event was handled, false otherwise. */
  def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean
}

object ISuggestions {
  @scala.inline
  def apply[T](
    executeSelectedAction: () => Unit,
    focusAboveSuggestions: () => Unit,
    focusBelowSuggestions: () => Unit,
    focusSearchForMoreButton: () => Unit,
    hasSuggestedAction: () => Boolean,
    hasSuggestedActionSelected: () => Boolean,
    tryHandleKeyDown: (Double, Double) => Boolean
  ): ISuggestions[T] = {
    val __obj = js.Dynamic.literal(executeSelectedAction = js.Any.fromFunction0(executeSelectedAction), focusAboveSuggestions = js.Any.fromFunction0(focusAboveSuggestions), focusBelowSuggestions = js.Any.fromFunction0(focusBelowSuggestions), focusSearchForMoreButton = js.Any.fromFunction0(focusSearchForMoreButton), hasSuggestedAction = js.Any.fromFunction0(hasSuggestedAction), hasSuggestedActionSelected = js.Any.fromFunction0(hasSuggestedActionSelected), tryHandleKeyDown = js.Any.fromFunction2(tryHandleKeyDown))
  
    __obj.asInstanceOf[ISuggestions[T]]
  }
}

