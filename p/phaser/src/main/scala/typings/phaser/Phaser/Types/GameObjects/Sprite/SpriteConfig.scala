package typings.phaser.Phaser.Types.GameObjects.Sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phaser.Phaser.Types.GameObjects.GameObjectConfig & {  key ? :string,   frame ? :number | string} */
trait SpriteConfig extends js.Object {
  /**
    * Add the GameObject to the scene.
    */
  var add: js.UndefOr[Boolean] = js.undefined
  /**
    * The alpha (opacity) of the Game Object.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The rotation angle of the Game Object, in degrees.
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * The blend mode of the GameObject.
    */
  var blendMode: js.UndefOr[Double] = js.undefined
  /**
    * The depth of the GameObject.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional frame from the Texture this Game Object is rendering with.
    */
  var frame: js.UndefOr[Double | String] = js.undefined
  /**
    * The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The origin of the Game Object.
    */
  var origin: js.UndefOr[Double | js.Object] = js.undefined
  /**
    * The rotation angle of the Game Object, in radians.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * The scale of the GameObject.
    */
  var scale: js.UndefOr[Double | js.Object] = js.undefined
  /**
    * The scale mode of the GameObject.
    */
  var scaleMode: js.UndefOr[Double] = js.undefined
  /**
    * The scroll factor of the GameObject.
    */
  var scrollFactor: js.UndefOr[Double | js.Object] = js.undefined
  /**
    * The visible state of the Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * The x position of the Game Object.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y position of the Game Object.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SpriteConfig {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    alpha: Int | Double = null,
    angle: Int | Double = null,
    blendMode: Int | Double = null,
    depth: Int | Double = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    frame: Double | String = null,
    key: String = null,
    origin: Double | js.Object = null,
    rotation: Int | Double = null,
    scale: Double | js.Object = null,
    scaleMode: Int | Double = null,
    scrollFactor: Double | js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): SpriteConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (scrollFactor != null) __obj.updateDynamic("scrollFactor")(scrollFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
}

