package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserProfilePhotos extends StObject {
  
  var photos: js.Array[js.Array[PhotoSize]]
  
  var total_count: Double
}
object UserProfilePhotos {
  
  inline def apply(photos: js.Array[js.Array[PhotoSize]], total_count: Double): UserProfilePhotos = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfilePhotos]
  }
  
  extension [Self <: UserProfilePhotos](x: Self) {
    
    inline def setPhotos(value: js.Array[js.Array[PhotoSize]]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosVarargs(value: js.Array[PhotoSize]*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
