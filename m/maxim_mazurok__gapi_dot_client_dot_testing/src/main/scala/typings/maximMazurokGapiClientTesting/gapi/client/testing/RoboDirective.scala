package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoboDirective extends js.Object {
  
  /** Required. The type of action that Robo should perform on the specified element. */
  var actionType: js.UndefOr[String] = js.native
  
  /** The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name. */
  var inputText: js.UndefOr[String] = js.native
  
  /**
    * Required. The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
    * https://developer.android.com/guide/topics/resources/accessing-resources.html
    */
  var resourceName: js.UndefOr[String] = js.native
}
object RoboDirective {
  
  @scala.inline
  def apply(): RoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboDirective]
  }
  
  @scala.inline
  implicit class RoboDirectiveOps[Self <: RoboDirective] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: String): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setInputText(value: String): Self = this.set("inputText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputText: Self = this.set("inputText", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
}
