package typings.officeUiFabricReact.shallowUntilTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShallowUntilTarget extends js.Object {
  
  var maxTries: Double = js.native
  
  var shallowOptions: IShallowRendererProps = js.native
}
object IShallowUntilTarget {
  
  @scala.inline
  def apply(maxTries: Double, shallowOptions: IShallowRendererProps): IShallowUntilTarget = {
    val __obj = js.Dynamic.literal(maxTries = maxTries.asInstanceOf[js.Any], shallowOptions = shallowOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShallowUntilTarget]
  }
  
  @scala.inline
  implicit class IShallowUntilTargetOps[Self <: IShallowUntilTarget] (val x: Self) extends AnyVal {
    
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
    def setMaxTries(value: Double): Self = this.set("maxTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShallowOptions(value: IShallowRendererProps): Self = this.set("shallowOptions", value.asInstanceOf[js.Any])
  }
}
