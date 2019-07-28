package typings.naverDashWhale.whaleNs.ttsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts")
@js.native
object ^ extends js.Object {
  def getVoices(): Unit = js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[typings.chrome.chromeNs.ttsNs.TtsVoice], Unit]): Unit = js.native
  def isSpeaking(): Unit = js.native
  def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def speak(utterance: String): Unit = js.native
  def speak(utterance: String, callback: js.Function): Unit = js.native
  def speak(utterance: String, options: typings.chrome.chromeNs.ttsNs.SpeakOptions): Unit = js.native
  def speak(utterance: String, options: typings.chrome.chromeNs.ttsNs.SpeakOptions, callback: js.Function): Unit = js.native
  def stop(): Unit = js.native
}

