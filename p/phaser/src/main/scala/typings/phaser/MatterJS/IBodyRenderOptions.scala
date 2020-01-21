package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyRenderOptions extends js.Object {
  /**
    * A hex color value that defines the fill color to use when rendering the body.
    *
    * @property fillColor
    * @type number
    */
  var fillColor: js.UndefOr[Double] = js.undefined
  /**
    * A value that defines the fill opacity to use when rendering the body.
    *
    * @property fillOpacity
    * @type number
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent.
    *
    * @property opacity
    * @type number
    * @default 1
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.undefined
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IBodyRenderOptions {
  @scala.inline
  def apply(
    fillColor: Int | Double = null,
    fillOpacity: Int | Double = null,
    lineColor: Int | Double = null,
    lineOpacity: Int | Double = null,
    lineThickness: Int | Double = null,
    opacity: Int | Double = null,
    sprite: IBodyRenderOptionsSprite = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineOpacity != null) __obj.updateDynamic("lineOpacity")(lineOpacity.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyRenderOptions]
  }
}

