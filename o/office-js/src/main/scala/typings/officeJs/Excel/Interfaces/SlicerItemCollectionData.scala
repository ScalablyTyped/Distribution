package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerItemCollection.toJSON()`. */
trait SlicerItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
}
object SlicerItemCollectionData {
  
  inline def apply(): SlicerItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlicerItemCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlicerItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlicerItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
