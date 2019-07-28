package typings.ndnDashJs.ndnDashJsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Blob")
@js.native
class Blob ()
  extends typings.ndnDashJs.blobMod.Blob {
  def this(value: String) = this()
  def this(value: js.Array[Double]) = this()
  def this(value: typings.ndnDashJs.blobMod.Blob) = this()
  def this(value: Buffer) = this()
  def this(value: Buffer, copy: Boolean) = this()
}

