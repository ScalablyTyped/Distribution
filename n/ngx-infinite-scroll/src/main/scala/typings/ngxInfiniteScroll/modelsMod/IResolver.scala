package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResolver extends js.Object {
  
  var axis: js.Any = js.native
  
  var container: ContainerRef = js.native
  
  var isWindow: Boolean = js.native
}
object IResolver {
  
  @scala.inline
  def apply(axis: js.Any, container: ContainerRef, isWindow: Boolean): IResolver = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolver]
  }
  
  @scala.inline
  implicit class IResolverOps[Self <: IResolver] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: js.Any): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ContainerRef): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWindow(value: Boolean): Self = this.set("isWindow", value.asInstanceOf[js.Any])
  }
}
