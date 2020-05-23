package typings.nodeResque.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.nodeResque.anon.RTimestamp
import typings.nodeResque.nodeResqueStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Queue")
@js.native
class Queue protected () extends EventEmitter {
  def this(options: QueueOptions) = this()
  def this(options: QueueOptions, jobs: JobsHash) = this()
  def allDelayed(): js.Promise[js.Array[Double]] = js.native
  def allWorkingOn(): js.Promise[StringDictionary[WorkerStatus]] = js.native
  def cleanOldWorkers(age: Double): js.Promise[StringDictionary[ErrorPayload] | js.Object] = js.native
  def connect(): js.Promise[Unit] = js.native
  def del(queue: String, jobName: String): js.Promise[Double] = js.native
  def del(queue: String, jobName: String, args: js.Array[_]): js.Promise[Double] = js.native
  def del(queue: String, jobName: String, args: js.Array[_], count: Double): js.Promise[Double] = js.native
  def delDelayed(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
  def delDelayed(queue: String, jobName: String, args: js.Array[_]): js.Promise[js.Array[Double]] = js.native
  def delDelayed(queue: String, jobName: String, args: js.Array[_], count: Double): js.Promise[js.Array[Double]] = js.native
  def delLock(lockName: String): js.Promise[Double] = js.native
  def delQueue(queue: String): js.Promise[Unit] = js.native
  def delayedAt(timestamp: Double): js.Promise[RTimestamp] = js.native
  def encode(queue: String, jobName: String): String = js.native
  def encode(queue: String, jobName: String, args: js.Array[_]): String = js.native
  def end(): js.Promise[Unit] = js.native
  def enqueue(queue: String, jobName: String): js.Promise[Unit] = js.native
  def enqueue(queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
  def enqueueAt(timestamp: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
  def enqueueAt(timestamp: Double, queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
  def enqueueIn(milliseconds: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
  def enqueueIn(milliseconds: Double, queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
  def failed(start: Double, stop: Double): js.Promise[js.Array[ErrorPayload]] = js.native
  def failedCount(): js.Promise[Double] = js.native
  def forceCleanWorker(workerName: String): js.Promise[js.Array[ErrorPayload] | Unit] = js.native
  def length(queue: String): js.Promise[Double] = js.native
  def locks(): js.Promise[StringDictionary[String]] = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
  def queued(queue: String, start: Double, stop: Double): js.Promise[js.Array[Job[_]]] = js.native
  def queues(): js.Promise[js.Array[String]] = js.native
  def removeFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
  def retryAndRemoveFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
  def scheduledAt(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
  def scheduledAt(queue: String, jobName: String, args: js.Array[_]): js.Promise[js.Array[Double]] = js.native
  def stats(): js.Promise[_] = js.native
  def timestamps(): js.Promise[js.Array[Double]] = js.native
  def workers(): js.Promise[StringDictionary[String]] = js.native
  def workingOn(workerName: String, queues: js.Array[String]): js.Promise[WorkerStatus] = js.native
}

