package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStream extends js.Object {
  
  // The direction. The possible values are inactive, sendOnly, receiveOnly, sendReceive.
  var direction: js.UndefOr[MediaDirection] = js.native
  
  // The media stream label.
  var label: js.UndefOr[NullableOption[String]] = js.native
  
  // The media type. The possible value are unknown, audio, video, videoBasedScreenSharing, data.
  var mediaType: js.UndefOr[Modality] = js.native
  
  // If the media is muted by the server.
  var serverMuted: js.UndefOr[Boolean] = js.native
  
  // The source ID.
  var sourceId: js.UndefOr[String] = js.native
}
object MediaStream {
  
  @scala.inline
  def apply(): MediaStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStream]
  }
  
  @scala.inline
  implicit class MediaStreamOps[Self <: MediaStream] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: MediaDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLabel(value: NullableOption[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setMediaType(value: Modality): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    
    @scala.inline
    def setServerMuted(value: Boolean): Self = this.set("serverMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerMuted: Self = this.set("serverMuted", js.undefined)
    
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
  }
}
