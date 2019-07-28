package typings.node.NodeJSNs

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteStream extends Socket {
  var columns: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  val writableFinished: Boolean = js.native
  val writableHighWaterMark: Double = js.native
  val writableLength: Double = js.native
  def _destroy(err: Null, callback: js.Function1[/* err */ js.UndefOr[Null | Error], Unit]): Unit = js.native
  def _destroy(err: Error, callback: js.Function1[/* err */ js.UndefOr[Null | Error], Unit]): Unit = js.native
  def _final(callback: js.Function1[/* err */ js.UndefOr[Null | Error], Unit]): Unit = js.native
  def _write(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[Null | Error], Unit]
  ): Unit = js.native
  def cork(): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  def setDefaultEncoding(encoding: java.lang.String): this.type = js.native
  def uncork(): Unit = js.native
}

