package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputMediaVideo
  extends InputMediaBase
     with InputMedia {
  
  var duration: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var supports_streaming: js.UndefOr[Boolean] = js.native
  
  var `type`: video = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object InputMediaVideo {
  
  @scala.inline
  def apply(media: String, `type`: video): InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaVideo]
  }
  
  @scala.inline
  implicit class InputMediaVideoMutableBuilder[Self <: InputMediaVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSupports_streaming(value: Boolean): Self = StObject.set(x, "supports_streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports_streamingUndefined: Self = StObject.set(x, "supports_streaming", js.undefined)
    
    @scala.inline
    def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
