package typings.phaser.Phaser.Types.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSVColorObject extends js.Object {
  /**
    * The hue color value. A number between 0 and 1
    */
  var h: Double
  /**
    * The saturation color value. A number between 0 and 1
    */
  var s: Double
  /**
    * The lightness color value. A number between 0 and 1
    */
  var v: Double
}

object HSVColorObject {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): HSVColorObject = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HSVColorObject]
  }
}

