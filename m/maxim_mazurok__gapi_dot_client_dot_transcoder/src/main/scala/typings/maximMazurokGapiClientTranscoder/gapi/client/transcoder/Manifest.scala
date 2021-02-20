package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest extends StObject {
  
  /** The name of the generated file. The default is `"manifest"` with the extension suffix corresponding to the `Manifest.type`. */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Required. List of user given `MuxStream.key`s that should appear in this manifest. When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key` and `.m3u8` extension is
    * generated for each element of the `Manifest.mux_streams`.
    */
  var muxStreams: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Type of the manifest, can be "HLS" or "DASH". */
  var `type`: js.UndefOr[String] = js.native
}
object Manifest {
  
  @scala.inline
  def apply(): Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit class ManifestMutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setMuxStreams(value: js.Array[String]): Self = StObject.set(x, "muxStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuxStreamsUndefined: Self = StObject.set(x, "muxStreams", js.undefined)
    
    @scala.inline
    def setMuxStreamsVarargs(value: String*): Self = StObject.set(x, "muxStreams", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
