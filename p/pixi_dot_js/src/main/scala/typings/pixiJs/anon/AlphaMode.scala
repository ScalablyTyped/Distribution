package typings.pixiJs.anon

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

trait AlphaMode extends js.Object {
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

object AlphaMode {
  @scala.inline
  def apply(
    alphaMode: ALPHA_MODES = null,
    anisotropicLevel: js.UndefOr[Double] = js.undefined,
    format: FORMATS = null,
    height: js.UndefOr[Double] = js.undefined,
    mipmap: MIPMAP_MODES = null,
    resolution: js.UndefOr[Double] = js.undefined,
    resourceOptions: js.Any = null,
    scaleMode: SCALE_MODES = null,
    target: TARGETS = null,
    `type`: TYPES = null,
    width: js.UndefOr[Double] = js.undefined,
    wrapMode: WRAP_MODES = null
  ): AlphaMode = {
    val __obj = js.Dynamic.literal()
    if (alphaMode != null) __obj.updateDynamic("alphaMode")(alphaMode.asInstanceOf[js.Any])
    if (!js.isUndefined(anisotropicLevel)) __obj.updateDynamic("anisotropicLevel")(anisotropicLevel.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mipmap != null) __obj.updateDynamic("mipmap")(mipmap.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (resourceOptions != null) __obj.updateDynamic("resourceOptions")(resourceOptions.asInstanceOf[js.Any])
    if (scaleMode != null) __obj.updateDynamic("scaleMode")(scaleMode.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (wrapMode != null) __obj.updateDynamic("wrapMode")(wrapMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaMode]
  }
}

