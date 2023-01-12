package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedDataTypeCollection.toJSON()`. */
trait LinkedDataTypeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[LinkedDataTypeData]] = js.undefined
}
object LinkedDataTypeCollectionData {
  
  inline def apply(): LinkedDataTypeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedDataTypeCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[LinkedDataTypeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LinkedDataTypeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
