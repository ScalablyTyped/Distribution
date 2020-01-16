package typings.phaser

import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpineGameObjectConfig extends GameObjectConfig {
  var animationName: js.UndefOr[String] = js.undefined
  var attachmentName: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var skinName: js.UndefOr[String] = js.undefined
  var slotName: js.UndefOr[String] = js.undefined
}

object SpineGameObjectConfig {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    alpha: Int | Double = null,
    angle: Int | Double = null,
    animationName: String = null,
    attachmentName: String = null,
    blendMode: Int | Double = null,
    depth: Int | Double = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    origin: Double | js.Object = null,
    rotation: Int | Double = null,
    scale: Double | js.Object = null,
    scaleMode: Int | Double = null,
    scrollFactor: Double | js.Object = null,
    skinName: String = null,
    slotName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): SpineGameObjectConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (attachmentName != null) __obj.updateDynamic("attachmentName")(attachmentName.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (scrollFactor != null) __obj.updateDynamic("scrollFactor")(scrollFactor.asInstanceOf[js.Any])
    if (skinName != null) __obj.updateDynamic("skinName")(skinName.asInstanceOf[js.Any])
    if (slotName != null) __obj.updateDynamic("slotName")(slotName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineGameObjectConfig]
  }
}

