package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemContext extends StObject {
  
  /**
    * Flag that indicates whether the item has been expanded or collapsed
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Binding context of the item
    */
  var itemContext: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Index of the expanded/collapsed item
    */
  var itemIndex: js.UndefOr[int] = js.undefined
}
object ItemContext {
  
  inline def apply(): ItemContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemContext]
  }
  
  extension [Self <: ItemContext](x: Self) {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setItemContext(value: js.Object): Self = StObject.set(x, "itemContext", value.asInstanceOf[js.Any])
    
    inline def setItemContextUndefined: Self = StObject.set(x, "itemContext", js.undefined)
    
    inline def setItemIndex(value: int): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
  }
}
