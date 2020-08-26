package typings.officeUiFabricReact.suggestionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestions[T] extends js.Object {
  /** Execute the action selected. Can be SearchMore or ForceResolve actions. */
  def executeSelectedAction(): Unit = js.native
  /** Focus on the ForceResolve action above the suggestions. If not available then focus on SearchMore action. */
  def focusAboveSuggestions(): Unit = js.native
  /** Focus on the SearchMore action below the suggestions. If not available then focus on ForceResolve action. */
  def focusBelowSuggestions(): Unit = js.native
  /** Focus the SearchMore action button. */
  def focusSearchForMoreButton(): Unit = js.native
  /** Whether it has any suggested actions like ForceResolve or SearchMore. */
  def hasSuggestedAction(): Boolean = js.native
  /** Whether any of the suggested actions (ForceResolve or SearchMore) is selected. */
  def hasSuggestedActionSelected(): Boolean = js.native
  /** Returns true if the event was handled, false otherwise. */
  def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean = js.native
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
  @scala.inline
  implicit class ISuggestionsOps[Self <: ISuggestions[_], T] (val x: Self with ISuggestions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecuteSelectedAction(value: () => Unit): Self = this.set("executeSelectedAction", js.Any.fromFunction0(value))
    @scala.inline
    def setFocusAboveSuggestions(value: () => Unit): Self = this.set("focusAboveSuggestions", js.Any.fromFunction0(value))
    @scala.inline
    def setFocusBelowSuggestions(value: () => Unit): Self = this.set("focusBelowSuggestions", js.Any.fromFunction0(value))
    @scala.inline
    def setFocusSearchForMoreButton(value: () => Unit): Self = this.set("focusSearchForMoreButton", js.Any.fromFunction0(value))
    @scala.inline
    def setHasSuggestedAction(value: () => Boolean): Self = this.set("hasSuggestedAction", js.Any.fromFunction0(value))
    @scala.inline
    def setHasSuggestedActionSelected(value: () => Boolean): Self = this.set("hasSuggestedActionSelected", js.Any.fromFunction0(value))
    @scala.inline
    def setTryHandleKeyDown(value: (Double, Double) => Boolean): Self = this.set("tryHandleKeyDown", js.Any.fromFunction2(value))
  }
  
}

