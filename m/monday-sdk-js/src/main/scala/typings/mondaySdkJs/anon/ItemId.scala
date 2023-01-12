package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mondaySdkJsStrings.columns
import typings.mondaySdkJs.mondaySdkJsStrings.updates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemId extends StObject {
  
  /**
    * The ID of the item to open
    */
  var itemId: Double
  
  /**
    * On which view to open the item card.
    * Can be "updates" / "columns"
    * Defaults to "columns"
    */
  var kind: js.UndefOr[updates | columns] = js.undefined
}
object ItemId {
  
  inline def apply(itemId: Double): ItemId = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemId] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: updates | columns): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
