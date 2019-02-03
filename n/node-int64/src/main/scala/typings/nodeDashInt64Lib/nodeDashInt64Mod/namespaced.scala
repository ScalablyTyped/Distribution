package typings
package nodeDashInt64Lib.nodeDashInt64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-int64", JSImport.Namespace)
@js.native
class namespaced protected () extends Int64 {
  def this(array: stdLib.Uint8Array) = this()
  def this(buffer: nodeLib.Buffer) = this()
  def this(num: scala.Double) = this()
  def this(str: java.lang.String) = this()
  def this(array: stdLib.Uint8Array, offset: scala.Double) = this()
  def this(buffer: nodeLib.Buffer, offset: scala.Double) = this()
  def this(hi: scala.Double, lo: scala.Double) = this()
}

/* static members */
@JSImport("node-int64", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var MAX_INT: scala.Double = js.native
  var MIN_INT: scala.Double = js.native
}

