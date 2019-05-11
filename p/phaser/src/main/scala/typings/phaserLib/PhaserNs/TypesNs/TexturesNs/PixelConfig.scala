package typings
package phaserLib.PhaserNs.TypesNs.TexturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the position and color data for a single pixel in a CanvasTexture.
  */
trait PixelConfig extends js.Object {
  /**
    * The alpha of the pixel, between 0 and 1.
    */
  var alpha: scala.Double
  /**
    * The color of the pixel, not including the alpha channel.
    */
  var color: phaserLib.integer
  /**
    * The x-coordinate of the pixel.
    */
  var x: phaserLib.integer
  /**
    * The y-coordinate of the pixel.
    */
  var y: phaserLib.integer
}

object PixelConfig {
  @scala.inline
  def apply(alpha: scala.Double, color: phaserLib.integer, x: phaserLib.integer, y: phaserLib.integer): PixelConfig = {
    val __obj = js.Dynamic.literal(alpha = alpha, color = color, x = x, y = y)
  
    __obj.asInstanceOf[PixelConfig]
  }
}

