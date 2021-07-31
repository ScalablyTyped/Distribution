package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomXmlPartScopedCollection object, for use in `customXmlPartScopedCollection.set({ ... })`. */
trait CustomXmlPartScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}
object CustomXmlPartScopedCollectionUpdateData {
  
  @scala.inline
  def apply(): CustomXmlPartScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartScopedCollectionUpdateData]
  }
  
  @scala.inline
  implicit class CustomXmlPartScopedCollectionUpdateDataMutableBuilder[Self <: CustomXmlPartScopedCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
