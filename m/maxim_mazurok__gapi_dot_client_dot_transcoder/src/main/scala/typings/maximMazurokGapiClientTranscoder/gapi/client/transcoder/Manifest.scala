package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  /** The name of the generated file. The default is `manifest` with the extension suffix corresponding to the `Manifest.type`. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. List of user given `MuxStream.key`s that should appear in this manifest. When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key` and `.m3u8` extension is
    * generated for each element of the `Manifest.mux_streams`.
    */
  var muxStreams: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Type of the manifest, can be `HLS` or `DASH`. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Manifest {
  
  inline def apply(): Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manifest]
  }
  
  extension [Self <: Manifest](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setMuxStreams(value: js.Array[String]): Self = StObject.set(x, "muxStreams", value.asInstanceOf[js.Any])
    
    inline def setMuxStreamsUndefined: Self = StObject.set(x, "muxStreams", js.undefined)
    
    inline def setMuxStreamsVarargs(value: String*): Self = StObject.set(x, "muxStreams", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
