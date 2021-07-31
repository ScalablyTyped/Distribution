package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoboDirective extends StObject {
  
  /** Required. The type of action that Robo should perform on the specified element. */
  var actionType: js.UndefOr[String] = js.undefined
  
  /** The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name. */
  var inputText: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc:
    * https://developer.android.com/guide/topics/resources/accessing-resources.html
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object RoboDirective {
  
  @scala.inline
  def apply(): RoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboDirective]
  }
  
  @scala.inline
  implicit class RoboDirectiveMutableBuilder[Self <: RoboDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setInputText(value: String): Self = StObject.set(x, "inputText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTextUndefined: Self = StObject.set(x, "inputText", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
