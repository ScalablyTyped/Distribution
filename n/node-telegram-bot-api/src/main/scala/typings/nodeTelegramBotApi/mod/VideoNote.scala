package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoNote
  extends StObject
     with FileBase {
  
  var duration: Double
  
  var length: Double
  
  var thumb: js.UndefOr[PhotoSize] = js.undefined
}
object VideoNote {
  
  @scala.inline
  def apply(duration: Double, file_id: String, length: Double): VideoNote = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoNote]
  }
  
  @scala.inline
  implicit class VideoNoteMutableBuilder[Self <: VideoNote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: PhotoSize): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
  }
}
