package typings.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPathRoutes extends js.Object {
  
  var current: js.UndefOr[String] = js.native
  
  var defined: IDictionary[IPathRoute] = js.native
  
  var previous: js.UndefOr[String] = js.native
  
  var rescue: js.UndefOr[js.Function] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object IPathRoutes {
  
  @scala.inline
  def apply(defined: IDictionary[IPathRoute]): IPathRoutes = {
    val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathRoutes]
  }
  
  @scala.inline
  implicit class IPathRoutesOps[Self <: IPathRoutes] (val x: Self) extends AnyVal {
    
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
    def setDefined(value: IDictionary[IPathRoute]): Self = this.set("defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setRescue(value: js.Function): Self = this.set("rescue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRescue: Self = this.set("rescue", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
