package typings
package nodegitLib.bufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/buf", "Buf")
@js.native
class Buf () extends js.Object {
  var asize: scala.Double = js.native
  var ptr: java.lang.String = js.native
  var size: scala.Double = js.native
  def containsNul(): scala.Double = js.native
  def free(): scala.Unit = js.native
  def grow(targetSize: scala.Double): js.Promise[Buf] = js.native
  def isBinary(): scala.Double = js.native
  def set(data: nodeLib.Buffer, datalen: scala.Double): js.Promise[Buf] = js.native
}

