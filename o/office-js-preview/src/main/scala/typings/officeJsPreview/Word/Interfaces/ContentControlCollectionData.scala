package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `contentControlCollection.toJSON()`. */
trait ContentControlCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ContentControlData]] = js.undefined
}
object ContentControlCollectionData {
  
  inline def apply(): ContentControlCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ContentControlData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ContentControlData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
