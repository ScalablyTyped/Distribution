package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoSize
  extends StObject
     with FileBase {
  
  var height: Double
  
  var width: Double
}
object PhotoSize {
  
  @scala.inline
  def apply(file_id: String, height: Double, width: Double): PhotoSize = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSize]
  }
  
  @scala.inline
  implicit class PhotoSizeMutableBuilder[Self <: PhotoSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
