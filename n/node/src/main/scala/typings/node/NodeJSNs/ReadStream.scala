package typings.node.NodeJSNs

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadStream extends Socket {
  var isRaw: js.UndefOr[Boolean] = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  var setRawMode: js.UndefOr[js.Function1[/* mode */ Boolean, Unit]] = js.native
  def _destroy(err: Null, callback: js.Function1[/* err */ js.UndefOr[Null | Error], Unit]): Unit = js.native
  def _destroy(err: Error, callback: js.Function1[/* err */ js.UndefOr[Null | Error], Unit]): Unit = js.native
  def _read(size: Double): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): Boolean = js.native
}

