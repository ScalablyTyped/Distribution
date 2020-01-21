package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeResque.nodeResqueStrings.start
  - typings.nodeResque.nodeResqueStrings.end
  - typings.nodeResque.nodeResqueStrings.poll
  - typings.nodeResque.nodeResqueStrings.master
  - typings.nodeResque.nodeResqueStrings.cleanStuckWorker
  - typings.nodeResque.nodeResqueStrings.error
  - typings.nodeResque.nodeResqueStrings.workingTimestamp
  - typings.nodeResque.nodeResqueStrings.transferredJob
*/
trait SchedulerEvent extends js.Object

object SchedulerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleanStuckWorker: typings.nodeResque.nodeResqueStrings.cleanStuckWorker = this.cast("cleanStuckWorker")
  @scala.inline
  def end: typings.nodeResque.nodeResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typings.nodeResque.nodeResqueStrings.error = this.cast("error")
  @scala.inline
  def master: typings.nodeResque.nodeResqueStrings.master = this.cast("master")
  @scala.inline
  def poll: typings.nodeResque.nodeResqueStrings.poll = this.cast("poll")
  @scala.inline
  def start: typings.nodeResque.nodeResqueStrings.start = this.cast("start")
  @scala.inline
  def transferredJob: typings.nodeResque.nodeResqueStrings.transferredJob = this.cast("transferredJob")
  @scala.inline
  def workingTimestamp: typings.nodeResque.nodeResqueStrings.workingTimestamp = this.cast("workingTimestamp")
}

