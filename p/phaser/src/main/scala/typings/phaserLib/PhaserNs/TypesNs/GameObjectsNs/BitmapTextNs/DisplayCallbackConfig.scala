package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayCallbackConfig extends js.Object {
  /**
    * The character code of the character being rendered.
    */
  var charCode: scala.Double
  /**
    * Custom data stored with the character being rendered.
    */
  var data: js.Any
  /**
    * The index of the character being rendered.
    */
  var index: scala.Double
  /**
    * The Dynamic Bitmap Text object that owns this character being rendered.
    */
  var parent: phaserLib.PhaserNs.GameObjectsNs.DynamicBitmapText
  /**
    * The rotation of the character being rendered.
    */
  var rotation: scala.Double
  /**
    * The scale of the character being rendered.
    */
  var scale: scala.Double
  /**
    * The tint of the character being rendered. Always zero in Canvas.
    */
  var tint: TintConfig
  /**
    * The x position of the character being rendered.
    */
  var x: scala.Double
  /**
    * The y position of the character being rendered.
    */
  var y: scala.Double
}

object DisplayCallbackConfig {
  @scala.inline
  def apply(
    charCode: scala.Double,
    data: js.Any,
    index: scala.Double,
    parent: phaserLib.PhaserNs.GameObjectsNs.DynamicBitmapText,
    rotation: scala.Double,
    scale: scala.Double,
    tint: TintConfig,
    x: scala.Double,
    y: scala.Double
  ): DisplayCallbackConfig = {
    val __obj = js.Dynamic.literal(charCode = charCode, data = data, index = index, parent = parent, rotation = rotation, scale = scale, tint = tint, x = x, y = y)
  
    __obj.asInstanceOf[DisplayCallbackConfig]
  }
}

