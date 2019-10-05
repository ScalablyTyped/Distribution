package typings.nodeDashSchedule.nodeDashScheduleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "scheduleJob")
@js.native
object scheduleJob extends js.Object {
  def apply(name: String, rule: String, callback: JobCallback): Job = js.native
  def apply(name: String, rule: Double, callback: JobCallback): Job = js.native
  def apply(name: String, rule: RecurrenceRule, callback: JobCallback): Job = js.native
  def apply(name: String, rule: RecurrenceSpecDateRange, callback: JobCallback): Job = js.native
  def apply(name: String, rule: RecurrenceSpecObjLit, callback: JobCallback): Job = js.native
  def apply(name: String, rule: Date, callback: JobCallback): Job = js.native
  def apply(rule: String, callback: JobCallback): Job = js.native
  def apply(rule: Double, callback: JobCallback): Job = js.native
  def apply(rule: RecurrenceRule, callback: JobCallback): Job = js.native
  def apply(rule: RecurrenceSpecDateRange, callback: JobCallback): Job = js.native
  def apply(rule: RecurrenceSpecObjLit, callback: JobCallback): Job = js.native
  def apply(rule: Date, callback: JobCallback): Job = js.native
}

