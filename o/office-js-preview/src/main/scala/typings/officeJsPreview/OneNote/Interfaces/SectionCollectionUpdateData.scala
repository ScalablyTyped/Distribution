package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SectionCollection object, for use in `sectionCollection.set({ ... })`. */
trait SectionCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionData]] = js.undefined
}
object SectionCollectionUpdateData {
  
  inline def apply(): SectionCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SectionData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SectionData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
