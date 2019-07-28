package typings.naverDashWhale.whaleNs.ttsEngineNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.ttsEngine")
@js.native
object ^ extends js.Object {
  var onPause: Event[js.Function0[Unit]] = js.native
  var onResume: Event[js.Function0[Unit]] = js.native
  var onSpeak: typings.chrome.chromeNs.ttsEngineNs.TtsEngineSpeakEvent = js.native
  var onStop: Event[js.Function0[Unit]] = js.native
}

