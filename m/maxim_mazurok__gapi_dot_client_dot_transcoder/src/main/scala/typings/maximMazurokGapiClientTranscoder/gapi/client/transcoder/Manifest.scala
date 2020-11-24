package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest extends js.Object {
  
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
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setMuxStreamsVarargs(value: String*): Self = this.set("muxStreams", js.Array(value :_*))
    
    @scala.inline
    def setMuxStreams(value: js.Array[String]): Self = this.set("muxStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuxStreams: Self = this.set("muxStreams", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
