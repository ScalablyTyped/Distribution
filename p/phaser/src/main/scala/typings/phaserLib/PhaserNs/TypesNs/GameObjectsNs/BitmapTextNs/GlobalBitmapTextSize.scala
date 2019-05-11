package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The position and size of the Bitmap Text in global space, taking into account the Game Object's scale and world position.
  */
trait GlobalBitmapTextSize extends js.Object {
  /**
    * The height of the BitmapText, taking into account the y scale of the Game Object.
    */
  var height: scala.Double
  /**
    * The width of the BitmapText, taking into account the x scale of the Game Object.
    */
  var width: scala.Double
  /**
    * The x position of the BitmapText, taking into account the x position and scale of the Game Object.
    */
  var x: scala.Double
  /**
    * The y position of the BitmapText, taking into account the y position and scale of the Game Object.
    */
  var y: scala.Double
}

object GlobalBitmapTextSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): GlobalBitmapTextSize = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[GlobalBitmapTextSize]
  }
}

