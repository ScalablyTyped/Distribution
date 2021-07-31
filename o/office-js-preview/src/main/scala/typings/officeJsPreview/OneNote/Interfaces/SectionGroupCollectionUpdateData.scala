package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SectionGroupCollection object, for use in "sectionGroupCollection.set({ ... })". */
trait SectionGroupCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
}
object SectionGroupCollectionUpdateData {
  
  @scala.inline
  def apply(): SectionGroupCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupCollectionUpdateData]
  }
  
  @scala.inline
  implicit class SectionGroupCollectionUpdateDataMutableBuilder[Self <: SectionGroupCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SectionGroupData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SectionGroupData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
