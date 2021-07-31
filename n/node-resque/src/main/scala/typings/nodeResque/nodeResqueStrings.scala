package typings.nodeResque

import typings.nodeResque.mod.SchedulerEvent
import typings.nodeResque.mod.WorkerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeResqueStrings {
  
  @js.native
  sealed trait cleanStuckWorker
    extends StObject
       with SchedulerEvent
  @scala.inline
  def cleanStuckWorker: cleanStuckWorker = "cleanStuckWorker".asInstanceOf[cleanStuckWorker]
  
  @js.native
  sealed trait cleaning_worker
    extends StObject
       with WorkerEvent
  @scala.inline
  def cleaning_worker: cleaning_worker = "cleaning_worker".asInstanceOf[cleaning_worker]
  
  @js.native
  sealed trait end
    extends StObject
       with SchedulerEvent
       with WorkerEvent
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with SchedulerEvent
       with WorkerEvent
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failure
    extends StObject
       with WorkerEvent
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait job
    extends StObject
       with WorkerEvent
  @scala.inline
  def job: job = "job".asInstanceOf[job]
  
  @js.native
  sealed trait master
    extends StObject
       with SchedulerEvent
  @scala.inline
  def master: master = "master".asInstanceOf[master]
  
  @js.native
  sealed trait pause
    extends StObject
       with WorkerEvent
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait ping
    extends StObject
       with WorkerEvent
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait poll
    extends StObject
       with SchedulerEvent
       with WorkerEvent
  @scala.inline
  def poll: poll = "poll".asInstanceOf[poll]
  
  @js.native
  sealed trait reEnqueue
    extends StObject
       with WorkerEvent
  @scala.inline
  def reEnqueue: reEnqueue = "reEnqueue".asInstanceOf[reEnqueue]
  
  @js.native
  sealed trait start
    extends StObject
       with SchedulerEvent
       with WorkerEvent
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait success
    extends StObject
       with WorkerEvent
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait transferredJob
    extends StObject
       with SchedulerEvent
  @scala.inline
  def transferredJob: transferredJob = "transferredJob".asInstanceOf[transferredJob]
  
  @js.native
  sealed trait workingTimestamp
    extends StObject
       with SchedulerEvent
  @scala.inline
  def workingTimestamp: workingTimestamp = "workingTimestamp".asInstanceOf[workingTimestamp]
}
