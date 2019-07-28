package typings.ndnDashJs.blobMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/blob", "Blob")
@js.native
class Blob () extends js.Object {
  def this(value: String) = this()
  def this(value: js.Array[Double]) = this()
  def this(value: Blob) = this()
  def this(value: Buffer) = this()
  def this(value: Buffer, copy: Boolean) = this()
  def buf(): Buffer = js.native
  def equals(other: Blob): Boolean = js.native
  def isNull(): Boolean = js.native
  def size(): Double = js.native
}

