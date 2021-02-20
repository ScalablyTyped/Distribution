package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Shape object, for use in "shape.set({ ... })". */
@js.native
trait ShapeUpdateData extends StObject {
  
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the view of the shape.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewUpdateData] = js.native
}
object ShapeUpdateData {
  
  @scala.inline
  def apply(): ShapeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeUpdateData]
  }
  
  @scala.inline
  implicit class ShapeUpdateDataMutableBuilder[Self <: ShapeUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setView(value: ShapeViewUpdateData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
