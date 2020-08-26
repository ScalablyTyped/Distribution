package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONGameObject extends js.Object {
  /**
    * The alpha value of the Game Object.
    */
  var alpha: Double = js.native
  /**
    * Sets the Blend Mode being used by this Game Object.
    */
  var blendMode: integer | String = js.native
  /**
    * The data of this Game Object.
    */
  var data: js.Object = js.native
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: Boolean = js.native
  /**
    * The frame key of this Game Object.
    */
  var frameKey: String = js.native
  /**
    * The name of this Game Object.
    */
  var name: String = js.native
  /**
    * The origin of this Game Object.
    */
  var origin: js.Object = js.native
  /**
    * The horizontal origin of this Game Object.
    */
  @JSName("origin.x")
  var originDotx: Double = js.native
  /**
    * The vertical origin of this Game Object.
    */
  @JSName("origin.y")
  var originDoty: Double = js.native
  /**
    * The angle of this Game Object in radians.
    */
  var rotation: Double = js.native
  /**
    * The scale of this Game Object
    */
  var scale: js.Object = js.native
  /**
    * The horizontal scale of this Game Object.
    */
  @JSName("scale.x")
  var scaleDotx: Double = js.native
  /**
    * The vertical scale of this Game Object.
    */
  @JSName("scale.y")
  var scaleDoty: Double = js.native
  /**
    * The Scale Mode being used by this Game Object.
    */
  var scaleMode: integer = js.native
  /**
    * The texture key of this Game Object.
    */
  var textureKey: String = js.native
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    */
  var `type`: String = js.native
  /**
    * The visible state of the Game Object.
    */
  var visible: Boolean = js.native
  /**
    * The x position of this Game Object.
    */
  var x: Double = js.native
  /**
    * The y position of this Game Object.
    */
  var y: Double = js.native
}

object JSONGameObject {
  @scala.inline
  def apply(
    alpha: Double,
    blendMode: integer | String,
    data: js.Object,
    flipX: Boolean,
    flipY: Boolean,
    frameKey: String,
    name: String,
    origin: js.Object,
    originDotx: Double,
    originDoty: Double,
    rotation: Double,
    scale: js.Object,
    scaleDotx: Double,
    scaleDoty: Double,
    scaleMode: integer,
    textureKey: String,
    `type`: String,
    visible: Boolean,
    x: Double,
    y: Double
  ): JSONGameObject = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], frameKey = frameKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.x")(originDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.y")(originDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.x")(scaleDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.y")(scaleDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONGameObject]
  }
  @scala.inline
  implicit class JSONGameObjectOps[Self <: JSONGameObject] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlendMode(value: integer | String): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipX(value: Boolean): Self = this.set("flipX", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameKey(value: String): Self = this.set("frameKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: js.Object): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginDotx(value: Double): Self = this.set("origin.x", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginDoty(value: Double): Self = this.set("origin.y", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: js.Object): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleDotx(value: Double): Self = this.set("scale.x", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleDoty(value: Double): Self = this.set("scale.y", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleMode(value: integer): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureKey(value: String): Self = this.set("textureKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

