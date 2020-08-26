package typings.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAutoAssign extends js.Object {
  var considerDependencies: js.UndefOr[Boolean] = js.native
  var excludeWorkerIds: js.UndefOr[js.Array[String]] = js.native
  var maxAssignedTaskCount: js.UndefOr[Double] = js.native
  var mode: String = js.native
  var team: js.UndefOr[String] = js.native
}

object TaskAutoAssign {
  @scala.inline
  def apply(mode: String): TaskAutoAssign = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAutoAssign]
  }
  @scala.inline
  implicit class TaskAutoAssignOps[Self <: TaskAutoAssign] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsiderDependencies(value: Boolean): Self = this.set("considerDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsiderDependencies: Self = this.set("considerDependencies", js.undefined)
    @scala.inline
    def setExcludeWorkerIdsVarargs(value: String*): Self = this.set("excludeWorkerIds", js.Array(value :_*))
    @scala.inline
    def setExcludeWorkerIds(value: js.Array[String]): Self = this.set("excludeWorkerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeWorkerIds: Self = this.set("excludeWorkerIds", js.undefined)
    @scala.inline
    def setMaxAssignedTaskCount(value: Double): Self = this.set("maxAssignedTaskCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAssignedTaskCount: Self = this.set("maxAssignedTaskCount", js.undefined)
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
  }
  
}

