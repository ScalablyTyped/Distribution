package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressU extends js.Object {
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

object AddressU {
  @scala.inline
  def apply(
    addressU: js.UndefOr[Double] = js.undefined,
    addressV: js.UndefOr[Double] = js.undefined,
    addressW: js.UndefOr[Double] = js.undefined,
    anisotropy: js.UndefOr[Double] = js.undefined,
    compareFunc: js.UndefOr[Double] = js.undefined,
    compareOnRead: js.UndefOr[Boolean] = js.undefined,
    cubemap: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    fixCubemapSeams: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    magFilter: js.UndefOr[Double] = js.undefined,
    minFilter: js.UndefOr[Double] = js.undefined,
    mipmaps: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    premultiplyAlpha: js.UndefOr[Boolean] = js.undefined,
    rgbm: js.UndefOr[Boolean] = js.undefined,
    swizzleGGGR: js.UndefOr[Boolean] = js.undefined,
    volume: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AddressU = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addressU)) __obj.updateDynamic("addressU")(addressU.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addressV)) __obj.updateDynamic("addressV")(addressV.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addressW)) __obj.updateDynamic("addressW")(addressW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anisotropy)) __obj.updateDynamic("anisotropy")(anisotropy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compareFunc)) __obj.updateDynamic("compareFunc")(compareFunc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compareOnRead)) __obj.updateDynamic("compareOnRead")(compareOnRead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cubemap)) __obj.updateDynamic("cubemap")(cubemap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixCubemapSeams)) __obj.updateDynamic("fixCubemapSeams")(fixCubemapSeams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magFilter)) __obj.updateDynamic("magFilter")(magFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minFilter)) __obj.updateDynamic("minFilter")(minFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mipmaps)) __obj.updateDynamic("mipmaps")(mipmaps.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(premultiplyAlpha)) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rgbm)) __obj.updateDynamic("rgbm")(rgbm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swizzleGGGR)) __obj.updateDynamic("swizzleGGGR")(swizzleGGGR.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressU]
  }
}

