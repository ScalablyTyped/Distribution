package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomXmlPartCollection object, for use in `customXmlPartCollection.set({ ... })`. */
trait CustomXmlPartCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}
object CustomXmlPartCollectionUpdateData {
  
  @scala.inline
  def apply(): CustomXmlPartCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartCollectionUpdateData]
  }
  
  @scala.inline
  implicit class CustomXmlPartCollectionUpdateDataMutableBuilder[Self <: CustomXmlPartCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
