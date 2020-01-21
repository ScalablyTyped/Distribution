package typings.nodeSchedule.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "Job")
@js.native
class Job protected () extends EventEmitter {
  /**
    * Use the function scheduleJob() to create new Job objects.
    *
    * @internal
    * @param name     either an optional name for this Job or this Job's callback
    * @param job      either this Job's callback or an optional callback function
    * @param callback optional callback that is executed right before the JobCallback
    */
  def this(name: String) = this()
  def this(name: JobCallback) = this()
  def this(name: String, job: js.Function0[Unit]) = this()
  def this(name: String, job: JobCallback) = this()
  def this(name: JobCallback, job: js.Function0[Unit]) = this()
  def this(name: JobCallback, job: JobCallback) = this()
  def this(name: String, job: js.Function0[Unit], callback: js.Function0[Unit]) = this()
  def this(name: String, job: JobCallback, callback: js.Function0[Unit]) = this()
  def this(name: JobCallback, job: js.Function0[Unit], callback: js.Function0[Unit]) = this()
  def this(name: JobCallback, job: JobCallback, callback: js.Function0[Unit]) = this()
  val name: String = js.native
  /**
    * cancel all pending Invocations of this Job.
    * @param reschedule whether to reschedule the canceled Invocations.
    */
  def cancel(): Boolean = js.native
  def cancel(reschedule: Boolean): Boolean = js.native
  /**
    * cancel the next Invocation of this Job.
    * @param reschedule whether to reschedule the canceled Invocation.
    * @return whether cancelation was successful
    */
  def cancelNext(): Boolean = js.native
  def cancelNext(reschedule: Boolean): Boolean = js.native
  /**
    * run this Job immediately.
    */
  def invoke(): Unit = js.native
  /** The Date on which this Job will be run next. */
  def nextInvocation(): Date = js.native
  /** A list of all pending Invocations */
  def pendingInvocations(): js.Array[Invocation] = js.native
  def reschedule(spec: String): Boolean = js.native
  def reschedule(spec: Double): Boolean = js.native
  /**
    * Changes the scheduling information for this Job.
    * @return whether the reschedule was successful
    */
  def reschedule(spec: RecurrenceRule): Boolean = js.native
  /** schedule this Job to be run on the specified date. */
  def runOnDate(date: Date): Unit = js.native
  def schedule(date: String): Boolean = js.native
  def schedule(date: Double): Boolean = js.native
  /** set scheduling information */
  def schedule(date: Date): Boolean = js.native
  /**
    * set the number of currently running Jobs.
    * @internal
    */
  def setTriggeredJobs(triggeredJobs: Double): Unit = js.native
  /**
    * removes an Invocation from this Job's tracking list. For internal use.
    * @internal
    * @return boolean whether the invocation was successful. Removing an Invocation that doesn't exist, returns false.
    */
  def stopTrackingInvocation(invocation: Invocation): Boolean = js.native
  /**
    * Adds an Invocation to this job. For internal use.
    * @internal
    * @return whether the invocation could be added
    */
  def trackInvocation(invocation: Invocation): Boolean = js.native
  /**
    * @internal
    * @return the number of currently running instances of this Job.
    */
  def triggeredJobs(): Double = js.native
}

