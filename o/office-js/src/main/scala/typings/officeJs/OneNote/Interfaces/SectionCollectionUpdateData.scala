package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SectionCollection object, for use in "sectionCollection.set({ ... })". */
@js.native
trait SectionCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionData]] = js.native
}
object SectionCollectionUpdateData {
  
  @scala.inline
  def apply(): SectionCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionUpdateData]
  }
  
  @scala.inline
  implicit class SectionCollectionUpdateDataMutableBuilder[Self <: SectionCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SectionData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SectionData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
