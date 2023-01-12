package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pointCollection.toJSON()`. */
trait PointCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PointData]] = js.undefined
}
object PointCollectionData {
  
  inline def apply(): PointCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PointData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PointData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
