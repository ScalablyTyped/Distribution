package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The position and size of the Bitmap Text in local space, taking just the font size into account.
  */
@js.native
trait LocalBitmapTextSize extends js.Object {
  /**
    * The height of the BitmapText.
    */
  var height: Double = js.native
  /**
    * The width of the BitmapText.
    */
  var width: Double = js.native
  /**
    * The x position of the BitmapText.
    */
  var x: Double = js.native
  /**
    * The y position of the BitmapText.
    */
  var y: Double = js.native
}

object LocalBitmapTextSize {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): LocalBitmapTextSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBitmapTextSize]
  }
  @scala.inline
  implicit class LocalBitmapTextSizeOps[Self <: LocalBitmapTextSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

