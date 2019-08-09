package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs

import typings.phaser.PhaserNs.TypesNs.ActionsNs.GridAlignConfig
import typings.phaser.PhaserNs.TypesNs.InputNs.HitAreaCallback
import typings.phaser.integer
import typings.phaser.phaserNumbers.`false`
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
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * The class of each new Game Object.
    */
  var classType: js.UndefOr[js.Function] = js.undefined
  /**
    * The texture frame of each new Game Object.
    */
  var frame: js.UndefOr[String | (js.Array[String | integer]) | integer] = js.undefined
  /**
    * The number of times each `frame` should be combined with one `key`.
    */
  var frameQuantity: js.UndefOr[integer] = js.undefined
  /**
    * Align the new Game Objects in a grid using these settings.
    */
  var gridAlign: js.UndefOr[`false` | GridAlignConfig] = js.undefined
  /**
    * A geometric shape that defines the hit area for the Game Object.
    */
  var hitArea: js.UndefOr[js.Any] = js.undefined
  /**
    * A callback to be invoked when the Game Object is interacted with.
    */
  var hitAreaCallback: js.UndefOr[HitAreaCallback] = js.undefined
  /**
    * The texture key of each new Game Object.
    */
  var key: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The maximum number of new Game Objects to create. 0 is no maximum.
    */
  var max: js.UndefOr[integer] = js.undefined
  /**
    * The number of Game Objects to create. If set, this overrides the `frameQuantity` value. Use `frameQuantity` for more advanced control.
    */
  var quantity: js.UndefOr[integer] = js.undefined
  /**
    * Select a `frame` at random.
    */
  var randomFrame: js.UndefOr[Boolean] = js.undefined
  /**
    * Select a `key` at random.
    */
  var randomKey: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of times each `key` × `frame` combination will be *repeated* (after the first combination).
    */
  var repeat: js.UndefOr[integer] = js.undefined
  var setAlpha: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's alpha from the previous by this amount, starting from `setAlpha.value`.
    */
  var `setAlpha.step`: js.UndefOr[Double] = js.undefined
  /**
    * The alpha value of each new Game Object.
    */
  var `setAlpha.value`: js.UndefOr[Double] = js.undefined
  var setRotation: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's rotation from the previous by this amount, starting at `setRotation.value`.
    */
  var `setRotation.step`: js.UndefOr[Double] = js.undefined
  /**
    * Rotation of each new Game Object.
    */
  var `setRotation.value`: js.UndefOr[Double] = js.undefined
  var setScale: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal scale from the previous by this amount, starting from `setScale.x`.
    */
  var `setScale.stepX`: js.UndefOr[Double] = js.undefined
  /**
    * Increment each Game object's vertical scale from the previous by this amount, starting from `setScale.y`.
    */
  var `setScale.stepY`: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal scale of each new Game Object.
    */
  var `setScale.x`: js.UndefOr[Double] = js.undefined
  /**
    * The vertical scale of each new Game Object.
    */
  var `setScale.y`: js.UndefOr[Double] = js.undefined
  var setXY: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal position from the previous by this amount, starting from `setXY.x`.
    */
  var `setXY.stepX`: js.UndefOr[Double] = js.undefined
  /**
    * Increment each Game Object's vertical position from the previous by this amount, starting from `setXY.y`.
    */
  var `setXY.stepY`: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal position of each new Game Object.
    */
  var `setXY.x`: js.UndefOr[Double] = js.undefined
  /**
    * The vertical position of each new Game Object.
    */
  var `setXY.y`: js.UndefOr[Double] = js.undefined
  /**
    * The visible state of each new Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Select keys and frames by moving forward then backward through `key` and `frame`.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object GroupCreateConfig {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classType: js.Function = null,
    frame: String | (js.Array[String | integer]) | integer = null,
    frameQuantity: js.UndefOr[integer] = js.undefined,
    gridAlign: `false` | GridAlignConfig = null,
    hitArea: js.Any = null,
    hitAreaCallback: HitAreaCallback = null,
    key: String | js.Array[String] = null,
    max: js.UndefOr[integer] = js.undefined,
    quantity: js.UndefOr[integer] = js.undefined,
    randomFrame: js.UndefOr[Boolean] = js.undefined,
    randomKey: js.UndefOr[Boolean] = js.undefined,
    repeat: js.UndefOr[integer] = js.undefined,
    setAlpha: js.Object = null,
    `setAlpha.step`: Int | Double = null,
    `setAlpha.value`: Int | Double = null,
    setRotation: js.Object = null,
    `setRotation.step`: Int | Double = null,
    `setRotation.value`: Int | Double = null,
    setScale: js.Object = null,
    `setScale.stepX`: Int | Double = null,
    `setScale.stepY`: Int | Double = null,
    `setScale.x`: Int | Double = null,
    `setScale.y`: Int | Double = null,
    setXY: js.Object = null,
    `setXY.stepX`: Int | Double = null,
    `setXY.stepY`: Int | Double = null,
    `setXY.x`: Int | Double = null,
    `setXY.y`: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): GroupCreateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (classType != null) __obj.updateDynamic("classType")(classType)
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(frameQuantity)) __obj.updateDynamic("frameQuantity")(frameQuantity)
    if (gridAlign != null) __obj.updateDynamic("gridAlign")(gridAlign.asInstanceOf[js.Any])
    if (hitArea != null) __obj.updateDynamic("hitArea")(hitArea)
    if (hitAreaCallback != null) __obj.updateDynamic("hitAreaCallback")(hitAreaCallback)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity)
    if (!js.isUndefined(randomFrame)) __obj.updateDynamic("randomFrame")(randomFrame)
    if (!js.isUndefined(randomKey)) __obj.updateDynamic("randomKey")(randomKey)
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
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

