package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "pageCollection.toJSON()". */
trait PageCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PageData]] = js.undefined
}
object PageCollectionData {
  
  inline def apply(): PageCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCollectionData]
  }
  
  extension [Self <: PageCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[PageData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PageData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
