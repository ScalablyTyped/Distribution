package typings.ngTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controller extends js.Object {
  
  var controller: String = js.native
  
  var controllerAs: String = js.native
  
  var replace: Boolean = js.native
  
  var restrict: String = js.native
  
  var scope: Boolean = js.native
  
  var templateUrl: js.Any = js.native
}
object Controller {
  
  @scala.inline
  def apply(
    controller: String,
    controllerAs: String,
    replace: Boolean,
    restrict: String,
    scope: Boolean,
    templateUrl: js.Any
  ): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], controllerAs = controllerAs.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], restrict = restrict.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  
  @scala.inline
  implicit class ControllerOps[Self <: Controller] (val x: Self) extends AnyVal {
    
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
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrict(value: String): Self = this.set("restrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Boolean): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrl(value: js.Any): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
  }
}
