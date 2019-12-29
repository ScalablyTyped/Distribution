package typings.node.NodeJS

import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream extends EventEmitter {
  var writable: Boolean = js.native
  def end(): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(data: String): Unit = js.native
  def end(data: String, cb: js.Function0[Unit]): Unit = js.native
  def end(data: Uint8Array): Unit = js.native
  def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: String): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(buffer: Uint8Array): Boolean = js.native
  def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(str: String, encoding: String): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
}

