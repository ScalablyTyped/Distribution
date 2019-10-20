package typings.atOnfleetNodeDashOnfleet.resourcesTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueryParam extends js.Object {
  var completeAfterAfter: js.UndefOr[Double] = js.undefined
  var completeBeforeBefore: js.UndefOr[Double] = js.undefined
  var dependencies: js.UndefOr[String] = js.undefined
  var from: Double
  var lastId: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var worker: js.UndefOr[String] = js.undefined
}

object TaskQueryParam {
  @scala.inline
  def apply(
    from: Double,
    completeAfterAfter: Int | Double = null,
    completeBeforeBefore: Int | Double = null,
    dependencies: String = null,
    lastId: String = null,
    state: Int | Double = null,
    to: Int | Double = null,
    worker: String = null
  ): TaskQueryParam = {
    val __obj = js.Dynamic.literal(from = from)
    if (completeAfterAfter != null) __obj.updateDynamic("completeAfterAfter")(completeAfterAfter.asInstanceOf[js.Any])
    if (completeBeforeBefore != null) __obj.updateDynamic("completeBeforeBefore")(completeBeforeBefore.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (lastId != null) __obj.updateDynamic("lastId")(lastId)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[TaskQueryParam]
  }
}

