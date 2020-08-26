package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The position and size of the Bitmap Text in global space, taking into account the Game Object's scale and world position.
  */
@js.native
trait GlobalBitmapTextSize extends js.Object {
  /**
    * The height of the BitmapText, taking into account the y scale of the Game Object.
    */
  var height: Double = js.native
  /**
    * The width of the BitmapText, taking into account the x scale of the Game Object.
    */
  var width: Double = js.native
  /**
    * The x position of the BitmapText, taking into account the x position and scale of the Game Object.
    */
  var x: Double = js.native
  /**
    * The y position of the BitmapText, taking into account the y position and scale of the Game Object.
    */
  var y: Double = js.native
}

object GlobalBitmapTextSize {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): GlobalBitmapTextSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalBitmapTextSize]
  }
  @scala.inline
  implicit class GlobalBitmapTextSizeOps[Self <: GlobalBitmapTextSize] (val x: Self) extends AnyVal {
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

