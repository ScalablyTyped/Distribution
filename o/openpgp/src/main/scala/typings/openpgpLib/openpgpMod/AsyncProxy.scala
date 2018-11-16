package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "AsyncProxy")
@js.native
class AsyncProxy protected () extends js.Object {
  def this(options: WorkerOptions) = this()
  var workers: js.Array[OpenPGPWorker] = js.native
  def delegate(method: java.lang.String, options: js.Any): scala.Unit = js.native
  def getId(): scala.Double = js.native
  def seedRandom(workerId: scala.Double, size: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def terminate(): scala.Unit = js.native
}

