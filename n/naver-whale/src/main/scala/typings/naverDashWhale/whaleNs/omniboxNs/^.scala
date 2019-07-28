package typings.naverDashWhale.whaleNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.omnibox")
@js.native
object ^ extends js.Object {
  var onDeleteSuggestion: typings.chrome.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent = js.native
  var onInputCancelled: typings.chrome.chromeNs.omniboxNs.OmniboxInputCancelledEvent = js.native
  var onInputChanged: typings.chrome.chromeNs.omniboxNs.OmniboxInputChangedEvent = js.native
  var onInputEntered: typings.chrome.chromeNs.omniboxNs.OmniboxInputEnteredEvent = js.native
  var onInputStarted: typings.chrome.chromeNs.omniboxNs.OmniboxInputStartedEvent = js.native
  def setDefaultSuggestion(suggestion: typings.chrome.chromeNs.omniboxNs.Suggestion): Unit = js.native
}

