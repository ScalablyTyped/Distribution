package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customPropertyCollection.toJSON()`. */
@js.native
trait CustomPropertyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomPropertyData]] = js.native
}
object CustomPropertyCollectionData {
  
  @scala.inline
  def apply(): CustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCollectionData]
  }
  
  @scala.inline
  implicit class CustomPropertyCollectionDataMutableBuilder[Self <: CustomPropertyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CustomPropertyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomPropertyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
