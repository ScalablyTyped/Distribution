package typings.newman.newmanMod

import typings.newman.Anon_Assertions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRun extends js.Object {
  var executions: js.Array[NewmanRunExecution]
  var failures: js.Array[NewmanRunFailure]
  var stats: Anon_Assertions
}

object NewmanRun {
  @scala.inline
  def apply(
    executions: js.Array[NewmanRunExecution],
    failures: js.Array[NewmanRunFailure],
    stats: Anon_Assertions
  ): NewmanRun = {
    val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewmanRun]
  }
}

