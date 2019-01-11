package typings
package nodeDashScheduleLib.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cancelJob(job: java.lang.String): scala.Boolean = js.native
  def cancelJob(job: nodeDashScheduleLib.nodeDashScheduleMod.Job): scala.Boolean = js.native
  def rescheduleJob(job: java.lang.String, spec: java.lang.String): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(job: java.lang.String, spec: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceRule): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(job: java.lang.String, spec: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecDateRange): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(job: java.lang.String, spec: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecObjLit): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(job: java.lang.String, spec: stdLib.Date): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(job: nodeDashScheduleLib.nodeDashScheduleMod.Job, spec: java.lang.String): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(
    job: nodeDashScheduleLib.nodeDashScheduleMod.Job,
    spec: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceRule
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(
    job: nodeDashScheduleLib.nodeDashScheduleMod.Job,
    spec: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecDateRange
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(
    job: nodeDashScheduleLib.nodeDashScheduleMod.Job,
    spec: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecObjLit
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def rescheduleJob(job: nodeDashScheduleLib.nodeDashScheduleMod.Job, spec: stdLib.Date): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    name: java.lang.String,
    rule: java.lang.String,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    name: java.lang.String,
    rule: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceRule,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    name: java.lang.String,
    rule: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecDateRange,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    name: java.lang.String,
    rule: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecObjLit,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    name: java.lang.String,
    rule: stdLib.Date,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(rule: java.lang.String, callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    rule: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceRule,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    rule: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecDateRange,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(
    rule: nodeDashScheduleLib.nodeDashScheduleMod.RecurrenceSpecObjLit,
    callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback
  ): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
  def scheduleJob(rule: stdLib.Date, callback: nodeDashScheduleLib.nodeDashScheduleMod.JobCallback): nodeDashScheduleLib.nodeDashScheduleMod.Job = js.native
}

