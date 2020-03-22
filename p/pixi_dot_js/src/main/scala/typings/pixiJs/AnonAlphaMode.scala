package typings.pixiJs

import typings.pixiJs.PIXI.ALPHA_MODES
import typings.pixiJs.PIXI.FORMATS
import typings.pixiJs.PIXI.MIPMAP_MODES
import typings.pixiJs.PIXI.SCALE_MODES
import typings.pixiJs.PIXI.TARGETS
import typings.pixiJs.PIXI.TYPES
import typings.pixiJs.PIXI.WRAP_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaMode extends js.Object {
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
  var anisotropicLevel: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[FORMATS] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mipmap: js.UndefOr[MIPMAP_MODES] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var resourceOptions: js.UndefOr[js.Any] = js.undefined
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  var target: js.UndefOr[TARGETS] = js.undefined
  var `type`: js.UndefOr[TYPES] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrapMode: js.UndefOr[WRAP_MODES] = js.undefined
}

object AnonAlphaMode {
  @scala.inline
  def apply(
    alphaMode: ALPHA_MODES = null,
    anisotropicLevel: Int | Double = null,
    format: FORMATS = null,
    height: Int | Double = null,
    mipmap: MIPMAP_MODES = null,
    resolution: Int | Double = null,
    resourceOptions: js.Any = null,
    scaleMode: SCALE_MODES = null,
    target: TARGETS = null,
    `type`: TYPES = null,
    width: Int | Double = null,
    wrapMode: WRAP_MODES = null
  ): AnonAlphaMode = {
    val __obj = js.Dynamic.literal()
    if (alphaMode != null) __obj.updateDynamic("alphaMode")(alphaMode.asInstanceOf[js.Any])
    if (anisotropicLevel != null) __obj.updateDynamic("anisotropicLevel")(anisotropicLevel.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mipmap != null) __obj.updateDynamic("mipmap")(mipmap.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (resourceOptions != null) __obj.updateDynamic("resourceOptions")(resourceOptions.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapMode != null) __obj.updateDynamic("wrapMode")(wrapMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaMode]
  }
}

