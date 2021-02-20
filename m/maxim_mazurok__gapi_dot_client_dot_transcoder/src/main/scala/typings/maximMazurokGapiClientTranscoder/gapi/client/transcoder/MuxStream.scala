package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuxStream extends StObject {
  
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
  implicit class MuxStreamMutableBuilder[Self <: MuxStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setElementaryStreams(value: js.Array[String]): Self = StObject.set(x, "elementaryStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementaryStreamsUndefined: Self = StObject.set(x, "elementaryStreams", js.undefined)
    
    @scala.inline
    def setElementaryStreamsVarargs(value: String*): Self = StObject.set(x, "elementaryStreams", js.Array(value :_*))
    
    @scala.inline
    def setEncryption(value: Encryption): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSegmentSettings(value: SegmentSettings): Self = StObject.set(x, "segmentSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentSettingsUndefined: Self = StObject.set(x, "segmentSettings", js.undefined)
  }
}
