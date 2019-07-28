package typings.node.NodeJSNs

import typings.node.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream extends EventEmitter {
  var writable: Boolean = js.native
  def end(): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(data: java.lang.String): Unit = js.native
  def end(data: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
  def end(data: Uint8Array): Unit = js.native
  def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
  def write(buffer: java.lang.String): Boolean = js.native
  def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(buffer: Uint8Array): Boolean = js.native
  def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): Boolean = js.native
  def write(
    str: java.lang.String,
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Boolean = js.native
}

