package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetArgs
  extends StObject
     with AsyncCallback[Any] {
  
  var badges: js.UndefOr[js.Array[Badge]] = js.undefined
  
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  var destructiveBtnIndex: js.UndefOr[Double] = js.undefined
  
  var items: js.Array[String]
  
  var title: js.UndefOr[String] = js.undefined
}
object ShowActionSheetArgs {
  
  inline def apply(items: js.Array[String]): ShowActionSheetArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowActionSheetArgs] (val x: Self) extends AnyVal {
    
    inline def setBadges(value: js.Array[Badge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
    
    inline def setBadgesVarargs(value: Badge*): Self = StObject.set(x, "badges", js.Array(value*))
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setDestructiveBtnIndex(value: Double): Self = StObject.set(x, "destructiveBtnIndex", value.asInstanceOf[js.Any])
    
    inline def setDestructiveBtnIndexUndefined: Self = StObject.set(x, "destructiveBtnIndex", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
