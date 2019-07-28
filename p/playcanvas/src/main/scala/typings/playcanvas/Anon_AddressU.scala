package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressU extends js.Object {
  var addressU: Double
  var addressV: Double
  var addressW: Double
  var anisotropy: Double
  var compareFunc: Boolean
  var compareOnRead: Boolean
  var cubemap: Boolean
  var depth: Double
  var fixCubemapSeams: Boolean
  var flipY: Boolean
  var format: Double
  var height: Double
  var magFilter: Double
  var minFilter: Double
  var mipmaps: Boolean
  var rgbm: Boolean
  var volume: Boolean
  var width: Double
}

object Anon_AddressU {
  @scala.inline
  def apply(
    addressU: Double,
    addressV: Double,
    addressW: Double,
    anisotropy: Double,
    compareFunc: Boolean,
    compareOnRead: Boolean,
    cubemap: Boolean,
    depth: Double,
    fixCubemapSeams: Boolean,
    flipY: Boolean,
    format: Double,
    height: Double,
    magFilter: Double,
    minFilter: Double,
    mipmaps: Boolean,
    rgbm: Boolean,
    volume: Boolean,
    width: Double
  ): Anon_AddressU = {
    val __obj = js.Dynamic.literal(addressU = addressU, addressV = addressV, addressW = addressW, anisotropy = anisotropy, compareFunc = compareFunc, compareOnRead = compareOnRead, cubemap = cubemap, depth = depth, fixCubemapSeams = fixCubemapSeams, flipY = flipY, format = format, height = height, magFilter = magFilter, minFilter = minFilter, mipmaps = mipmaps, rgbm = rgbm, volume = volume, width = width)
  
    __obj.asInstanceOf[Anon_AddressU]
  }
}

