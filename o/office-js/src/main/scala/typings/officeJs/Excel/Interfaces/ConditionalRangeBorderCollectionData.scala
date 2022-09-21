package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalRangeBorderCollection.toJSON()`. */
trait ConditionalRangeBorderCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
}
object ConditionalRangeBorderCollectionData {
  
  inline def apply(): ConditionalRangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderCollectionData]
  }
  
  extension [Self <: ConditionalRangeBorderCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[ConditionalRangeBorderData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ConditionalRangeBorderData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
