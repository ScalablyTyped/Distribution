package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `selection.toJSON()`. */
trait SelectionData extends StObject {
  
  /**
    *
    * Gets the Shapes of the Selection. Read-only.
    *
    * [Api set:  1.1]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
}
object SelectionData {
  
  inline def apply(): SelectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionData] (val x: Self) extends AnyVal {
    
    inline def setShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: ShapeData*): Self = StObject.set(x, "shapes", js.Array(value*))
  }
}
