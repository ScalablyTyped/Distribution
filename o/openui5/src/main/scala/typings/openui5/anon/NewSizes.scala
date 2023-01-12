package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewSizes extends StObject {
  
  /**
    * An array of values representing the new (pixel)sizes of the split panes, which are inside the pane container.
    */
  var newSizes: js.UndefOr[js.Array[float]] = js.undefined
  
  /**
    * An array of values representing the old (pixel)sizes of the split panes, which are inside the pane container.
    */
  var oldSizes: js.UndefOr[js.Array[float]] = js.undefined
}
object NewSizes {
  
  inline def apply(): NewSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewSizes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewSizes] (val x: Self) extends AnyVal {
    
    inline def setNewSizes(value: js.Array[float]): Self = StObject.set(x, "newSizes", value.asInstanceOf[js.Any])
    
    inline def setNewSizesUndefined: Self = StObject.set(x, "newSizes", js.undefined)
    
    inline def setNewSizesVarargs(value: float*): Self = StObject.set(x, "newSizes", js.Array(value*))
    
    inline def setOldSizes(value: js.Array[float]): Self = StObject.set(x, "oldSizes", value.asInstanceOf[js.Any])
    
    inline def setOldSizesUndefined: Self = StObject.set(x, "oldSizes", js.undefined)
    
    inline def setOldSizesVarargs(value: float*): Self = StObject.set(x, "oldSizes", js.Array(value*))
  }
}
