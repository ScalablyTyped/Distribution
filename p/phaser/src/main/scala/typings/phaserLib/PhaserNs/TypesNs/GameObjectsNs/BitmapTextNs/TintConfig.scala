package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TintConfig extends js.Object {
  /**
    * The bottom left tint value. Always zero in canvas.
    */
  var bottomLeft: scala.Double
  /**
    * The bottom right tint value. Always zero in canvas.
    */
  var bottomRight: scala.Double
  /**
    * The top left tint value. Always zero in canvas.
    */
  var topLeft: scala.Double
  /**
    * The top right tint value. Always zero in canvas.
    */
  var topRight: scala.Double
}

object TintConfig {
  @scala.inline
  def apply(bottomLeft: scala.Double, bottomRight: scala.Double, topLeft: scala.Double, topRight: scala.Double): TintConfig = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft, bottomRight = bottomRight, topLeft = topLeft, topRight = topRight)
  
    __obj.asInstanceOf[TintConfig]
  }
}

