package typings.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zlib extends js.Object {
  /** @deprecated Use bytesWritten instead. */
  val bytesRead: Double = js.native
  val bytesWritten: Double = js.native
  var shell: js.UndefOr[Boolean | String] = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def flush(): Unit = js.native
  def flush(kind: js.Function0[Unit]): Unit = js.native
  def flush(kind: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def flush(kind: Double): Unit = js.native
  def flush(kind: Double, callback: js.Function0[Unit]): Unit = js.native
}

