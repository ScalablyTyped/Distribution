package typings.meteorSjobs.mod

import typings.meteorSjobs.meteorSjobsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("meteor/msavin:sjobs", "Jobs")
@js.native
class Jobs () extends js.Object

/* static members */
@JSImport("meteor/msavin:sjobs", "Jobs")
@js.native
object Jobs extends js.Object {
  /** Allows you to cancel a job if it has not run already. */
  def cancel(jobId: String): Unit = js.native
  /**
    * Allows you to clear all or some of the jobs in your database. It supports State for selecting a job state,
    *  You can add the name arguments to specify a specific queue. You can also call an optional callback.
    */
  def clear(state: State): Double = js.native
  def clear(state: State, name: js.UndefOr[scala.Nothing], cb: js.Function1[/* args */ js.Any, _]): Double = js.native
  def clear(state: State, name: String): Double = js.native
  def clear(state: State, name: String, cb: js.Function1[/* args */ js.Any, _]): Double = js.native
  /**
    * Allows you to configure how the package should work. You can figure one option or all of them.
    * All the options are pre-configured in ./package/server/imports/utilities/config.js.
    */
  def configure(options: Options): Unit = js.native
  /** Allows you to run a job ahead of its due date. It can only work on jobs that have not been resolved. */
  def execute(docId: String): Unit = js.native
  def find(args: js.Any*): `false` | Unit = js.native
  /**  allows you to get a job document by its document id. */
  def get(docId: String): Job = js.native
  /**
    * Allows you to register logic for a job. Once registered, the package will start a queue to look for and execute jobs
    *  as appropriate, and you will be able to run jobs with Jobs.run .
    */
  def register(job: JobDefinition): Unit = js.native
  /** Allows you to replicate a job. */
  def replicate(jobId: String): Unit = js.native
  def replicate(jobId: String, config: JobRunConfigObject): Unit = js.native
  /** Allows you to reschedule a job. It can only work on jobs that have not been resolved. */
  def reschedule(jobId: String): Unit = js.native
  def reschedule(jobId: String, config: JobRunConfigObject): Unit = js.native
  /**
    * Allows you to schedule a job to run. You call it by specifying the job name and its arguments.
    * At the end, you can pass in a special configuration object. Otherwise, it will be scheduled to run as soon as possible.
    */
  def run(jobname: String, args: js.Any*): Unit = js.native
  /**
    * Allows you start all the queues. If you call the function with no arguments, it will start all the queues.
    * If you pass in a string, it will start a queue with that name.
    * If you pass in an array, it will loop over the items in it, and treat them like a string.
    */
  def start(): Unit = js.native
  def start(queueName: String): Unit = js.native
  def start(queueName: js.Array[_]): Unit = js.native
  /**
    * Allows you stop all the queues. If you call the function with no arguments, it will stop all the queues.
    * If you pass in a string, it will stop a queue with that name.
    * If you pass in an array, it will loop over the items in it, and treat them like a string.
    */
  def stop(): Unit = js.native
  def stop(queueName: String): Unit = js.native
  def stop(queueName: js.Array[_]): Unit = js.native
}

