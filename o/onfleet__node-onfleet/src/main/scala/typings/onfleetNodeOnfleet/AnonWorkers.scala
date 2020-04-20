package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.workersMod.OnfleetWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkers extends js.Object {
  var workers: js.Array[OnfleetWorker]
}

object AnonWorkers {
  @scala.inline
  def apply(workers: js.Array[OnfleetWorker]): AnonWorkers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkers]
  }
}

