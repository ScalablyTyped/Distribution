package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementaryStream extends StObject {
  
  /** Encoding of an audio stream. */
  var audioStream: js.UndefOr[AudioStream] = js.undefined
  
  /** A unique key for this elementary stream. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Encoding of a text stream. For example, closed captions or subtitles. */
  var textStream: js.UndefOr[TextStream] = js.undefined
  
  /** Encoding of a video stream. */
  var videoStream: js.UndefOr[VideoStream] = js.undefined
}
object ElementaryStream {
  
  @scala.inline
  def apply(): ElementaryStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementaryStream]
  }
  
  @scala.inline
  implicit class ElementaryStreamMutableBuilder[Self <: ElementaryStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioStream(value: AudioStream): Self = StObject.set(x, "audioStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioStreamUndefined: Self = StObject.set(x, "audioStream", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTextStream(value: TextStream): Self = StObject.set(x, "textStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStreamUndefined: Self = StObject.set(x, "textStream", js.undefined)
    
    @scala.inline
    def setVideoStream(value: VideoStream): Self = StObject.set(x, "videoStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoStreamUndefined: Self = StObject.set(x, "videoStream", js.undefined)
  }
}
