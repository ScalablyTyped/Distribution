package typings.phaser.Phaser.Types.GameObjects.Group

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Actions.GridAlignConfig
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
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
  @JSName("setAlpha.step")
  var setAlphaDotstep: js.UndefOr[Double] = js.undefined
  /**
    * The alpha value of each new Game Object.
    */
  @JSName("setAlpha.value")
  var setAlphaDotvalue: js.UndefOr[Double] = js.undefined
  var setDepth: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's depth from the previous by this amount, starting from `setDepth.value`.
    */
  @JSName("setDepth.step")
  var setDepthDotstep: js.UndefOr[Double] = js.undefined
  /**
    * The depth value of each new Game Object.
    */
  @JSName("setDepth.value")
  var setDepthDotvalue: js.UndefOr[Double] = js.undefined
  var setRotation: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's rotation from the previous by this amount, starting at `setRotation.value`.
    */
  @JSName("setRotation.step")
  var setRotationDotstep: js.UndefOr[Double] = js.undefined
  /**
    * Rotation of each new Game Object.
    */
  @JSName("setRotation.value")
  var setRotationDotvalue: js.UndefOr[Double] = js.undefined
  var setScale: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal scale from the previous by this amount, starting from `setScale.x`.
    */
  @JSName("setScale.stepX")
  var setScaleDotstepX: js.UndefOr[Double] = js.undefined
  /**
    * Increment each Game object's vertical scale from the previous by this amount, starting from `setScale.y`.
    */
  @JSName("setScale.stepY")
  var setScaleDotstepY: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal scale of each new Game Object.
    */
  @JSName("setScale.x")
  var setScaleDotx: js.UndefOr[Double] = js.undefined
  /**
    * The vertical scale of each new Game Object.
    */
  @JSName("setScale.y")
  var setScaleDoty: js.UndefOr[Double] = js.undefined
  var setScrollFactor: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal scroll factor from the previous by this amount, starting from `setScrollFactor.x`.
    */
  @JSName("setScrollFactor.stepX")
  var setScrollFactorDotstepX: js.UndefOr[Double] = js.undefined
  /**
    * Increment each Game object's vertical scroll factor from the previous by this amount, starting from `setScrollFactor.y`.
    */
  @JSName("setScrollFactor.stepY")
  var setScrollFactorDotstepY: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal scroll factor of each new Game Object.
    */
  @JSName("setScrollFactor.x")
  var setScrollFactorDotx: js.UndefOr[Double] = js.undefined
  /**
    * The vertical scroll factor of each new Game Object.
    */
  @JSName("setScrollFactor.y")
  var setScrollFactorDoty: js.UndefOr[Double] = js.undefined
  var setXY: js.UndefOr[js.Object] = js.undefined
  /**
    * Increment each Game Object's horizontal position from the previous by this amount, starting from `setXY.x`.
    */
  @JSName("setXY.stepX")
  var setXYDotstepX: js.UndefOr[Double] = js.undefined
  /**
    * Increment each Game Object's vertical position from the previous by this amount, starting from `setXY.y`.
    */
  @JSName("setXY.stepY")
  var setXYDotstepY: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal position of each new Game Object.
    */
  @JSName("setXY.x")
  var setXYDotx: js.UndefOr[Double] = js.undefined
  /**
    * The vertical position of each new Game Object.
    */
  @JSName("setXY.y")
  var setXYDoty: js.UndefOr[Double] = js.undefined
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
    frameQuantity: Int | Double = null,
    gridAlign: `false` | GridAlignConfig = null,
    hitArea: js.Any = null,
    hitAreaCallback: (/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit = null,
    key: String | js.Array[String] = null,
    max: Int | Double = null,
    quantity: Int | Double = null,
    randomFrame: js.UndefOr[Boolean] = js.undefined,
    randomKey: js.UndefOr[Boolean] = js.undefined,
    repeat: Int | Double = null,
    setAlpha: js.Object = null,
    setAlphaDotstep: Int | Double = null,
    setAlphaDotvalue: Int | Double = null,
    setDepth: js.Object = null,
    setDepthDotstep: Int | Double = null,
    setDepthDotvalue: Int | Double = null,
    setRotation: js.Object = null,
    setRotationDotstep: Int | Double = null,
    setRotationDotvalue: Int | Double = null,
    setScale: js.Object = null,
    setScaleDotstepX: Int | Double = null,
    setScaleDotstepY: Int | Double = null,
    setScaleDotx: Int | Double = null,
    setScaleDoty: Int | Double = null,
    setScrollFactor: js.Object = null,
    setScrollFactorDotstepX: Int | Double = null,
    setScrollFactorDotstepY: Int | Double = null,
    setScrollFactorDotx: Int | Double = null,
    setScrollFactorDoty: Int | Double = null,
    setXY: js.Object = null,
    setXYDotstepX: Int | Double = null,
    setXYDotstepY: Int | Double = null,
    setXYDotx: Int | Double = null,
    setXYDoty: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): GroupCreateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (classType != null) __obj.updateDynamic("classType")(classType.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (frameQuantity != null) __obj.updateDynamic("frameQuantity")(frameQuantity.asInstanceOf[js.Any])
    if (gridAlign != null) __obj.updateDynamic("gridAlign")(gridAlign.asInstanceOf[js.Any])
    if (hitArea != null) __obj.updateDynamic("hitArea")(hitArea.asInstanceOf[js.Any])
    if (hitAreaCallback != null) __obj.updateDynamic("hitAreaCallback")(js.Any.fromFunction4(hitAreaCallback))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (!js.isUndefined(randomFrame)) __obj.updateDynamic("randomFrame")(randomFrame.asInstanceOf[js.Any])
    if (!js.isUndefined(randomKey)) __obj.updateDynamic("randomKey")(randomKey.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (setAlpha != null) __obj.updateDynamic("setAlpha")(setAlpha.asInstanceOf[js.Any])
    if (setAlphaDotstep != null) __obj.updateDynamic("setAlpha.step")(setAlphaDotstep.asInstanceOf[js.Any])
    if (setAlphaDotvalue != null) __obj.updateDynamic("setAlpha.value")(setAlphaDotvalue.asInstanceOf[js.Any])
    if (setDepth != null) __obj.updateDynamic("setDepth")(setDepth.asInstanceOf[js.Any])
    if (setDepthDotstep != null) __obj.updateDynamic("setDepth.step")(setDepthDotstep.asInstanceOf[js.Any])
    if (setDepthDotvalue != null) __obj.updateDynamic("setDepth.value")(setDepthDotvalue.asInstanceOf[js.Any])
    if (setRotation != null) __obj.updateDynamic("setRotation")(setRotation.asInstanceOf[js.Any])
    if (setRotationDotstep != null) __obj.updateDynamic("setRotation.step")(setRotationDotstep.asInstanceOf[js.Any])
    if (setRotationDotvalue != null) __obj.updateDynamic("setRotation.value")(setRotationDotvalue.asInstanceOf[js.Any])
    if (setScale != null) __obj.updateDynamic("setScale")(setScale.asInstanceOf[js.Any])
    if (setScaleDotstepX != null) __obj.updateDynamic("setScale.stepX")(setScaleDotstepX.asInstanceOf[js.Any])
    if (setScaleDotstepY != null) __obj.updateDynamic("setScale.stepY")(setScaleDotstepY.asInstanceOf[js.Any])
    if (setScaleDotx != null) __obj.updateDynamic("setScale.x")(setScaleDotx.asInstanceOf[js.Any])
    if (setScaleDoty != null) __obj.updateDynamic("setScale.y")(setScaleDoty.asInstanceOf[js.Any])
    if (setScrollFactor != null) __obj.updateDynamic("setScrollFactor")(setScrollFactor.asInstanceOf[js.Any])
    if (setScrollFactorDotstepX != null) __obj.updateDynamic("setScrollFactor.stepX")(setScrollFactorDotstepX.asInstanceOf[js.Any])
    if (setScrollFactorDotstepY != null) __obj.updateDynamic("setScrollFactor.stepY")(setScrollFactorDotstepY.asInstanceOf[js.Any])
    if (setScrollFactorDotx != null) __obj.updateDynamic("setScrollFactor.x")(setScrollFactorDotx.asInstanceOf[js.Any])
    if (setScrollFactorDoty != null) __obj.updateDynamic("setScrollFactor.y")(setScrollFactorDoty.asInstanceOf[js.Any])
    if (setXY != null) __obj.updateDynamic("setXY")(setXY.asInstanceOf[js.Any])
    if (setXYDotstepX != null) __obj.updateDynamic("setXY.stepX")(setXYDotstepX.asInstanceOf[js.Any])
    if (setXYDotstepY != null) __obj.updateDynamic("setXY.stepY")(setXYDotstepY.asInstanceOf[js.Any])
    if (setXYDotx != null) __obj.updateDynamic("setXY.x")(setXYDotx.asInstanceOf[js.Any])
    if (setXYDoty != null) __obj.updateDynamic("setXY.y")(setXYDoty.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCreateConfig]
  }
}

