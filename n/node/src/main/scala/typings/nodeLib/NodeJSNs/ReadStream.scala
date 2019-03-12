package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadStream extends Socket {
  var isRaw: js.UndefOr[scala.Boolean] = js.native
  val readableHighWaterMark: scala.Double = js.native
  val readableLength: scala.Double = js.native
  var setRawMode: js.UndefOr[js.Function1[/* mode */ scala.Boolean, scala.Unit]] = js.native
  def _destroy(
    err: nodeLib.Error,
    callback: js.Function1[/* err */ js.UndefOr[scala.Null | nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def _destroy(
    err: scala.Null,
    callback: js.Function1[/* err */ js.UndefOr[scala.Null | nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def _read(size: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: nodeLib.Error): scala.Unit = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
}

