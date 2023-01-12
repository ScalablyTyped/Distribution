package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `timelineStyleCollection.toJSON()`. */
trait TimelineStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TimelineStyleData]] = js.undefined
}
object TimelineStyleCollectionData {
  
  inline def apply(): TimelineStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineStyleCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[TimelineStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TimelineStyleData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
