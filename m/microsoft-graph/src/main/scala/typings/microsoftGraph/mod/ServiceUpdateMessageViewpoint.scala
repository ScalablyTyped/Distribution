package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdateMessageViewpoint extends StObject {
  
  // Indicates whether the user archived the message.
  var isArchived: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the user marked the message as favorite.
  var isFavorited: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the user read the message.
  var isRead: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ServiceUpdateMessageViewpoint {
  
  inline def apply(): ServiceUpdateMessageViewpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdateMessageViewpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceUpdateMessageViewpoint] (val x: Self) extends AnyVal {
    
    inline def setIsArchived(value: NullableOption[Boolean]): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedNull: Self = StObject.set(x, "isArchived", null)
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setIsFavorited(value: NullableOption[Boolean]): Self = StObject.set(x, "isFavorited", value.asInstanceOf[js.Any])
    
    inline def setIsFavoritedNull: Self = StObject.set(x, "isFavorited", null)
    
    inline def setIsFavoritedUndefined: Self = StObject.set(x, "isFavorited", js.undefined)
    
    inline def setIsRead(value: NullableOption[Boolean]): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    inline def setIsReadNull: Self = StObject.set(x, "isRead", null)
    
    inline def setIsReadUndefined: Self = StObject.set(x, "isRead", js.undefined)
  }
}
