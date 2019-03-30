package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngineNs {
  type TtsEngineSpeakEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* utterance */ java.lang.String, 
      /* options */ chromeLib.chromeNs.ttsEngineNs.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ chromeLib.chromeNs.ttsNs.TtsEvent, scala.Unit], 
      scala.Unit
    ]
  ]
}
