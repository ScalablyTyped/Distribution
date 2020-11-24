package typings.newman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewmanRunExecutionAssertion extends js.Object {
  
  var assertion: String = js.native
  
  var error: NewmanRunExecutionAssertionError = js.native
}
object NewmanRunExecutionAssertion {
  
  @scala.inline
  def apply(assertion: String, error: NewmanRunExecutionAssertionError): NewmanRunExecutionAssertion = {
    val __obj = js.Dynamic.literal(assertion = assertion.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunExecutionAssertion]
  }
  
  @scala.inline
  implicit class NewmanRunExecutionAssertionOps[Self <: NewmanRunExecutionAssertion] (val x: Self) extends AnyVal {
    
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
    def setAssertion(value: String): Self = this.set("assertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: NewmanRunExecutionAssertionError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
