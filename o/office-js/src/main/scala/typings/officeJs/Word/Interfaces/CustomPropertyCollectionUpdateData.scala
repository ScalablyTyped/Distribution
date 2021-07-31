package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomPropertyCollection object, for use in `customPropertyCollection.set({ ... })`. */
trait CustomPropertyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
}
object CustomPropertyCollectionUpdateData {
  
  @scala.inline
  def apply(): CustomPropertyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCollectionUpdateData]
  }
  
  @scala.inline
  implicit class CustomPropertyCollectionUpdateDataMutableBuilder[Self <: CustomPropertyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CustomPropertyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomPropertyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
