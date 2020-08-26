package typings.meteorSjobs.mod

import typings.meteorSjobs.meteorSjobsBooleans.`true`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobRunConfigObject extends js.Object {
  /** Run a callback function after scheduling the job. */
  var callback: js.UndefOr[js.Function2[/* error */ `true` | Null, /* result */ Job, _]] = js.native
  /** Provide your own date. This stacks with the in and on operator, and will be applied before they perform their operations. */
  var date: js.UndefOr[js.Function0[Date]] = js.native
  /** Will schedule the job at a later time, using the current time and your inputs to calculate the due time. */
  var in: js.UndefOr[CfgTimeObject] = js.native
  /** Overrides the current time with your inputs */
  var on: js.UndefOr[CfgTimeObject] = js.native
  /**
    * The default priority for each job is 0, if set to a positive integer, it will run ahead of other jobs.
    * If set to a negative integer, it will only run after all the zero or positive jobs have completed.
    */
  var priority: js.UndefOr[Double] = js.native
  /** If a job is marked as singular, it will only be scheduled if no other job is pending with the same arguments. */
  var singular: js.UndefOr[Boolean] = js.native
  /** If a job is marked as unique, it will only be scheduled if no other job exists with the same arguments. */
  var unique: js.UndefOr[Boolean] = js.native
}

object JobRunConfigObject {
  @scala.inline
  def apply(): JobRunConfigObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobRunConfigObject]
  }
  @scala.inline
  implicit class JobRunConfigObjectOps[Self <: JobRunConfigObject] (val x: Self) extends AnyVal {
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
    def setCallback(value: (/* error */ `true` | Null, /* result */ Job) => _): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDate(value: () => Date): Self = this.set("date", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setIn(value: CfgTimeObject): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setOn(value: CfgTimeObject): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSingular(value: Boolean): Self = this.set("singular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

