package typings.atOnfleetNodeDashOnfleet.resourcesTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAutoAssign extends js.Object {
  var considerDependencies: js.UndefOr[Boolean] = js.undefined
  var excludeWorkerIds: js.UndefOr[js.Array[String]] = js.undefined
  var maxAssignedTaskCount: js.UndefOr[Double] = js.undefined
  var mode: String
  var team: js.UndefOr[String] = js.undefined
}

object TaskAutoAssign {
  @scala.inline
  def apply(
    mode: String,
    considerDependencies: js.UndefOr[Boolean] = js.undefined,
    excludeWorkerIds: js.Array[String] = null,
    maxAssignedTaskCount: Int | Double = null,
    team: String = null
  ): TaskAutoAssign = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(considerDependencies)) __obj.updateDynamic("considerDependencies")(considerDependencies.asInstanceOf[js.Any])
    if (excludeWorkerIds != null) __obj.updateDynamic("excludeWorkerIds")(excludeWorkerIds.asInstanceOf[js.Any])
    if (maxAssignedTaskCount != null) __obj.updateDynamic("maxAssignedTaskCount")(maxAssignedTaskCount.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAutoAssign]
  }
}

