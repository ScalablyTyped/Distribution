package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioMapping extends StObject {
  
  /** Required. The `EditAtom.key` that references the atom with audio inputs in the `Job.edit_list`. */
  var atomKey: js.UndefOr[String] = js.undefined
  
  /** Audio volume control in dB. Negative values decrease volume, positive values increase. The default is 0. */
  var gainDb: js.UndefOr[Double] = js.undefined
  
  /** Required. The zero-based index of the channel in the input audio stream. */
  var inputChannel: js.UndefOr[Double] = js.undefined
  
  /** Required. The `Input.key` that identifies the input file. */
  var inputKey: js.UndefOr[String] = js.undefined
  
  /** Required. The zero-based index of the track in the input file. */
  var inputTrack: js.UndefOr[Double] = js.undefined
  
  /** Required. The zero-based index of the channel in the output audio stream. */
  var outputChannel: js.UndefOr[Double] = js.undefined
}
object AudioMapping {
  
  inline def apply(): AudioMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioMapping] (val x: Self) extends AnyVal {
    
    inline def setAtomKey(value: String): Self = StObject.set(x, "atomKey", value.asInstanceOf[js.Any])
    
    inline def setAtomKeyUndefined: Self = StObject.set(x, "atomKey", js.undefined)
    
    inline def setGainDb(value: Double): Self = StObject.set(x, "gainDb", value.asInstanceOf[js.Any])
    
    inline def setGainDbUndefined: Self = StObject.set(x, "gainDb", js.undefined)
    
    inline def setInputChannel(value: Double): Self = StObject.set(x, "inputChannel", value.asInstanceOf[js.Any])
    
    inline def setInputChannelUndefined: Self = StObject.set(x, "inputChannel", js.undefined)
    
    inline def setInputKey(value: String): Self = StObject.set(x, "inputKey", value.asInstanceOf[js.Any])
    
    inline def setInputKeyUndefined: Self = StObject.set(x, "inputKey", js.undefined)
    
    inline def setInputTrack(value: Double): Self = StObject.set(x, "inputTrack", value.asInstanceOf[js.Any])
    
    inline def setInputTrackUndefined: Self = StObject.set(x, "inputTrack", js.undefined)
    
    inline def setOutputChannel(value: Double): Self = StObject.set(x, "outputChannel", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelUndefined: Self = StObject.set(x, "outputChannel", js.undefined)
  }
}
