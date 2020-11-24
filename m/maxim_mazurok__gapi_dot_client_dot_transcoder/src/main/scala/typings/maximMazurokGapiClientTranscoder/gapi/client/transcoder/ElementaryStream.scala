package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementaryStream extends js.Object {
  
  /** Encoding of an audio stream. */
  var audioStream: js.UndefOr[AudioStream] = js.native
  
  /** A unique key for this elementary stream. */
  var key: js.UndefOr[String] = js.native
  
  /** Encoding of a text stream. For example, closed captions or subtitles. */
  var textStream: js.UndefOr[TextStream] = js.native
  
  /** Encoding of a video stream. */
  var videoStream: js.UndefOr[VideoStream] = js.native
}
object ElementaryStream {
  
  @scala.inline
  def apply(): ElementaryStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementaryStream]
  }
  
  @scala.inline
  implicit class ElementaryStreamOps[Self <: ElementaryStream] (val x: Self) extends AnyVal {
    
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
    def setAudioStream(value: AudioStream): Self = this.set("audioStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioStream: Self = this.set("audioStream", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setTextStream(value: TextStream): Self = this.set("textStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStream: Self = this.set("textStream", js.undefined)
    
    @scala.inline
    def setVideoStream(value: VideoStream): Self = this.set("videoStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoStream: Self = this.set("videoStream", js.undefined)
  }
}
