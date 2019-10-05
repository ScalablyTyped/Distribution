package typings.phaser.Phaser.Types.Loader.FileTypes

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
  def apply(height: Int | Double = null, scale: Int | Double = null, width: Int | Double = null): SVGSizeConfig = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSizeConfig]
  }
}

