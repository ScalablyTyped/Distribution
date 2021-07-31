package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "selection.toJSON()". */
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
  
  @scala.inline
  def apply(): SelectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionData]
  }
  
  @scala.inline
  implicit class SelectionDataMutableBuilder[Self <: SelectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = StObject.set(x, "shapes", js.Array(value :_*))
  }
}
