package typings.nodeDashResque.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashResque.nodeDashResqueStrings.start
  - typings.nodeDashResque.nodeDashResqueStrings.end
  - typings.nodeDashResque.nodeDashResqueStrings.cleaning_worker
  - typings.nodeDashResque.nodeDashResqueStrings.poll
  - typings.nodeDashResque.nodeDashResqueStrings.ping
  - typings.nodeDashResque.nodeDashResqueStrings.job
  - typings.nodeDashResque.nodeDashResqueStrings.reEnqueue
  - typings.nodeDashResque.nodeDashResqueStrings.success
  - typings.nodeDashResque.nodeDashResqueStrings.failure
  - typings.nodeDashResque.nodeDashResqueStrings.error
  - typings.nodeDashResque.nodeDashResqueStrings.pause
*/
trait WorkerEvent extends js.Object

object WorkerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleaning_worker: typings.nodeDashResque.nodeDashResqueStrings.cleaning_worker = this.cast("cleaning_worker")
  @scala.inline
  def end: typings.nodeDashResque.nodeDashResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typings.nodeDashResque.nodeDashResqueStrings.error = this.cast("error")
  @scala.inline
  def failure: typings.nodeDashResque.nodeDashResqueStrings.failure = this.cast("failure")
  @scala.inline
  def job: typings.nodeDashResque.nodeDashResqueStrings.job = this.cast("job")
  @scala.inline
  def pause: typings.nodeDashResque.nodeDashResqueStrings.pause = this.cast("pause")
  @scala.inline
  def ping: typings.nodeDashResque.nodeDashResqueStrings.ping = this.cast("ping")
  @scala.inline
  def poll: typings.nodeDashResque.nodeDashResqueStrings.poll = this.cast("poll")
  @scala.inline
  def reEnqueue: typings.nodeDashResque.nodeDashResqueStrings.reEnqueue = this.cast("reEnqueue")
  @scala.inline
  def start: typings.nodeDashResque.nodeDashResqueStrings.start = this.cast("start")
  @scala.inline
  def success: typings.nodeDashResque.nodeDashResqueStrings.success = this.cast("success")
}

