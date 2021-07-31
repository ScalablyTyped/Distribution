package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputMediaPhoto
  extends StObject
     with InputMediaBase
     with InputMedia {
  
  var `type`: photo
}
object InputMediaPhoto {
  
  @scala.inline
  def apply(media: String): InputMediaPhoto = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("photo")
    __obj.asInstanceOf[InputMediaPhoto]
  }
  
  @scala.inline
  implicit class InputMediaPhotoMutableBuilder[Self <: InputMediaPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: photo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
