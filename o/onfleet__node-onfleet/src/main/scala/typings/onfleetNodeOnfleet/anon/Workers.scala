package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.workersMod.OnfleetWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workers extends js.Object {
  var workers: js.Array[OnfleetWorker]
}

object Workers {
  @scala.inline
  def apply(workers: js.Array[OnfleetWorker]): Workers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workers]
  }
}

