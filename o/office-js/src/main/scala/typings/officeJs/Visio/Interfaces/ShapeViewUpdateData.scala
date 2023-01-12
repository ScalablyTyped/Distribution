package typings.officeJs.Visio.Interfaces

import typings.officeJs.Visio.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeView object, for use in `shapeView.set({ ... })`. */
trait ShapeViewUpdateData extends StObject {
  
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.undefined
}
object ShapeViewUpdateData {
  
  inline def apply(): ShapeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeViewUpdateData] (val x: Self) extends AnyVal {
    
    inline def setHighlight(value: Highlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
  }
}
