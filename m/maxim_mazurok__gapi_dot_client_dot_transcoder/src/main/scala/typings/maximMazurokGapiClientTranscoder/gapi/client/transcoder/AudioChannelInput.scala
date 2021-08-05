package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioChannelInput extends StObject {
  
  /** Required. The zero-based index of the channel in the input file. */
  var channel: js.UndefOr[Double] = js.undefined
  
  /** Audio volume control in dB. Negative values decrease volume, positive values increase. The default is 0. */
  var gainDb: js.UndefOr[Double] = js.undefined
  
  /** Required. The `Input.key` that identifies the input file. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Required. The zero-based index of the track in the input file. */
  var track: js.UndefOr[Double] = js.undefined
}
object AudioChannelInput {
  
  inline def apply(): AudioChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioChannelInput]
  }
  
  extension [Self <: AudioChannelInput](x: Self) {
    
    inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setGainDb(value: Double): Self = StObject.set(x, "gainDb", value.asInstanceOf[js.Any])
    
    inline def setGainDbUndefined: Self = StObject.set(x, "gainDb", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTrack(value: Double): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
