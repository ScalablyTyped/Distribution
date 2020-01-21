package typings.nodeResque

import typings.nodeResque.mod.SchedulerEvent
import typings.nodeResque.mod.WorkerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeResqueStrings {
  @js.native
  sealed trait cleanStuckWorker extends SchedulerEvent
  
  @js.native
  sealed trait cleaning_worker extends WorkerEvent
  
  @js.native
  sealed trait end
    extends SchedulerEvent
       with WorkerEvent
  
  @js.native
  sealed trait error
    extends SchedulerEvent
       with WorkerEvent
  
  @js.native
  sealed trait failure extends WorkerEvent
  
  @js.native
  sealed trait job extends WorkerEvent
  
  @js.native
  sealed trait master extends SchedulerEvent
  
  @js.native
  sealed trait pause extends WorkerEvent
  
  @js.native
  sealed trait ping extends WorkerEvent
  
  @js.native
  sealed trait poll
    extends SchedulerEvent
       with WorkerEvent
  
  @js.native
  sealed trait reEnqueue extends WorkerEvent
  
  @js.native
  sealed trait start
    extends SchedulerEvent
       with WorkerEvent
  
  @js.native
  sealed trait success extends WorkerEvent
  
  @js.native
  sealed trait transferredJob extends SchedulerEvent
  
  @js.native
  sealed trait workingTimestamp extends SchedulerEvent
  
  @scala.inline
  def cleanStuckWorker: cleanStuckWorker = "cleanStuckWorker".asInstanceOf[cleanStuckWorker]
  @scala.inline
  def cleaning_worker: cleaning_worker = "cleaning_worker".asInstanceOf[cleaning_worker]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def job: job = "job".asInstanceOf[job]
  @scala.inline
  def master: master = "master".asInstanceOf[master]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def poll: poll = "poll".asInstanceOf[poll]
  @scala.inline
  def reEnqueue: reEnqueue = "reEnqueue".asInstanceOf[reEnqueue]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def transferredJob: transferredJob = "transferredJob".asInstanceOf[transferredJob]
  @scala.inline
  def workingTimestamp: workingTimestamp = "workingTimestamp".asInstanceOf[workingTimestamp]
}

