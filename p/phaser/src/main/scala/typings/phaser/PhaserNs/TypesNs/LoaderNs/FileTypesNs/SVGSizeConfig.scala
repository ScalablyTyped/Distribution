package typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGSizeConfig extends js.Object {
  /**
    * An optional height. The SVG will be resized to this size before being rendered to a texture.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * An optional scale. If given it overrides the width / height properties. The SVG is scaled by the scale factor before being rendered to a texture.
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * An optional width. The SVG will be resized to this size before being rendered to a texture.
    */
  var width: js.UndefOr[integer] = js.undefined
}

object SVGSizeConfig {
  @scala.inline
  def apply(
    height: js.UndefOr[integer] = js.undefined,
    scale: Int | Double = null,
    width: js.UndefOr[integer] = js.undefined
  ): SVGSizeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SVGSizeConfig]
  }
}

