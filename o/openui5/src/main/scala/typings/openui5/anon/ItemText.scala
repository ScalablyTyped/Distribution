package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemText extends StObject {
  
  /**
    * The currently clicked menu item.
    */
  var item: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The text of the currently clicked menu item.
    */
  var text: js.UndefOr[String] = js.undefined
}
object ItemText {
  
  inline def apply(): ItemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemText]
  }
  
  extension [Self <: ItemText](x: Self) {
    
    inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
