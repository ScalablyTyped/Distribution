package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `listCollection.toJSON()`. */
trait ListCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ListData]] = js.undefined
}
object ListCollectionData {
  
  inline def apply(): ListCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ListData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ListData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
