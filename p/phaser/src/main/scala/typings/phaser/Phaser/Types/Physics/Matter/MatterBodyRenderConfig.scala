package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterBodyRenderConfig extends js.Object {
  /**
    * The color value of the fill when rendering this body.
    */
  var fillColor: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the fill when rendering this body, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The color value of the line stroke when rendering this body.
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the line when rendering this body, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * The opacity of the body and all parts within it.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Controls the offset between the body and the parent Game Object, if it has one.
    */
  var sprite: js.UndefOr[js.Object] = js.undefined
  /**
    * The horizontal offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.xOffset")
  var spriteDotxOffset: js.UndefOr[Double] = js.undefined
  /**
    * The vertical offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.yOffset")
  var spriteDotyOffset: js.UndefOr[Double] = js.undefined
  /**
    * Should this body be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MatterBodyRenderConfig {
  @scala.inline
  def apply(
    fillColor: js.UndefOr[Double] = js.undefined,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    lineColor: js.UndefOr[Double] = js.undefined,
    lineOpacity: js.UndefOr[Double] = js.undefined,
    lineThickness: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    sprite: js.Object = null,
    spriteDotxOffset: js.UndefOr[Double] = js.undefined,
    spriteDotyOffset: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MatterBodyRenderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineColor)) __obj.updateDynamic("lineColor")(lineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOpacity)) __obj.updateDynamic("lineOpacity")(lineOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineThickness)) __obj.updateDynamic("lineThickness")(lineThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (!js.isUndefined(spriteDotxOffset)) __obj.updateDynamic("sprite.xOffset")(spriteDotxOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spriteDotyOffset)) __obj.updateDynamic("sprite.yOffset")(spriteDotyOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterBodyRenderConfig]
  }
}

