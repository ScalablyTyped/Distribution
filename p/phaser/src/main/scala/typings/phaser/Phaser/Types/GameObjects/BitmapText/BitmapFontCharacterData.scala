package typings.phaser.Phaser.Types.GameObjects.BitmapText

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The font data for an individual character of a Bitmap Font.
  * 
  * Describes the character's position, size, offset and kerning.
  */
@js.native
trait BitmapFontCharacterData extends js.Object {
  /**
    * The center x position of the character.
    */
  var centerX: Double = js.native
  /**
    * The center y position of the character.
    */
  var centerY: Double = js.native
  /**
    * Extra data for the character.
    */
  var data: js.Object = js.native
  /**
    * The height of the character.
    */
  var height: Double = js.native
  /**
    * Kerning values, keyed by character code.
    */
  var kerning: StringDictionary[Double] = js.native
  /**
    * The width of the character.
    */
  var width: Double = js.native
  /**
    * The x position of the character.
    */
  var x: Double = js.native
  /**
    * The x offset of the character.
    */
  var xOffset: Double = js.native
  /**
    * The y position of the character.
    */
  var y: Double = js.native
  /**
    * The y offset of the character.
    */
  var yOffset: Double = js.native
}

object BitmapFontCharacterData {
  @scala.inline
  def apply(
    centerX: Double,
    centerY: Double,
    data: js.Object,
    height: Double,
    kerning: StringDictionary[Double],
    width: Double,
    x: Double,
    xOffset: Double,
    y: Double,
    yOffset: Double
  ): BitmapFontCharacterData = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFontCharacterData]
  }
  @scala.inline
  implicit class BitmapFontCharacterDataOps[Self <: BitmapFontCharacterData] (val x: Self) extends AnyVal {
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
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setKerning(value: StringDictionary[Double]): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
  }
  
}

