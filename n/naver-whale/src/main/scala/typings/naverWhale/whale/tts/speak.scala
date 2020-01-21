package typings.naverWhale.whale.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.speak")
@js.native
object speak extends js.Object {
  def apply(utterance: String): Unit = js.native
  def apply(utterance: String, callback: js.Function): Unit = js.native
  def apply(utterance: String, options: typings.chrome.chrome.tts.SpeakOptions): Unit = js.native
  def apply(utterance: String, options: typings.chrome.chrome.tts.SpeakOptions, callback: js.Function): Unit = js.native
}

