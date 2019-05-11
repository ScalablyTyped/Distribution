package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The position and size of the Bitmap Text in local space, taking just the font size into account.
  */
trait LocalBitmapTextSize extends js.Object {
  /**
    * The height of the BitmapText.
    */
  var height: scala.Double
  /**
    * The width of the BitmapText.
    */
  var width: scala.Double
  /**
    * The x position of the BitmapText.
    */
  var x: scala.Double
  /**
    * The y position of the BitmapText.
    */
  var y: scala.Double
}

object LocalBitmapTextSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): LocalBitmapTextSize = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[LocalBitmapTextSize]
  }
}

