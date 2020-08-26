package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.workersMod.OnfleetWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workers extends js.Object {
  var workers: js.Array[OnfleetWorker] = js.native
}

object Workers {
  @scala.inline
  def apply(workers: js.Array[OnfleetWorker]): Workers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workers]
  }
  @scala.inline
  implicit class WorkersOps[Self <: Workers] (val x: Self) extends AnyVal {
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
    def setWorkersVarargs(value: OnfleetWorker*): Self = this.set("workers", js.Array(value :_*))
    @scala.inline
    def setWorkers(value: js.Array[OnfleetWorker]): Self = this.set("workers", value.asInstanceOf[js.Any])
  }
  
}

