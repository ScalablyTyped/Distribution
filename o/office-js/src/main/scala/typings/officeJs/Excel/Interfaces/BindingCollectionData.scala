package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `bindingCollection.toJSON()`. */
trait BindingCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[BindingData]] = js.undefined
}
object BindingCollectionData {
  
  @scala.inline
  def apply(): BindingCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingCollectionData]
  }
  
  @scala.inline
  implicit class BindingCollectionDataMutableBuilder[Self <: BindingCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BindingData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BindingData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
