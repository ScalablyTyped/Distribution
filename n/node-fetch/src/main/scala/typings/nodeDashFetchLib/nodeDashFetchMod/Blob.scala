package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Blob")
@js.native
class Blob () extends js.Object {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
  val size: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def slice(): Blob = js.native
  def slice(start: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double): Blob = js.native
}

