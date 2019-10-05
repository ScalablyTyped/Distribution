package typings.naverDashWhale

import typings.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typings.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typings.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typings.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typings.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typings.chrome.chrome.omnibox.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofomnibox extends js.Object {
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent
  var onInputCancelled: OmniboxInputCancelledEvent
  var onInputChanged: OmniboxInputChangedEvent
  var onInputEntered: OmniboxInputEnteredEvent
  var onInputStarted: OmniboxInputStartedEvent
  def setDefaultSuggestion(suggestion: Suggestion): Unit
}

object Typeofomnibox {
  @scala.inline
  def apply(
    onDeleteSuggestion: OmniboxSuggestionDeletedEvent,
    onInputCancelled: OmniboxInputCancelledEvent,
    onInputChanged: OmniboxInputChangedEvent,
    onInputEntered: OmniboxInputEnteredEvent,
    onInputStarted: OmniboxInputStartedEvent,
    setDefaultSuggestion: Suggestion => Unit
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion, onInputCancelled = onInputCancelled, onInputChanged = onInputChanged, onInputEntered = onInputEntered, onInputStarted = onInputStarted, setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
  
    __obj.asInstanceOf[Typeofomnibox]
  }
}

