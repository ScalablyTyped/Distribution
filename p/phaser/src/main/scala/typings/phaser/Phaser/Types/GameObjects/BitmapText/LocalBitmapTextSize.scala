package typings.phaser.Phaser.Types.GameObjects.BitmapText

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
  var height: Double
  /**
    * The width of the BitmapText.
    */
  var width: Double
  /**
    * The x position of the BitmapText.
    */
  var x: Double
  /**
    * The y position of the BitmapText.
    */
  var y: Double
}

object LocalBitmapTextSize {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): LocalBitmapTextSize = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[LocalBitmapTextSize]
  }
}

