package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `styleCollection.toJSON()`. */
trait StyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[StyleData]] = js.undefined
}
object StyleCollectionData {
  
  inline def apply(): StyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[StyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: StyleData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
