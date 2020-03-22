package typings.phaser.Phaser.Types.GameObjects.BitmapText

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phaser.Phaser.Types.GameObjects.JSONGameObject & {  font  :string,   text  :string,   fontSize  :number,   letterSpacing  :number,   align  :phaser.integer} */
trait JSONBitmapText extends js.Object {
  /**
    * The alignment of the text in a multi-line BitmapText object.
    */
  var align: integer
  /**
    * The alpha value of the Game Object.
    */
  var alpha: Double
  /**
    * Sets the Blend Mode being used by this Game Object.
    */
  var blendMode: integer | String
  /**
    * The data of this Game Object.
    */
  var data: js.Object
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: Boolean
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: Boolean
  /**
    * The name of the font.
    */
  var font: String
  /**
    * The size of the font.
    */
  var fontSize: Double
  /**
    * The frame key of this Game Object.
    */
  var frameKey: String
  /**
    * Adds / Removes spacing between characters.
    */
  var letterSpacing: Double
  /**
    * The name of this Game Object.
    */
  var name: String
  /**
    * The origin of this Game Object.
    */
  var origin: js.Object
  /**
    * The horizontal origin of this Game Object.
    */
  @JSName("origin.x")
  var originDotx: Double
  /**
    * The vertical origin of this Game Object.
    */
  @JSName("origin.y")
  var originDoty: Double
  /**
    * The angle of this Game Object in radians.
    */
  var rotation: Double
  /**
    * The scale of this Game Object
    */
  var scale: js.Object
  /**
    * The horizontal scale of this Game Object.
    */
  @JSName("scale.x")
  var scaleDotx: Double
  /**
    * The vertical scale of this Game Object.
    */
  @JSName("scale.y")
  var scaleDoty: Double
  /**
    * The Scale Mode being used by this Game Object.
    */
  var scaleMode: integer
  /**
    * The text that this Bitmap Text displays.
    */
  var text: String
  /**
    * The texture key of this Game Object.
    */
  var textureKey: String
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    */
  var `type`: String
  /**
    * The visible state of the Game Object.
    */
  var visible: Boolean
  /**
    * The x position of this Game Object.
    */
  var x: Double
  /**
    * The y position of this Game Object.
    */
  var y: Double
}

object JSONBitmapText {
  @scala.inline
  def apply(
    align: integer,
    alpha: Double,
    blendMode: integer | String,
    data: js.Object,
    flipX: Boolean,
    flipY: Boolean,
    font: String,
    fontSize: Double,
    frameKey: String,
    letterSpacing: Double,
    name: String,
    origin: js.Object,
    originDotx: Double,
    originDoty: Double,
    rotation: Double,
    scale: js.Object,
    scaleDotx: Double,
    scaleDoty: Double,
    scaleMode: integer,
    text: String,
    textureKey: String,
    `type`: String,
    visible: Boolean,
    x: Double,
    y: Double
  ): JSONBitmapText = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], frameKey = frameKey.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.x")(originDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.y")(originDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.x")(scaleDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.y")(scaleDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONBitmapText]
  }
}

