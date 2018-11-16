package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Queue")
@js.native
class Queue protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: QueueOptions) = this()
  def this(options: QueueOptions, jobs: JobsHash) = this()
  def connect(): stdLib.Promise[scala.Unit] = js.native
  def end(): stdLib.Promise[scala.Unit] = js.native
  def enqueue(queue: java.lang.String, jobName: java.lang.String, args: js.Array[_]): stdLib.Promise[scala.Unit] = js.native
  def enqueueIn(milliseconds: scala.Double, queue: java.lang.String, jobName: java.lang.String, args: js.Array[_]): stdLib.Promise[scala.Unit] = js.native
  @JSName("on")
  def on_error(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.error,
    cb: js.Function2[/* error */ nodeLib.Error, /* queue */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodeDashResqueLib.nodeDashResqueLibStrings.error,
    cb: js.Function2[/* error */ nodeLib.Error, /* queue */ java.lang.String, scala.Unit]
  ): this.type = js.native
}

