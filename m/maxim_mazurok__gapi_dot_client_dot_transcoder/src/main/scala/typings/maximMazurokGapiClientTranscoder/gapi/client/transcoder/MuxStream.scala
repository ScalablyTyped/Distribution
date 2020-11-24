package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuxStream extends js.Object {
  
  /** The container format. The default is `"mp4"` Supported container formats: - 'ts' - 'fmp4'- the corresponding file extension is `".m4s"` - 'mp4' - 'vtt' */
  var container: js.UndefOr[String] = js.native
  
  /** List of `ElementaryStream.key`s multiplexed in this stream. */
  var elementaryStreams: js.UndefOr[js.Array[String]] = js.native
  
  /** Encryption settings. */
  var encryption: js.UndefOr[Encryption] = js.native
  
  /**
    * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental
    * 10-digit zero-padded suffix starting from 0 before the extension, such as `"mux_stream0000000123.ts"`.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /** A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `".m3u8"` extension suffix. */
  var key: js.UndefOr[String] = js.native
  
  /** Segment settings for `"ts"`, `"fmp4"` and `"vtt"`. */
  var segmentSettings: js.UndefOr[SegmentSettings] = js.native
}
object MuxStream {
  
  @scala.inline
  def apply(): MuxStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuxStream]
  }
  
  @scala.inline
  implicit class MuxStreamOps[Self <: MuxStream] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setElementaryStreamsVarargs(value: String*): Self = this.set("elementaryStreams", js.Array(value :_*))
    
    @scala.inline
    def setElementaryStreams(value: js.Array[String]): Self = this.set("elementaryStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementaryStreams: Self = this.set("elementaryStreams", js.undefined)
    
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setSegmentSettings(value: SegmentSettings): Self = this.set("segmentSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentSettings: Self = this.set("segmentSettings", js.undefined)
  }
}
