package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStream extends StObject {
  
  /** The codec for this text stream. The default is `webvtt`. Supported text codecs: - `srt` - `ttml` - `cea608` - `cea708` - `webvtt` */
  var codec: js.UndefOr[String] = js.undefined
  
  /** The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`. */
  var mapping: js.UndefOr[js.Array[TextMapping]] = js.undefined
}
object TextStream {
  
  inline def apply(): TextStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStream] (val x: Self) extends AnyVal {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setMapping(value: js.Array[TextMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: TextMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
  }
}
