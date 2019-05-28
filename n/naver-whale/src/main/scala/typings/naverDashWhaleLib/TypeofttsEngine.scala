package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofttsEngine extends js.Object {
  var onPause: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  var onResume: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  var onSpeak: chromeLib.chromeNs.ttsEngineNs.TtsEngineSpeakEvent
  var onStop: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}

object TypeofttsEngine {
  @scala.inline
  def apply(
    onPause: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]],
    onResume: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]],
    onSpeak: chromeLib.chromeNs.ttsEngineNs.TtsEngineSpeakEvent,
    onStop: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  ): TypeofttsEngine = {
    val __obj = js.Dynamic.literal(onPause = onPause, onResume = onResume, onSpeak = onSpeak, onStop = onStop)
  
    __obj.asInstanceOf[TypeofttsEngine]
  }
}

