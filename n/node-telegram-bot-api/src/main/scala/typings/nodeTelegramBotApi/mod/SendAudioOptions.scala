package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAudioOptions extends SendBasicOptions {
  
  var caption: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var parse_mode: js.UndefOr[ParseMode] = js.native
  
  var performer: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SendAudioOptions {
  
  @scala.inline
  def apply(): SendAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAudioOptions]
  }
  
  @scala.inline
  implicit class SendAudioOptionsMutableBuilder[Self <: SendAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
    
    @scala.inline
    def setPerformer(value: String): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
