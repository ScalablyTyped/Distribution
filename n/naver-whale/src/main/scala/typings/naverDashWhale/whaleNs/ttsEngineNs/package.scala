package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngineNs {
  import typings.chrome.chromeNs.eventsNs.Event
  import typings.chrome.chromeNs.ttsNs.TtsEvent

  type TtsEngineSpeakEvent = Event[
    js.Function3[
      /* utterance */ String, 
      /* options */ typings.chrome.chromeNs.ttsEngineNs.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ TtsEvent, Unit], 
      Unit
    ]
  ]
}
