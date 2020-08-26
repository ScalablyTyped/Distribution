package typings.newman.mod

import typings.newman.anon.Assertions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRun extends js.Object {
  var executions: js.Array[NewmanRunExecution] = js.native
  var failures: js.Array[NewmanRunFailure] = js.native
  var stats: Assertions = js.native
}

object NewmanRun {
  @scala.inline
  def apply(executions: js.Array[NewmanRunExecution], failures: js.Array[NewmanRunFailure], stats: Assertions): NewmanRun = {
    val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRun]
  }
  @scala.inline
  implicit class NewmanRunOps[Self <: NewmanRun] (val x: Self) extends AnyVal {
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
    def setExecutionsVarargs(value: NewmanRunExecution*): Self = this.set("executions", js.Array(value :_*))
    @scala.inline
    def setExecutions(value: js.Array[NewmanRunExecution]): Self = this.set("executions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailuresVarargs(value: NewmanRunFailure*): Self = this.set("failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: js.Array[NewmanRunFailure]): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Assertions): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

