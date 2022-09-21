package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraphCollection.toJSON()`. */
trait ParagraphCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}
object ParagraphCollectionData {
  
  inline def apply(): ParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionData]
  }
  
  extension [Self <: ParagraphCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[ParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ParagraphData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
