package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math.Pow2")
@js.native
object Pow2Ns extends js.Object {
  /**
    * Returns the nearest power of 2 to the given `value`.
    * @param value The value.
    */
  def GetPowerOfTwo(value: scala.Double): phaserLib.integer = js.native
  /**
    * Checks if the given `width` and `height` are a power of two.
    * Useful for checking texture dimensions.
    * @param width The width.
    * @param height The height.
    */
  def IsSizePowerOfTwo(width: scala.Double, height: scala.Double): scala.Boolean = js.native
  /**
    * Tests the value and returns `true` if it is a power of two.
    * @param value The value to check if it's a power of two.
    */
  def IsValuePowerOfTwo(value: scala.Double): scala.Boolean = js.native
}

