package typings.phaser.Phaser.Types.GameObjects.BitmapText

import typings.phaser.Phaser.GameObjects.DynamicBitmapText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayCallbackConfig extends js.Object {
  /**
    * The character code of the character being rendered.
    */
  var charCode: Double
  /**
    * Custom data stored with the character being rendered.
    */
  var data: js.Any
  /**
    * The index of the character being rendered.
    */
  var index: Double
  /**
    * The Dynamic Bitmap Text object that owns this character being rendered.
    */
  var parent: DynamicBitmapText
  /**
    * The rotation of the character being rendered.
    */
  var rotation: Double
  /**
    * The scale of the character being rendered.
    */
  var scale: Double
  /**
    * The tint of the character being rendered. Always zero in Canvas.
    */
  var tint: TintConfig
  /**
    * The x position of the character being rendered.
    */
  var x: Double
  /**
    * The y position of the character being rendered.
    */
  var y: Double
}

object DisplayCallbackConfig {
  @scala.inline
  def apply(
    charCode: Double,
    data: js.Any,
    index: Double,
    parent: DynamicBitmapText,
    rotation: Double,
    scale: Double,
    tint: TintConfig,
    x: Double,
    y: Double
  ): DisplayCallbackConfig = {
    val __obj = js.Dynamic.literal(charCode = charCode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayCallbackConfig]
  }
}

