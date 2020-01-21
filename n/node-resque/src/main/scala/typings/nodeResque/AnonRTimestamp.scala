package typings.nodeResque

import typings.nodeResque.mod.Job
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRTimestamp extends js.Object {
  var rTimestamp: Double
  var tasks: js.Array[Job[_]]
}

object AnonRTimestamp {
  @scala.inline
  def apply(rTimestamp: Double, tasks: js.Array[Job[_]]): AnonRTimestamp = {
    val __obj = js.Dynamic.literal(rTimestamp = rTimestamp.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRTimestamp]
  }
}

