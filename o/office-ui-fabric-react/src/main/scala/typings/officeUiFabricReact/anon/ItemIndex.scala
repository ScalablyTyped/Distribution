package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemIndex extends StObject {
  
  var itemIndex: Double
}
object ItemIndex {
  
  inline def apply(itemIndex: Double): ItemIndex = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemIndex] (val x: Self) extends AnyVal {
    
    inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
  }
}
