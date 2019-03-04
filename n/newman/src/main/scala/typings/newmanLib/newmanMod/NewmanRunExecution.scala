package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunExecution extends js.Object {
  var assertions: js.Array[NewmanRunExecutionAssertion]
  var item: NewmanRunExecutionItem
}

object NewmanRunExecution {
  @scala.inline
  def apply(assertions: js.Array[NewmanRunExecutionAssertion], item: NewmanRunExecutionItem): NewmanRunExecution = {
    val __obj = js.Dynamic.literal(assertions = assertions, item = item)
  
    __obj.asInstanceOf[NewmanRunExecution]
  }
}

