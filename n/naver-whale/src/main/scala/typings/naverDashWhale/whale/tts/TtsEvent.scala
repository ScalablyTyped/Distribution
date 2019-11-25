package typings.naverDashWhale.whale.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtsEvent extends js.Object {
  /** Optional. The index of the current character in the utterance. */
  var charIndex: js.UndefOr[Double] = js.undefined
  /** Optional. The error description, if the event type is 'error'. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * The type can be 'start' as soon as speech has started, 'word' when a word boundary is reached, 'sentence' when a sentence boundary is reached, 'marker' when an SSML mark element is reached, 'end' when the end of the utterance is reached, 'interrupted' when the utterance is stopped or interrupted before reaching the end, 'cancelled' when it's removed from the queue before ever being synthesized, or 'error' when any other error occurs. When pausing speech, a 'pause' event is fired if a particular utterance is paused in the middle, and 'resume' if an utterance resumes speech. Note that pause and resume events may not fire if speech is paused in-between utterances.
    * One of: "start", "end", "word", "sentence", "marker", "interrupted", "cancelled", "error", "pause", or "resume"
    */
  var `type`: String
}

object TtsEvent {
  @scala.inline
  def apply(`type`: String, charIndex: Int | Double = null, errorMessage: String = null): TtsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (charIndex != null) __obj.updateDynamic("charIndex")(charIndex.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtsEvent]
  }
}

