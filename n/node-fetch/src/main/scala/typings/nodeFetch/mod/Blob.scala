package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Blob")
@js.native
class Blob () extends js.Object {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.UndefOr[scala.Nothing], options: BlobOptions) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
  val size: Double = js.native
  val `type`: String = js.native
  def slice(): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
}

