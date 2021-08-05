package typings.officeJs.Visio.Interfaces

import typings.officeJs.Visio.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "shapeView.toJSON()". */
trait ShapeViewData extends StObject {
  
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.undefined
}
object ShapeViewData {
  
  inline def apply(): ShapeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewData]
  }
  
  extension [Self <: ShapeViewData](x: Self) {
    
    inline def setHighlight(value: Highlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
  }
}
