package typings.nodeResque.mod

import typings.node.eventsMod.EventEmitter
import typings.nodeResque.nodeResqueStrings.cleaning_worker
import typings.nodeResque.nodeResqueStrings.end
import typings.nodeResque.nodeResqueStrings.error
import typings.nodeResque.nodeResqueStrings.failure
import typings.nodeResque.nodeResqueStrings.job
import typings.nodeResque.nodeResqueStrings.pause
import typings.nodeResque.nodeResqueStrings.ping
import typings.nodeResque.nodeResqueStrings.poll
import typings.nodeResque.nodeResqueStrings.reEnqueue
import typings.nodeResque.nodeResqueStrings.start
import typings.nodeResque.nodeResqueStrings.success
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-resque", "Worker")
@js.native
class Worker protected () extends EventEmitter {
  def this(options: WorkerOptions) = this()
  def this(options: WorkerOptions, jobs: JobsHash) = this()
  
  def connect(): js.Promise[Unit] = js.native
  
  def end(): js.Promise[Unit] = js.native
  
  @JSName("on")
  def on_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function3[/* error */ Error, /* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("on")
  def on_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* failure */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_reEnqueue(
    event: reEnqueue,
    cb: js.Function3[/* queue */ String, /* job */ Job[_], /* plugin */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* result */ js.Any, Unit]): this.type = js.native
  
  @JSName("once")
  def once_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function3[/* error */ Error, /* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("once")
  def once_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* failure */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_reEnqueue(
    event: reEnqueue,
    cb: js.Function3[/* queue */ String, /* job */ Job[_], /* plugin */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* result */ js.Any, Unit]): this.type = js.native
  
  def removeAllListeners(event: WorkerEvent): this.type = js.native
  
  def start(): js.Promise[Unit] = js.native
}
