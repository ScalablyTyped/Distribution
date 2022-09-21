package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkStrokeCollection.toJSON()`. */
trait InkStrokeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}
object InkStrokeCollectionData {
  
  inline def apply(): InkStrokeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeCollectionData]
  }
  
  extension [Self <: InkStrokeCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[InkStrokeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkStrokeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
