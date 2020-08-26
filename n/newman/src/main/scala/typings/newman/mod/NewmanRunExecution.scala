package typings.newman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRunExecution extends js.Object {
  var assertions: js.Array[NewmanRunExecutionAssertion] = js.native
  var item: NewmanRunExecutionItem = js.native
}

object NewmanRunExecution {
  @scala.inline
  def apply(assertions: js.Array[NewmanRunExecutionAssertion], item: NewmanRunExecutionItem): NewmanRunExecution = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunExecution]
  }
  @scala.inline
  implicit class NewmanRunExecutionOps[Self <: NewmanRunExecution] (val x: Self) extends AnyVal {
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
    def setAssertionsVarargs(value: NewmanRunExecutionAssertion*): Self = this.set("assertions", js.Array(value :_*))
    @scala.inline
    def setAssertions(value: js.Array[NewmanRunExecutionAssertion]): Self = this.set("assertions", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: NewmanRunExecutionItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

