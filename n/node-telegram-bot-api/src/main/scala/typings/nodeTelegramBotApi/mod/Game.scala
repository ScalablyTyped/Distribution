package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Game extends StObject {
  
  var animation: js.UndefOr[Animation] = js.undefined
  
  var description: String
  
  var photo: js.Array[PhotoSize]
  
  var text: js.UndefOr[String] = js.undefined
  
  var text_entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  
  var title: String
}
object Game {
  
  inline def apply(description: String, photo: js.Array[PhotoSize], title: String): Game = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
  
  extension [Self <: Game](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setPhoto(value: js.Array[PhotoSize]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoVarargs(value: PhotoSize*): Self = StObject.set(x, "photo", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setText_entities(value: js.Array[MessageEntity]): Self = StObject.set(x, "text_entities", value.asInstanceOf[js.Any])
    
    inline def setText_entitiesUndefined: Self = StObject.set(x, "text_entities", js.undefined)
    
    inline def setText_entitiesVarargs(value: MessageEntity*): Self = StObject.set(x, "text_entities", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
