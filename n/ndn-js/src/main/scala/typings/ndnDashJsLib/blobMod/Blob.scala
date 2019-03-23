package typings
package ndnDashJsLib.blobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/blob", "Blob")
@js.native
class Blob () extends js.Object {
  def this(value: java.lang.String) = this()
  def this(value: js.Array[scala.Double]) = this()
  def this(value: Blob) = this()
  def this(value: nodeLib.Buffer) = this()
  def this(value: nodeLib.Buffer, copy: scala.Boolean) = this()
  def buf(): nodeLib.Buffer = js.native
  def equals(other: Blob): scala.Boolean = js.native
  def isNull(): scala.Boolean = js.native
  def size(): scala.Double = js.native
}

