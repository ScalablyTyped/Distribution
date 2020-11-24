package typings.officeJsPreview.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the shape that raised the ShapeMouseEnter event.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeMouseEnterEventArgs extends js.Object {
  
  /**
    *
    * Gets the name of the page which has the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var pageName: String = js.native
  
  /**
    *
    * Gets the name of the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var shapeName: String = js.native
}
object ShapeMouseEnterEventArgs {
  
  @scala.inline
  def apply(pageName: String, shapeName: String): ShapeMouseEnterEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], shapeName = shapeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeMouseEnterEventArgs]
  }
  
  @scala.inline
  implicit class ShapeMouseEnterEventArgsOps[Self <: ShapeMouseEnterEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPageName(value: String): Self = this.set("pageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeName(value: String): Self = this.set("shapeName", value.asInstanceOf[js.Any])
  }
}
