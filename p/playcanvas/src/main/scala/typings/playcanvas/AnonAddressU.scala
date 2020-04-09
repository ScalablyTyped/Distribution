package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressU extends js.Object {
  var addressU: js.UndefOr[Double] = js.undefined
  var addressV: js.UndefOr[Double] = js.undefined
  var addressW: js.UndefOr[Double] = js.undefined
  var anisotropy: js.UndefOr[Double] = js.undefined
  var compareFunc: js.UndefOr[Double] = js.undefined
  var compareOnRead: js.UndefOr[Boolean] = js.undefined
  var cubemap: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var fixCubemapSeams: js.UndefOr[Boolean] = js.undefined
  var flipY: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var magFilter: js.UndefOr[Double] = js.undefined
  var minFilter: js.UndefOr[Double] = js.undefined
  var mipmaps: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var premultiplyAlpha: js.UndefOr[Boolean] = js.undefined
  var rgbm: js.UndefOr[Boolean] = js.undefined
  var swizzleGGGR: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAddressU {
  @scala.inline
  def apply(
    addressU: Int | Double = null,
    addressV: Int | Double = null,
    addressW: Int | Double = null,
    anisotropy: Int | Double = null,
    compareFunc: Int | Double = null,
    compareOnRead: js.UndefOr[Boolean] = js.undefined,
    cubemap: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    fixCubemapSeams: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    format: Int | Double = null,
    height: Int | Double = null,
    magFilter: Int | Double = null,
    minFilter: Int | Double = null,
    mipmaps: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    premultiplyAlpha: js.UndefOr[Boolean] = js.undefined,
    rgbm: js.UndefOr[Boolean] = js.undefined,
    swizzleGGGR: js.UndefOr[Boolean] = js.undefined,
    volume: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonAddressU = {
    val __obj = js.Dynamic.literal()
    if (addressU != null) __obj.updateDynamic("addressU")(addressU.asInstanceOf[js.Any])
    if (addressV != null) __obj.updateDynamic("addressV")(addressV.asInstanceOf[js.Any])
    if (addressW != null) __obj.updateDynamic("addressW")(addressW.asInstanceOf[js.Any])
    if (anisotropy != null) __obj.updateDynamic("anisotropy")(anisotropy.asInstanceOf[js.Any])
    if (compareFunc != null) __obj.updateDynamic("compareFunc")(compareFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(compareOnRead)) __obj.updateDynamic("compareOnRead")(compareOnRead.asInstanceOf[js.Any])
    if (!js.isUndefined(cubemap)) __obj.updateDynamic("cubemap")(cubemap.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixCubemapSeams)) __obj.updateDynamic("fixCubemapSeams")(fixCubemapSeams.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (magFilter != null) __obj.updateDynamic("magFilter")(magFilter.asInstanceOf[js.Any])
    if (minFilter != null) __obj.updateDynamic("minFilter")(minFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(mipmaps)) __obj.updateDynamic("mipmaps")(mipmaps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(premultiplyAlpha)) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(rgbm)) __obj.updateDynamic("rgbm")(rgbm.asInstanceOf[js.Any])
    if (!js.isUndefined(swizzleGGGR)) __obj.updateDynamic("swizzleGGGR")(swizzleGGGR.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressU]
  }
}

