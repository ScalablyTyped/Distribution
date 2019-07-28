package typings.nodeDashResque.nodeDashResqueMod

import typings.node.NodeJSNs.EventEmitter
import typings.nodeDashResque.nodeDashResqueStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Queue")
@js.native
class Queue protected () extends EventEmitter {
  def this(options: QueueOptions) = this()
  def this(options: QueueOptions, jobs: JobsHash) = this()
  def connect(): js.Promise[Unit] = js.native
  def end(): js.Promise[Unit] = js.native
  def enqueue(queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
  def enqueueIn(milliseconds: Double, queue: String, jobName: String, args: js.Array[_]): js.Promise[Unit] = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
}

