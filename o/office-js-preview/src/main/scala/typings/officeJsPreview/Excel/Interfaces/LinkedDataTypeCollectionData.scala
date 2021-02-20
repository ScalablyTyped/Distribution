package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedDataTypeCollection.toJSON()`. */
@js.native
trait LinkedDataTypeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[LinkedDataTypeData]] = js.native
}
object LinkedDataTypeCollectionData {
  
  @scala.inline
  def apply(): LinkedDataTypeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeCollectionData]
  }
  
  @scala.inline
  implicit class LinkedDataTypeCollectionDataMutableBuilder[Self <: LinkedDataTypeCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[LinkedDataTypeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: LinkedDataTypeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
