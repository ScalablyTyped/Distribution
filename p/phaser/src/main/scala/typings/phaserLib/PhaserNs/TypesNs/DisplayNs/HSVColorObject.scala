package typings
package phaserLib.PhaserNs.TypesNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSVColorObject extends js.Object {
  /**
    * The hue color value. A number between 0 and 1
    */
  var h: scala.Double
  /**
    * The saturation color value. A number between 0 and 1
    */
  var s: scala.Double
  /**
    * The lightness color value. A number between 0 and 1
    */
  var v: scala.Double
}

object HSVColorObject {
  @scala.inline
  def apply(h: scala.Double, s: scala.Double, v: scala.Double): HSVColorObject = {
    val __obj = js.Dynamic.literal(h = h, s = s, v = v)
  
    __obj.asInstanceOf[HSVColorObject]
  }
}

