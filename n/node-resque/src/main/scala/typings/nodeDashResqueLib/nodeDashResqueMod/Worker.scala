package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Worker")
@js.native
class Worker protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: WorkerOptions) = this()
  def this(options: WorkerOptions, jobs: JobsHash) = this()
  def connect(): js.Promise[scala.Unit] = js.native
  def end(): js.Promise[scala.Unit] = js.native
  @JSName("on")
  def on_cleaningworker(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.cleaning_worker,
    cb: js.Function2[/* worker */ java.lang.String, /* pid */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: nodeDashResqueLib.nodeDashResqueLibStrings.end, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.error,
    cb: js.Function3[/* error */ stdLib.Error, /* queue */ java.lang.String, /* job */ Job[_], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_failure(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.failure,
    cb: js.Function3[/* queue */ java.lang.String, /* job */ Job[_], /* failure */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_job(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.job,
    cb: js.Function2[/* queue */ java.lang.String, /* job */ Job[_], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pause(event: nodeDashResqueLib.nodeDashResqueLibStrings.pause, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ping(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.ping,
    cb: js.Function1[/* time */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_poll(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.poll,
    cb: js.Function1[/* queue */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reEnqueue(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.reEnqueue,
    cb: js.Function3[
      /* queue */ java.lang.String, 
      /* job */ Job[_], 
      /* plugin */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_start(event: nodeDashResqueLib.nodeDashResqueLibStrings.start, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_success(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.success,
    cb: js.Function3[/* queue */ java.lang.String, /* job */ Job[_], /* result */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cleaningworker(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.cleaning_worker,
    cb: js.Function2[/* worker */ java.lang.String, /* pid */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: nodeDashResqueLib.nodeDashResqueLibStrings.end, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.error,
    cb: js.Function3[/* error */ stdLib.Error, /* queue */ java.lang.String, /* job */ Job[_], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_failure(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.failure,
    cb: js.Function3[/* queue */ java.lang.String, /* job */ Job[_], /* failure */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_job(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.job,
    cb: js.Function2[/* queue */ java.lang.String, /* job */ Job[_], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pause(event: nodeDashResqueLib.nodeDashResqueLibStrings.pause, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_ping(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.ping,
    cb: js.Function1[/* time */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_poll(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.poll,
    cb: js.Function1[/* queue */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_reEnqueue(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.reEnqueue,
    cb: js.Function3[
      /* queue */ java.lang.String, 
      /* job */ Job[_], 
      /* plugin */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_start(event: nodeDashResqueLib.nodeDashResqueLibStrings.start, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_success(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.success,
    cb: js.Function3[/* queue */ java.lang.String, /* job */ Job[_], /* result */ js.Any, scala.Unit]
  ): this.type = js.native
  def removeAllListeners(event: WorkerEvent): this.type = js.native
  def start(): js.Promise[scala.Unit] = js.native
}

