package typings.pixelmatch.mod

import typings.node.Buffer
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixelmatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    /** Image data of the first image to compare. Note: image dimensions must be equal. */
  img1: Buffer | Uint8Array | Uint8ClampedArray,
    /** Image data of the second image to compare. Note: image dimensions must be equal. */
  img2: Buffer | Uint8Array | Uint8ClampedArray,
    /** Image data to write the diff to, or null if don't need a diff image. */
  output: Buffer | Uint8Array | Null,
    /** Width of the images. Note that all three images need to have the same dimensions. */
  width: Double,
    /** Height of the images. Note that all three images need to have the same dimensions. */
  height: Double,
    /** Options. */
  options: js.UndefOr[PixelmatchOptions]
  ): Double = js.native
}
