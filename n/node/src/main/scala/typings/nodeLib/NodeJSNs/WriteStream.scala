package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteStream extends Socket {
  var columns: js.UndefOr[scala.Double] = js.native
  var rows: js.UndefOr[scala.Double] = js.native
  val writableHighWaterMark: scala.Double = js.native
  val writableLength: scala.Double = js.native
  def _destroy(
    err: nodeLib.Error,
    callback: js.Function1[/* err */ js.UndefOr[scala.Null | nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def _destroy(
    err: scala.Null,
    callback: js.Function1[/* err */ js.UndefOr[scala.Null | nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def _final(callback: js.Function1[/* err */ js.UndefOr[scala.Null | nodeLib.Error], scala.Unit]): scala.Unit = js.native
  def _write(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[scala.Null | nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def cork(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: nodeLib.Error): scala.Unit = js.native
  def setDefaultEncoding(encoding: java.lang.String): this.type = js.native
  def uncork(): scala.Unit = js.native
}

