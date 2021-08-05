package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioChannel extends StObject {
  
  /** List of `Job.inputs` for this audio channel. */
  var inputs: js.UndefOr[js.Array[AudioChannelInput]] = js.undefined
}
object AudioChannel {
  
  inline def apply(): AudioChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioChannel]
  }
  
  extension [Self <: AudioChannel](x: Self) {
    
    inline def setInputs(value: js.Array[AudioChannelInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: AudioChannelInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
