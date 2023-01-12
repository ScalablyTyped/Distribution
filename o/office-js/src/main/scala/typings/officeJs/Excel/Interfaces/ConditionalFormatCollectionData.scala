package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalFormatCollection.toJSON()`. */
trait ConditionalFormatCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
}
object ConditionalFormatCollectionData {
  
  inline def apply(): ConditionalFormatCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormatCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ConditionalFormatData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ConditionalFormatData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
