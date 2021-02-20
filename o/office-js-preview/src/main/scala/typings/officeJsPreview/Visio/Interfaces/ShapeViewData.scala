package typings.officeJsPreview.Visio.Interfaces

import typings.officeJsPreview.Visio.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "shapeView.toJSON()". */
@js.native
trait ShapeViewData extends StObject {
  
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.native
}
object ShapeViewData {
  
  @scala.inline
  def apply(): ShapeViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewData]
  }
  
  @scala.inline
  implicit class ShapeViewDataMutableBuilder[Self <: ShapeViewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: Highlight): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
  }
}
