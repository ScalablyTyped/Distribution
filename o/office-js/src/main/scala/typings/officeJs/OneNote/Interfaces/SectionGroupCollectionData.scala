package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `sectionGroupCollection.toJSON()`. */
trait SectionGroupCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
}
object SectionGroupCollectionData {
  
  inline def apply(): SectionGroupCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupCollectionData]
  }
  
  extension [Self <: SectionGroupCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[SectionGroupData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SectionGroupData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
