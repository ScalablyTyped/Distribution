package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TintConfig extends js.Object {
  /**
    * The bottom left tint value. Always zero in canvas.
    */
  var bottomLeft: Double
  /**
    * The bottom right tint value. Always zero in canvas.
    */
  var bottomRight: Double
  /**
    * The top left tint value. Always zero in canvas.
    */
  var topLeft: Double
  /**
    * The top right tint value. Always zero in canvas.
    */
  var topRight: Double
}

object TintConfig {
  @scala.inline
  def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TintConfig = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TintConfig]
  }
}

