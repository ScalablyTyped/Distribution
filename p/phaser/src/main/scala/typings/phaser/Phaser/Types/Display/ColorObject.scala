package typings.phaser.Phaser.Types.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorObject extends js.Object {
  /**
    * The alpha color value in the range 0 to 255.
    */
  var a: Double
  /**
    * The blue color value in the range 0 to 255.
    */
  var b: Double
  /**
    * The green color value in the range 0 to 255.
    */
  var g: Double
  /**
    * The red color value in the range 0 to 255.
    */
  var r: Double
}

object ColorObject {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): ColorObject = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorObject]
  }
}

