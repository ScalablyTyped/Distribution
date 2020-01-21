package typings.nodeResque.mod

import typings.node.eventsMod.EventEmitter
import typings.nodeResque.nodeResqueStrings.cleanStuckWorker
import typings.nodeResque.nodeResqueStrings.end
import typings.nodeResque.nodeResqueStrings.error
import typings.nodeResque.nodeResqueStrings.master
import typings.nodeResque.nodeResqueStrings.poll
import typings.nodeResque.nodeResqueStrings.start
import typings.nodeResque.nodeResqueStrings.transferredJob
import typings.nodeResque.nodeResqueStrings.workingTimestamp
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Scheduler")
@js.native
class Scheduler protected () extends EventEmitter {
  def this(options: SchedulerOptions) = this()
  def this(options: SchedulerOptions, jobs: JobsHash) = this()
  def connect(): js.Promise[Unit] = js.native
  def end(): js.Promise[Unit] = js.native
  @JSName("on")
  def on_cleanStuckWorker(
    event: cleanStuckWorker,
    cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_master(event: master, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_poll(event: poll, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("on")
  def on_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_cleanStuckWorker(
    event: cleanStuckWorker,
    cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_master(event: master, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_poll(event: poll, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("once")
  def once_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
  def removeAllListeners(event: SchedulerEvent): this.type = js.native
  def start(): js.Promise[Unit] = js.native
}

