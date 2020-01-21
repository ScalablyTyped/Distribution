package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeResque.nodeResqueStrings.start
  - typings.nodeResque.nodeResqueStrings.end
  - typings.nodeResque.nodeResqueStrings.cleaning_worker
  - typings.nodeResque.nodeResqueStrings.poll
  - typings.nodeResque.nodeResqueStrings.ping
  - typings.nodeResque.nodeResqueStrings.job
  - typings.nodeResque.nodeResqueStrings.reEnqueue
  - typings.nodeResque.nodeResqueStrings.success
  - typings.nodeResque.nodeResqueStrings.failure
  - typings.nodeResque.nodeResqueStrings.error
  - typings.nodeResque.nodeResqueStrings.pause
*/
trait WorkerEvent extends js.Object

object WorkerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleaning_worker: typings.nodeResque.nodeResqueStrings.cleaning_worker = this.cast("cleaning_worker")
  @scala.inline
  def end: typings.nodeResque.nodeResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typings.nodeResque.nodeResqueStrings.error = this.cast("error")
  @scala.inline
  def failure: typings.nodeResque.nodeResqueStrings.failure = this.cast("failure")
  @scala.inline
  def job: typings.nodeResque.nodeResqueStrings.job = this.cast("job")
  @scala.inline
  def pause: typings.nodeResque.nodeResqueStrings.pause = this.cast("pause")
  @scala.inline
  def ping: typings.nodeResque.nodeResqueStrings.ping = this.cast("ping")
  @scala.inline
  def poll: typings.nodeResque.nodeResqueStrings.poll = this.cast("poll")
  @scala.inline
  def reEnqueue: typings.nodeResque.nodeResqueStrings.reEnqueue = this.cast("reEnqueue")
  @scala.inline
  def start: typings.nodeResque.nodeResqueStrings.start = this.cast("start")
  @scala.inline
  def success: typings.nodeResque.nodeResqueStrings.success = this.cast("success")
}

