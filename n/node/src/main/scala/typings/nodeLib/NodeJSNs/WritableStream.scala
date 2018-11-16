package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream extends EventEmitter {
  var writable: scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(buffer: nodeLib.Buffer): scala.Unit = js.native
  def end(buffer: nodeLib.Buffer, cb: js.Function): scala.Unit = js.native
  def end(cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  def write(buffer: java.lang.String): scala.Boolean = js.native
  def write(buffer: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

