package typings.onfleetNodeOnfleet.tasksMod

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
    completeAfterAfter: js.UndefOr[Double] = js.undefined,
    completeBeforeBefore: js.UndefOr[Double] = js.undefined,
    dependencies: String = null,
    lastId: String = null,
    state: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    worker: String = null
  ): TaskQueryParam = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (!js.isUndefined(completeAfterAfter)) __obj.updateDynamic("completeAfterAfter")(completeAfterAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(completeBeforeBefore)) __obj.updateDynamic("completeBeforeBefore")(completeBeforeBefore.get.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (lastId != null) __obj.updateDynamic("lastId")(lastId.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskQueryParam]
  }
}

