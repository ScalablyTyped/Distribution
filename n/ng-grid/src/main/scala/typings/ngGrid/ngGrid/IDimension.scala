package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDimension extends js.Object {
  
  var autoFitHeight: js.UndefOr[Boolean] = js.native
  
  var outerHeight: js.UndefOr[Double] = js.native
  
  var outerWidth: js.UndefOr[Double] = js.native
}
object IDimension {
  
  @scala.inline
  def apply(): IDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDimension]
  }
  
  @scala.inline
  implicit class IDimensionOps[Self <: IDimension] (val x: Self) extends AnyVal {
    
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
    def setAutoFitHeight(value: Boolean): Self = this.set("autoFitHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFitHeight: Self = this.set("autoFitHeight", js.undefined)
    
    @scala.inline
    def setOuterHeight(value: Double): Self = this.set("outerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterHeight: Self = this.set("outerHeight", js.undefined)
    
    @scala.inline
    def setOuterWidth(value: Double): Self = this.set("outerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterWidth: Self = this.set("outerWidth", js.undefined)
  }
}
