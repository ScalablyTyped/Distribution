package typings
package nodeDashScheduleLib.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cancelJob(job: java.lang.String): scala.Boolean = js.native
  def cancelJob(job: Job): scala.Boolean = js.native
  def rescheduleJob(job: java.lang.String, spec: java.lang.String): Job = js.native
  def rescheduleJob(job: java.lang.String, spec: RecurrenceRule): Job = js.native
  def rescheduleJob(job: java.lang.String, spec: RecurrenceSpecDateRange): Job = js.native
  def rescheduleJob(job: java.lang.String, spec: RecurrenceSpecObjLit): Job = js.native
  def rescheduleJob(job: java.lang.String, spec: stdLib.Date): Job = js.native
  def rescheduleJob(job: Job, spec: java.lang.String): Job = js.native
  def rescheduleJob(job: Job, spec: RecurrenceRule): Job = js.native
  def rescheduleJob(job: Job, spec: RecurrenceSpecDateRange): Job = js.native
  def rescheduleJob(job: Job, spec: RecurrenceSpecObjLit): Job = js.native
  def rescheduleJob(job: Job, spec: stdLib.Date): Job = js.native
  def scheduleJob(name: java.lang.String, rule: java.lang.String, callback: JobCallback): Job = js.native
  def scheduleJob(name: java.lang.String, rule: RecurrenceRule, callback: JobCallback): Job = js.native
  def scheduleJob(name: java.lang.String, rule: RecurrenceSpecDateRange, callback: JobCallback): Job = js.native
  def scheduleJob(name: java.lang.String, rule: RecurrenceSpecObjLit, callback: JobCallback): Job = js.native
  def scheduleJob(name: java.lang.String, rule: stdLib.Date, callback: JobCallback): Job = js.native
  def scheduleJob(rule: java.lang.String, callback: JobCallback): Job = js.native
  def scheduleJob(rule: RecurrenceRule, callback: JobCallback): Job = js.native
  def scheduleJob(rule: RecurrenceSpecDateRange, callback: JobCallback): Job = js.native
  def scheduleJob(rule: RecurrenceSpecObjLit, callback: JobCallback): Job = js.native
  def scheduleJob(rule: stdLib.Date, callback: JobCallback): Job = js.native
}

