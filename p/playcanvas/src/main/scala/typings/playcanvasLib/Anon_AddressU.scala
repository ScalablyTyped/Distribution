package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressU extends js.Object {
  var addressU: scala.Double
  var addressV: scala.Double
  var addressW: scala.Double
  var anisotropy: scala.Double
  var compareFunc: scala.Boolean
  var compareOnRead: scala.Boolean
  var cubemap: scala.Boolean
  var depth: scala.Double
  var fixCubemapSeams: scala.Boolean
  var flipY: scala.Boolean
  var format: scala.Double
  var height: scala.Double
  var magFilter: scala.Double
  var minFilter: scala.Double
  var mipmaps: scala.Boolean
  var rgbm: scala.Boolean
  var volume: scala.Boolean
  var width: scala.Double
}

object Anon_AddressU {
  @scala.inline
  def apply(
    addressU: scala.Double,
    addressV: scala.Double,
    addressW: scala.Double,
    anisotropy: scala.Double,
    compareFunc: scala.Boolean,
    compareOnRead: scala.Boolean,
    cubemap: scala.Boolean,
    depth: scala.Double,
    fixCubemapSeams: scala.Boolean,
    flipY: scala.Boolean,
    format: scala.Double,
    height: scala.Double,
    magFilter: scala.Double,
    minFilter: scala.Double,
    mipmaps: scala.Boolean,
    rgbm: scala.Boolean,
    volume: scala.Boolean,
    width: scala.Double
  ): Anon_AddressU = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addressU")(addressU)
    __obj.updateDynamic("addressV")(addressV)
    __obj.updateDynamic("addressW")(addressW)
    __obj.updateDynamic("anisotropy")(anisotropy)
    __obj.updateDynamic("compareFunc")(compareFunc)
    __obj.updateDynamic("compareOnRead")(compareOnRead)
    __obj.updateDynamic("cubemap")(cubemap)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("fixCubemapSeams")(fixCubemapSeams)
    __obj.updateDynamic("flipY")(flipY)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("magFilter")(magFilter)
    __obj.updateDynamic("minFilter")(minFilter)
    __obj.updateDynamic("mipmaps")(mipmaps)
    __obj.updateDynamic("rgbm")(rgbm)
    __obj.updateDynamic("volume")(volume)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_AddressU]
  }
}

