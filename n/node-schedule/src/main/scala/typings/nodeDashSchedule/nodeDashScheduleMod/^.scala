package typings.nodeDashSchedule.nodeDashScheduleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cancelJob(job: String): Boolean = js.native
  def cancelJob(job: Job): Boolean = js.native
  def rescheduleJob(job: String, spec: String): Job = js.native
  def rescheduleJob(job: String, spec: RecurrenceRule): Job = js.native
  def rescheduleJob(job: String, spec: RecurrenceSpecDateRange): Job = js.native
  def rescheduleJob(job: String, spec: RecurrenceSpecObjLit): Job = js.native
  def rescheduleJob(job: String, spec: Date): Job = js.native
  def rescheduleJob(job: Job, spec: String): Job = js.native
  def rescheduleJob(job: Job, spec: RecurrenceRule): Job = js.native
  def rescheduleJob(job: Job, spec: RecurrenceSpecDateRange): Job = js.native
  def rescheduleJob(job: Job, spec: RecurrenceSpecObjLit): Job = js.native
  def rescheduleJob(job: Job, spec: Date): Job = js.native
  def scheduleJob(name: String, rule: String, callback: JobCallback): Job = js.native
  def scheduleJob(name: String, rule: Double, callback: JobCallback): Job = js.native
  def scheduleJob(name: String, rule: RecurrenceRule, callback: JobCallback): Job = js.native
  def scheduleJob(name: String, rule: RecurrenceSpecDateRange, callback: JobCallback): Job = js.native
  def scheduleJob(name: String, rule: RecurrenceSpecObjLit, callback: JobCallback): Job = js.native
  def scheduleJob(name: String, rule: Date, callback: JobCallback): Job = js.native
  def scheduleJob(rule: String, callback: JobCallback): Job = js.native
  def scheduleJob(rule: Double, callback: JobCallback): Job = js.native
  def scheduleJob(rule: RecurrenceRule, callback: JobCallback): Job = js.native
  def scheduleJob(rule: RecurrenceSpecDateRange, callback: JobCallback): Job = js.native
  def scheduleJob(rule: RecurrenceSpecObjLit, callback: JobCallback): Job = js.native
  def scheduleJob(rule: Date, callback: JobCallback): Job = js.native
}

