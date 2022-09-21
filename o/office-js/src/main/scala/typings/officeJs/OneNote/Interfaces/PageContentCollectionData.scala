package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageContentCollection.toJSON()`. */
trait PageContentCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PageContentData]] = js.undefined
}
object PageContentCollectionData {
  
  inline def apply(): PageContentCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentCollectionData]
  }
  
  extension [Self <: PageContentCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[PageContentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PageContentData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
