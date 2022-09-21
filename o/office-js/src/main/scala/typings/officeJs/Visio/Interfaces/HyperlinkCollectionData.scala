package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `hyperlinkCollection.toJSON()`. */
trait HyperlinkCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[HyperlinkData]] = js.undefined
}
object HyperlinkCollectionData {
  
  inline def apply(): HyperlinkCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkCollectionData]
  }
  
  extension [Self <: HyperlinkCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[HyperlinkData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: HyperlinkData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
