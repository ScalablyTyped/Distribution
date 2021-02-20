package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ @js.native
trait InputLocationMessageContent extends StObject {
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
}
object InputLocationMessageContent {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): InputLocationMessageContent = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLocationMessageContent]
  }
  
  @scala.inline
  implicit class InputLocationMessageContentMutableBuilder[Self <: InputLocationMessageContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
