package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slideMasterCollection.toJSON()`. */
trait SlideMasterCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlideMasterData]] = js.undefined
}
object SlideMasterCollectionData {
  
  inline def apply(): SlideMasterCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideMasterCollectionData]
  }
  
  extension [Self <: SlideMasterCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[SlideMasterData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideMasterData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
