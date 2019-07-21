package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream extends EventEmitter {
  var writable: scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(data: java.lang.String): scala.Unit = js.native
  def end(data: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(data: stdLib.Uint8Array): scala.Unit = js.native
  def end(data: stdLib.Uint8Array, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def write(buffer: java.lang.String): scala.Boolean = js.native
  def write(
    buffer: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Boolean = js.native
  def write(buffer: stdLib.Uint8Array): scala.Boolean = js.native
  def write(
    buffer: stdLib.Uint8Array,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    str: java.lang.String,
    encoding: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Boolean = js.native
}

