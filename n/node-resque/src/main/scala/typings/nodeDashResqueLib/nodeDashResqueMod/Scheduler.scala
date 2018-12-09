package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Scheduler")
@js.native
class Scheduler protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: SchedulerOptions) = this()
  def this(options: SchedulerOptions, jobs: JobsHash) = this()
  def connect(): js.Promise[scala.Unit] = js.native
  def end(): js.Promise[scala.Unit] = js.native
  @JSName("on")
  def on_cleanStuckWorker(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.cleanStuckWorker,
    cb: js.Function3[
      /* workerName */ java.lang.String, 
      /* errorPayload */ ErrorPayload, 
      /* delta */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: nodeDashResqueLib.nodeDashResqueLibStrings.end, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.error,
    cb: js.Function2[/* error */ nodeLib.Error, /* queue */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_master(event: nodeDashResqueLib.nodeDashResqueLibStrings.master, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_poll(event: nodeDashResqueLib.nodeDashResqueLibStrings.poll, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: nodeDashResqueLib.nodeDashResqueLibStrings.start, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_transferredJob(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.transferredJob,
    cb: js.Function2[/* timestamp */ scala.Double, /* job */ Job[_], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workingTimestamp(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.workingTimestamp,
    cb: js.Function1[/* timestamp */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_cleanStuckWorker(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.cleanStuckWorker,
    cb: js.Function3[
      /* workerName */ java.lang.String, 
      /* errorPayload */ ErrorPayload, 
      /* delta */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: nodeDashResqueLib.nodeDashResqueLibStrings.end, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.error,
    cb: js.Function2[/* error */ nodeLib.Error, /* queue */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_master(event: nodeDashResqueLib.nodeDashResqueLibStrings.master, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_poll(event: nodeDashResqueLib.nodeDashResqueLibStrings.poll, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: nodeDashResqueLib.nodeDashResqueLibStrings.start, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_transferredJob(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.transferredJob,
    cb: js.Function2[/* timestamp */ scala.Double, /* job */ Job[_], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_workingTimestamp(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.workingTimestamp,
    cb: js.Function1[/* timestamp */ scala.Double, scala.Unit]
  ): this.type = js.native
  def removeAllListeners(event: SchedulerEvent): this.type = js.native
  def start(): js.Promise[scala.Unit] = js.native
}

