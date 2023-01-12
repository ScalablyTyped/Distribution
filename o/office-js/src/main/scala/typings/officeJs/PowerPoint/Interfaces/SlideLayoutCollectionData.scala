package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slideLayoutCollection.toJSON()`. */
trait SlideLayoutCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SlideLayoutData]] = js.undefined
}
object SlideLayoutCollectionData {
  
  inline def apply(): SlideLayoutCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideLayoutCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideLayoutCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[SlideLayoutData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SlideLayoutData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
