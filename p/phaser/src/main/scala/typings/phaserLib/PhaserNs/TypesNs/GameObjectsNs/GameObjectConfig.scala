package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameObjectConfig extends js.Object {
  /**
    * Add the GameObject to the scene.
    */
  var add: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The alpha (opacity) of the Game Object.
    */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation angle of the Game Object, in degrees.
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The blend mode of the GameObject.
    */
  var blendMode: js.UndefOr[scala.Double] = js.undefined
  /**
    * The depth of the GameObject.
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The origin of the Game Object.
    */
  var origin: js.UndefOr[scala.Double | js.Object] = js.undefined
  /**
    * The rotation angle of the Game Object, in radians.
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * The scale of the GameObject.
    */
  var scale: js.UndefOr[scala.Double | js.Object] = js.undefined
  /**
    * The scale mode of the GameObject.
    */
  var scaleMode: js.UndefOr[scala.Double] = js.undefined
  /**
    * The scroll factor of the GameObject.
    */
  var scrollFactor: js.UndefOr[scala.Double | js.Object] = js.undefined
  /**
    * The visible state of the Game Object.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The x position of the Game Object.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position of the Game Object.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object GameObjectConfig {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    alpha: scala.Int | scala.Double = null,
    angle: scala.Int | scala.Double = null,
    blendMode: scala.Int | scala.Double = null,
    depth: scala.Int | scala.Double = null,
    flipX: js.UndefOr[scala.Boolean] = js.undefined,
    flipY: js.UndefOr[scala.Boolean] = js.undefined,
    origin: scala.Double | js.Object = null,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Double | js.Object = null,
    scaleMode: scala.Int | scala.Double = null,
    scrollFactor: scala.Double | js.Object = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): GameObjectConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (scrollFactor != null) __obj.updateDynamic("scrollFactor")(scrollFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameObjectConfig]
  }
}

