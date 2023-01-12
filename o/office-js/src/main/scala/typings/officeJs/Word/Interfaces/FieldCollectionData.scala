package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `fieldCollection.toJSON()`. */
trait FieldCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[FieldData]] = js.undefined
}
object FieldCollectionData {
  
  inline def apply(): FieldCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[FieldData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FieldData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
