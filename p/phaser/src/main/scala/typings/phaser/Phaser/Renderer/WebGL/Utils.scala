package typings.phaser.Phaser.Renderer.WebGL

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Renderer.WebGL.Utils")
@js.native
object Utils extends js.Object {
  /**
    * Counts how many attributes of 32 bits a vertex has
    * @param attributes Array of attributes
    * @param glContext WebGLContext used for check types
    */
  def getComponentCount(attributes: js.Array[_], glContext: WebGLRenderingContext): Double = js.native
  /**
    * Unpacks a Uint24 RGB into an array of floats of ranges of 0.0 and 1.0
    * @param rgb RGB packed as a Uint24
    */
  def getFloatsFromUintRGB(rgb: Double): js.Array[_] = js.native
  /**
    * Packs a Uint24, representing RGB components, with a Float32, representing
    * the alpha component, with a range between 0.0 and 1.0 and return a Uint32
    * @param rgb Uint24 representing RGB components
    * @param a Float32 representing Alpha component
    */
  def getTintAppendFloatAlpha(rgb: Double, a: Double): Double = js.native
  /**
    * Packs a Uint24, representing RGB components, with a Float32, representing
    * the alpha component, with a range between 0.0 and 1.0 and return a 
    * swizzled Uint32
    * @param rgb Uint24 representing RGB components
    * @param a Float32 representing Alpha component
    */
  def getTintAppendFloatAlphaAndSwap(rgb: Double, a: Double): Double = js.native
  /**
    * Packs four floats on a range from 0.0 to 1.0 into a single Uint32
    * @param r Red component in a range from 0.0 to 1.0
    * @param g Green component in a range from 0.0 to 1.0
    * @param b Blue component in a range from 0.0 to 1.0
    * @param a Alpha component in a range from 0.0 to 1.0
    */
  def getTintFromFloats(r: Double, g: Double, b: Double, a: Double): Double = js.native
}

