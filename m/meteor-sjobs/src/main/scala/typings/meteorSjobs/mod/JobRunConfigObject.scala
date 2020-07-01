package typings.meteorSjobs.mod

import typings.meteorSjobs.meteorSjobsBooleans.`true`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRunConfigObject extends js.Object {
  /** Run a callback function after scheduling the job. */
  var callback: js.UndefOr[js.Function2[/* error */ `true` | Null, /* result */ Job, _]] = js.undefined
  /** Provide your own date. This stacks with the in and on operator, and will be applied before they perform their operations. */
  var date: js.UndefOr[js.Function0[Date]] = js.undefined
  /** Will schedule the job at a later time, using the current time and your inputs to calculate the due time. */
  var in: js.UndefOr[CfgTimeObject] = js.undefined
  /** Overrides the current time with your inputs */
  var on: js.UndefOr[CfgTimeObject] = js.undefined
  /**
    * The default priority for each job is 0, if set to a positive integer, it will run ahead of other jobs.
    * If set to a negative integer, it will only run after all the zero or positive jobs have completed.
    */
  var priority: js.UndefOr[Double] = js.undefined
  /** If a job is marked as singular, it will only be scheduled if no other job is pending with the same arguments. */
  var singular: js.UndefOr[Boolean] = js.undefined
  /** If a job is marked as unique, it will only be scheduled if no other job exists with the same arguments. */
  var unique: js.UndefOr[Boolean] = js.undefined
}

object JobRunConfigObject {
  @scala.inline
  def apply(
    callback: (/* error */ `true` | Null, /* result */ Job) => _ = null,
    date: () => Date = null,
    in: CfgTimeObject = null,
    on: CfgTimeObject = null,
    priority: js.UndefOr[Double] = js.undefined,
    singular: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): JobRunConfigObject = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (date != null) __obj.updateDynamic("date")(js.Any.fromFunction0(date))
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singular)) __obj.updateDynamic("singular")(singular.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRunConfigObject]
  }
}

