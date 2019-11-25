package typings.atOnfleetNodeDashOnfleet

import typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod.OnfleetWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Workers extends js.Object {
  var workers: js.Array[OnfleetWorker]
}

object Anon_Workers {
  @scala.inline
  def apply(workers: js.Array[OnfleetWorker]): Anon_Workers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Workers]
  }
}

