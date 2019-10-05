package typings.phaser.Phaser.Types.Cameras.Scene2D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONCameraBounds extends js.Object {
  /**
    * The height size of camera
    */
  var height: Double
  /**
    * The width size of camera
    */
  var width: Double
  /**
    * The horizontal position of camera
    */
  var x: Double
  /**
    * The vertical position of camera
    */
  var y: Double
}

object JSONCameraBounds {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): JSONCameraBounds = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[JSONCameraBounds]
  }
}

