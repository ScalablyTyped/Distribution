package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `sectionCollection.toJSON()`. */
trait SectionCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionData]] = js.undefined
}
object SectionCollectionData {
  
  inline def apply(): SectionCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionData]
  }
  
  extension [Self <: SectionCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[SectionData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SectionData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
