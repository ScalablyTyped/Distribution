package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerCollection.toJSON()`. */
trait SlicerCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerData]] = js.undefined
}
object SlicerCollectionData {
  
  inline def apply(): SlicerCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlicerCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlicerData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlicerData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
