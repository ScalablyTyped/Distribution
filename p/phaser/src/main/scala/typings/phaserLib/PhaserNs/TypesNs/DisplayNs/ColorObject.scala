package typings
package phaserLib.PhaserNs.TypesNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorObject extends js.Object {
  /**
    * The alpha color value in the range 0 to 255.
    */
  var a: scala.Double
  /**
    * The blue color value in the range 0 to 255.
    */
  var b: scala.Double
  /**
    * The green color value in the range 0 to 255.
    */
  var g: scala.Double
  /**
    * The red color value in the range 0 to 255.
    */
  var r: scala.Double
}

object ColorObject {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, g: scala.Double, r: scala.Double): ColorObject = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[ColorObject]
  }
}

