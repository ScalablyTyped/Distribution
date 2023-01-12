package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customPropertyCollection.toJSON()`. */
trait CustomPropertyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
}
object CustomPropertyCollectionData {
  
  inline def apply(): CustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPropertyCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[CustomPropertyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CustomPropertyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
