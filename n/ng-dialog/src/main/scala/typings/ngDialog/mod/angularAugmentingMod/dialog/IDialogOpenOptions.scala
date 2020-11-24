package typings.ngDialog.mod.angularAugmentingMod.dialog

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which are provided to open a dialog.
  */
@js.native
trait IDialogOpenOptions extends IDialogOptions {
  
  var bindToController: js.UndefOr[Boolean] = js.native
  
  var controller: js.UndefOr[String | js.Array[_] | js.Any] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  /**
    * Any serializable data that you want to be stored in the controller's dialog scope. ($scope.ngDialogData).
    * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
    */
  var data: js.UndefOr[String | js.Object | js.Array[_]] = js.native
  
  /**
    * An optional map of dependencies which should be injected into the controller. If any of these dependencies
    * are promises, ngDialog will wait for them all to be resolved or one to be rejected before the controller
    * is instantiated.
    */
  var resolve: js.UndefOr[StringDictionary[String | Function]] = js.native
  
  /**
    * Scope object that will be passed to dialog. If you use controller with separate $scope service this object will be passed to $scope.$parent param.
    */
  var scope: js.UndefOr[IDialogScope] = js.native
  
  var template: String = js.native
}
object IDialogOpenOptions {
  
  @scala.inline
  def apply(template: String): IDialogOpenOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOpenOptions]
  }
  
  @scala.inline
  implicit class IDialogOpenOptionsOps[Self <: IDialogOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindToController(value: Boolean): Self = this.set("bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindToController: Self = this.set("bindToController", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: js.Any*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setController(value: String | js.Array[_] | js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: String | js.Object | js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setResolve(value: StringDictionary[String | Function]): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setScope(value: IDialogScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
