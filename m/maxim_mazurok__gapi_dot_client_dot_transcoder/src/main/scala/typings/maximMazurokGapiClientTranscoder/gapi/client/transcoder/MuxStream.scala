package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MuxStream extends StObject {
  
  /**
    * The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt` See also: [Supported input and
    * output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats)
    */
  var container: js.UndefOr[String] = js.undefined
  
  /** List of `ElementaryStream.key`s multiplexed in this stream. */
  var elementaryStreams: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental
    * 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Segment settings for `ts`, `fmp4` and `vtt`. */
  var segmentSettings: js.UndefOr[SegmentSettings] = js.undefined
}
object MuxStream {
  
  inline def apply(): MuxStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuxStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MuxStream] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setElementaryStreams(value: js.Array[String]): Self = StObject.set(x, "elementaryStreams", value.asInstanceOf[js.Any])
    
    inline def setElementaryStreamsUndefined: Self = StObject.set(x, "elementaryStreams", js.undefined)
    
    inline def setElementaryStreamsVarargs(value: String*): Self = StObject.set(x, "elementaryStreams", js.Array(value*))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSegmentSettings(value: SegmentSettings): Self = StObject.set(x, "segmentSettings", value.asInstanceOf[js.Any])
    
    inline def setSegmentSettingsUndefined: Self = StObject.set(x, "segmentSettings", js.undefined)
  }
}
