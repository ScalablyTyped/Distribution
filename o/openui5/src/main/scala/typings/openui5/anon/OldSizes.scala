package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldSizes extends StObject {
  
  /**
    * The ID of the splitter control. The splitter control can also be accessed by calling getSource() on the
    * event.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * An array of values representing the new (pixel-)sizes of the splitter contents
    */
  var newSizes: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * An array of values representing the old (pixel-)sizes of the splitter contents
    */
  var oldSizes: js.UndefOr[js.Array[int]] = js.undefined
}
object OldSizes {
  
  inline def apply(): OldSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldSizes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldSizes] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNewSizes(value: js.Array[int]): Self = StObject.set(x, "newSizes", value.asInstanceOf[js.Any])
    
    inline def setNewSizesUndefined: Self = StObject.set(x, "newSizes", js.undefined)
    
    inline def setNewSizesVarargs(value: int*): Self = StObject.set(x, "newSizes", js.Array(value*))
    
    inline def setOldSizes(value: js.Array[int]): Self = StObject.set(x, "oldSizes", value.asInstanceOf[js.Any])
    
    inline def setOldSizesUndefined: Self = StObject.set(x, "oldSizes", js.undefined)
    
    inline def setOldSizesVarargs(value: int*): Self = StObject.set(x, "oldSizes", js.Array(value*))
  }
}
