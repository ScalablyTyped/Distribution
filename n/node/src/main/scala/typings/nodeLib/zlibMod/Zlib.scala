package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zlib extends js.Object {
  /** @deprecated Use bytesWritten instead. */
  val bytesRead: scala.Double = js.native
  val bytesWritten: scala.Double = js.native
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def flush(kind: js.Function0[scala.Unit]): scala.Unit = js.native
  def flush(kind: js.Function0[scala.Unit], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def flush(kind: scala.Double): scala.Unit = js.native
  def flush(kind: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

