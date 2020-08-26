package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "reprojectTexture")
@js.native
object reprojectTexture extends js.Object {
  /**
    * This function reprojects textures between cubemap and equirectangular formats. The
    * function can read and write textures with pixel data in RGBE, RGBM, linear and sRGB formats. When
    * specularPower is specified it will perform a phong-weighted convolution of the source (for generating
    * a gloss maps).
    * @param device - The graphics device
    * @param source - The source texture
    * @param target - The target texture
    * @param [specularPower] - optional specular power. When specular power is specified,
    * the source is convolved by a phong-weighted kernel raised to the specified power. Otherwise
    * the function performs a standard resample.
    */
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    source: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.Texture
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    source: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.Texture,
    specularPower: Double
  ): Unit = js.native
}

