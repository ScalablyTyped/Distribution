package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ttsEngine {
  
  type TtsEngineSpeakEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* utterance */ java.lang.String, 
      /* options */ typings.chrome.chrome.ttsEngine.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ typings.chrome.chrome.tts.TtsEvent, scala.Unit], 
      scala.Unit
    ]
  ]
}
