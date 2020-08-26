package typings.newman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRunExecutionAssertionError extends js.Object {
  var index: Double = js.native
  var message: String = js.native
  var name: String = js.native
  var stack: String = js.native
  var test: String = js.native
}

object NewmanRunExecutionAssertionError {
  @scala.inline
  def apply(index: Double, message: String, name: String, stack: String, test: String): NewmanRunExecutionAssertionError = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunExecutionAssertionError]
  }
  @scala.inline
  implicit class NewmanRunExecutionAssertionErrorOps[Self <: NewmanRunExecutionAssertionError] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: String): Self = this.set("test", value.asInstanceOf[js.Any])
  }
  
}

