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
    alpha: js.UndefOr[Double] = js.undefined,
    angle: js.UndefOr[Double] = js.undefined,
    animationName: String = null,
    attachmentName: String = null,
    blendMode: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    origin: Double | js.Object = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: Double | js.Object = null,
    scaleMode: js.UndefOr[Double] = js.undefined,
    scrollFactor: Double | js.Object = null,
    skinName: String = null,
    slotName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): SpineGameObjectConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (attachmentName != null) __obj.updateDynamic("attachmentName")(attachmentName.asInstanceOf[js.Any])
    if (!js.isUndefined(blendMode)) __obj.updateDynamic("blendMode")(blendMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleMode)) __obj.updateDynamic("scaleMode")(scaleMode.get.asInstanceOf[js.Any])
    if (scrollFactor != null) __obj.updateDynamic("scrollFactor")(scrollFactor.asInstanceOf[js.Any])
    if (skinName != null) __obj.updateDynamic("skinName")(skinName.asInstanceOf[js.Any])
    if (slotName != null) __obj.updateDynamic("slotName")(slotName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineGameObjectConfig]
  }
}

