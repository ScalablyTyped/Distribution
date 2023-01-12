package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inlinePictureCollection.toJSON()`. */
trait InlinePictureCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
}
object InlinePictureCollectionData {
  
  inline def apply(): InlinePictureCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlinePictureCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[InlinePictureData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InlinePictureData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
