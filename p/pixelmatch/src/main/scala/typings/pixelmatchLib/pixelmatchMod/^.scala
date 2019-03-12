package typings
package pixelmatchLib.pixelmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixelmatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    /** Image data of the first image to compare. Note: image dimensions must be equal. */
  img1: nodeLib.Buffer | stdLib.Uint8Array,
    /** Image data of the second image to compare. Note: image dimensions must be equal. */
  img2: nodeLib.Buffer | stdLib.Uint8Array,
    /** Image data to write the diff to, or null if don't need a diff image. */
  output: nodeLib.Buffer | stdLib.Uint8Array | scala.Null,
    /** Width of the images. Note that all three images need to have the same dimensions. */
  width: scala.Double,
    /** Height of the images. Note that all three images need to have the same dimensions. */
  height: scala.Double
  ): scala.Double = js.native
  def apply(
    /** Image data of the first image to compare. Note: image dimensions must be equal. */
  img1: nodeLib.Buffer | stdLib.Uint8Array,
    /** Image data of the second image to compare. Note: image dimensions must be equal. */
  img2: nodeLib.Buffer | stdLib.Uint8Array,
    /** Image data to write the diff to, or null if don't need a diff image. */
  output: nodeLib.Buffer | stdLib.Uint8Array | scala.Null,
    /** Width of the images. Note that all three images need to have the same dimensions. */
  width: scala.Double,
    /** Height of the images. Note that all three images need to have the same dimensions. */
  height: scala.Double,
    /** Options. */
  options: Options
  ): scala.Double = js.native
}

