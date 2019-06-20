package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The total number of objects created will be
  * 
  *     key.length * frame.length * frameQuantity * (yoyo ? 2 : 1) * (1 + repeat)
  * 
  * If `max` is nonzero, then the total created will not exceed `max`.
  * 
  * `key` is required. {@link Phaser.GameObjects.Group#defaultKey} is not used.
  */
trait GroupCreateConfig extends js.Object {
  /**
    * The active state of each new Game Object.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The class of each new Game Object.
    */
  var classType: js.UndefOr[js.Function] = js.undefined
  /**
    * The texture frame of each new Game Object.
    */
  var frame: js.UndefOr[
    java.lang.String | (js.Array[java.lang.String | phaserLib.integer]) | phaserLib.integer
  ] = js.undefined
  /**
    * The number of times each `frame` should be combined with one `key`.
    */
  var frameQuantity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Align the new Game Objects in a grid using these settings.
    */
  var gridAlign: js.UndefOr[
    phaserLib.phaserLibNumbers.`false` | phaserLib.PhaserNs.TypesNs.ActionsNs.GridAlignConfig
  ] = js.undefined
  /**
    * A geometric shape that defines the hit area for the Game Object.
    */
  var hitArea: js.UndefOr[js.Any] = js.undefined
  /**
    * A callback to be invoked when the Game Object is interacted with.
    */
  var hitAreaCallback: js.UndefOr[phaserLib.PhaserNs.TypesNs.InputNs.HitAreaCallback] = js.undefined
  /**
    * The texture key of each new Game Object.
    */
  var key: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The maximum number of new Game Objects to create. 0 is no maximum.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Select a `frame` at random.
    */
  var randomFrame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select a `key` at random.
    */
  var randomKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of times each `key` × `frame` combination will be *repeated* (after the first combination).
    */
  var repeat: js.UndefOr[scala.Double] = js.undefined
  var setAlpha: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's alpha from the previous by this amount, starting from `setAlpha.value`.
    */
  var `setAlpha.step`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The alpha value of each new Game Object.
    */
  var `setAlpha.value`: js.UndefOr[scala.Double] = js.undefined
  var setRotation: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's rotation from the previous by this amount, starting at `setRotation.value`.
    */
  var `setRotation.step`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Rotation of each new Game Object.
    */
  var `setRotation.value`: js.UndefOr[scala.Double] = js.undefined
  var setScale: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal scale from the previous by this amount, starting from `setScale.x`.
    */
  var `setScale.stepX`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Increment each Game object's vertical scale from the previous by this amount, starting from `setScale.y`.
    */
  var `setScale.stepY`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The horizontal scale of each new Game Object.
    */
  var `setScale.x`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical scale of each new Game Object.
    */
  var `setScale.y`: js.UndefOr[scala.Double] = js.undefined
  var setXY: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal position from the previous by this amount, starting from `setXY.x`.
    */
  var `setXY.stepX`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Increment each Game Object's vertical position from the previous by this amount, starting from `setXY.y`.
    */
  var `setXY.stepY`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The horizontal position of each new Game Object.
    */
  var `setXY.x`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical position of each new Game Object.
    */
  var `setXY.y`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The visible state of each new Game Object.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select keys and frames by moving forward then backward through `key` and `frame`.
    */
  var yoyo: js.UndefOr[scala.Boolean] = js.undefined
}

object GroupCreateConfig {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    classType: js.Function = null,
    frame: java.lang.String | (js.Array[java.lang.String | phaserLib.integer]) | phaserLib.integer = null,
    frameQuantity: scala.Int | scala.Double = null,
    gridAlign: phaserLib.phaserLibNumbers.`false` | phaserLib.PhaserNs.TypesNs.ActionsNs.GridAlignConfig = null,
    hitArea: js.Any = null,
    hitAreaCallback: phaserLib.PhaserNs.TypesNs.InputNs.HitAreaCallback = null,
    key: java.lang.String | js.Array[java.lang.String] = null,
    max: scala.Int | scala.Double = null,
    randomFrame: js.UndefOr[scala.Boolean] = js.undefined,
    randomKey: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: scala.Int | scala.Double = null,
    setAlpha: js.Object = null,
    `setAlpha.step`: scala.Int | scala.Double = null,
    `setAlpha.value`: scala.Int | scala.Double = null,
    setRotation: js.Object = null,
    `setRotation.step`: scala.Int | scala.Double = null,
    `setRotation.value`: scala.Int | scala.Double = null,
    setScale: js.Object = null,
    `setScale.stepX`: scala.Int | scala.Double = null,
    `setScale.stepY`: scala.Int | scala.Double = null,
    `setScale.x`: scala.Int | scala.Double = null,
    `setScale.y`: scala.Int | scala.Double = null,
    setXY: js.Object = null,
    `setXY.stepX`: scala.Int | scala.Double = null,
    `setXY.stepY`: scala.Int | scala.Double = null,
    `setXY.x`: scala.Int | scala.Double = null,
    `setXY.y`: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    yoyo: js.UndefOr[scala.Boolean] = js.undefined
  ): GroupCreateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (classType != null) __obj.updateDynamic("classType")(classType)
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (frameQuantity != null) __obj.updateDynamic("frameQuantity")(frameQuantity.asInstanceOf[js.Any])
    if (gridAlign != null) __obj.updateDynamic("gridAlign")(gridAlign.asInstanceOf[js.Any])
    if (hitArea != null) __obj.updateDynamic("hitArea")(hitArea)
    if (hitAreaCallback != null) __obj.updateDynamic("hitAreaCallback")(hitAreaCallback)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(randomFrame)) __obj.updateDynamic("randomFrame")(randomFrame)
    if (!js.isUndefined(randomKey)) __obj.updateDynamic("randomKey")(randomKey)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (setAlpha != null) __obj.updateDynamic("setAlpha")(setAlpha)
    if (`setAlpha.step` != null) __obj.updateDynamic("setAlpha.step")(`setAlpha.step`.asInstanceOf[js.Any])
    if (`setAlpha.value` != null) __obj.updateDynamic("setAlpha.value")(`setAlpha.value`.asInstanceOf[js.Any])
    if (setRotation != null) __obj.updateDynamic("setRotation")(setRotation)
    if (`setRotation.step` != null) __obj.updateDynamic("setRotation.step")(`setRotation.step`.asInstanceOf[js.Any])
    if (`setRotation.value` != null) __obj.updateDynamic("setRotation.value")(`setRotation.value`.asInstanceOf[js.Any])
    if (setScale != null) __obj.updateDynamic("setScale")(setScale)
    if (`setScale.stepX` != null) __obj.updateDynamic("setScale.stepX")(`setScale.stepX`.asInstanceOf[js.Any])
    if (`setScale.stepY` != null) __obj.updateDynamic("setScale.stepY")(`setScale.stepY`.asInstanceOf[js.Any])
    if (`setScale.x` != null) __obj.updateDynamic("setScale.x")(`setScale.x`.asInstanceOf[js.Any])
    if (`setScale.y` != null) __obj.updateDynamic("setScale.y")(`setScale.y`.asInstanceOf[js.Any])
    if (setXY != null) __obj.updateDynamic("setXY")(setXY)
    if (`setXY.stepX` != null) __obj.updateDynamic("setXY.stepX")(`setXY.stepX`.asInstanceOf[js.Any])
    if (`setXY.stepY` != null) __obj.updateDynamic("setXY.stepY")(`setXY.stepY`.asInstanceOf[js.Any])
    if (`setXY.x` != null) __obj.updateDynamic("setXY.x")(`setXY.x`.asInstanceOf[js.Any])
    if (`setXY.y` != null) __obj.updateDynamic("setXY.y")(`setXY.y`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[GroupCreateConfig]
  }
}

