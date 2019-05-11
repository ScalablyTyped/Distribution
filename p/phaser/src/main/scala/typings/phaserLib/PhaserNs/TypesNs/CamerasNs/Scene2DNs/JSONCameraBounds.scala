package typings
package phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONCameraBounds extends js.Object {
  /**
    * The height size of camera
    */
  var height: scala.Double
  /**
    * The width size of camera
    */
  var width: scala.Double
  /**
    * The horizontal position of camera
    */
  var x: scala.Double
  /**
    * The vertical position of camera
    */
  var y: scala.Double
}

object JSONCameraBounds {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): JSONCameraBounds = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[JSONCameraBounds]
  }
}

