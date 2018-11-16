package typings
package nodeDashScheduleLib.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "Job")
@js.native
class Job protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: java.lang.String) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: JobCallback) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: java.lang.String, job: js.Function0[scala.Unit]) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: java.lang.String, job: JobCallback) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: JobCallback, job: js.Function0[scala.Unit]) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: JobCallback, job: JobCallback) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: java.lang.String, job: js.Function0[scala.Unit], callback: js.Function0[scala.Unit]) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: java.lang.String, job: JobCallback, callback: js.Function0[scala.Unit]) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: JobCallback, job: js.Function0[scala.Unit], callback: js.Function0[scala.Unit]) = this()
  /**
       * Use the function scheduleJob() to create new Job objects.
       *
       * @internal
       * @param name     either an optional name for this Job or this Job's callback
       * @param job      either this Job's callback or an optional callback function
       * @param callback optional callback that is executed right before the JobCallback
       */
  def this(name: JobCallback, job: JobCallback, callback: js.Function0[scala.Unit]) = this()
  val name: java.lang.String = js.native
  /**
       * cancel all pending Invocations of this Job.
       * @param reschedule whether to reschedule the canceled Invocations.
       */
  def cancel(): scala.Boolean = js.native
  /**
       * cancel all pending Invocations of this Job.
       * @param reschedule whether to reschedule the canceled Invocations.
       */
  def cancel(reschedule: scala.Boolean): scala.Boolean = js.native
  /**
       * cancel the next Invocation of this Job.
       * @param reschedule whether to reschedule the canceled Invocation.
       * @return whether cancelation was successful
       */
  def cancelNext(): scala.Boolean = js.native
  /**
       * cancel the next Invocation of this Job.
       * @param reschedule whether to reschedule the canceled Invocation.
       * @return whether cancelation was successful
       */
  def cancelNext(reschedule: scala.Boolean): scala.Boolean = js.native
  /**
       * run this Job immediately.
       */
  def invoke(): scala.Unit = js.native
  /** The Date on which this Job will be run next. */
  def nextInvocation(): stdLib.Date = js.native
  /** A list of all pending Invocations */
  def pendingInvocations(): js.Array[Invocation] = js.native
  /**
       * Changes the scheduling information for this Job.
       * @return whether the reschedule was successful
       */
  def reschedule(spec: java.lang.String): scala.Boolean = js.native
  /**
       * Changes the scheduling information for this Job.
       * @return whether the reschedule was successful
       */
  def reschedule(spec: RecurrenceRule): scala.Boolean = js.native
  /**
       * Changes the scheduling information for this Job.
       * @return whether the reschedule was successful
       */
  def reschedule(spec: scala.Double): scala.Boolean = js.native
  /** schedule this Job to be run on the specified date. */
  def runOnDate(date: stdLib.Date): scala.Unit = js.native
  /** set scheduling information */
  def schedule(date: java.lang.String): scala.Boolean = js.native
  /** set scheduling information */
  def schedule(date: scala.Double): scala.Boolean = js.native
  /** set scheduling information */
  def schedule(date: stdLib.Date): scala.Boolean = js.native
  /**
       * set the number of currently running Jobs.
       * @internal
       */
  def setTriggeredJobs(triggeredJobs: scala.Double): scala.Unit = js.native
  /**
       * removes an Invocation from this Job's tracking list. For internal use.
       * @internal
       * @return boolean whether the invocation was successful. Removing an Invocation that doesn't exist, returns false.
       */
  def stopTrackingInvocation(invocation: Invocation): scala.Boolean = js.native
  /**
       * Adds an Invocation to this job. For internal use.
       * @internal
       * @return whether the invocation could be added
       */
  def trackInvocation(invocation: Invocation): scala.Boolean = js.native
  /**
       * @internal
       * @return the number of currently running instances of this Job.
       */
  def triggeredJobs(): scala.Double = js.native
}

