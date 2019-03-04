package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var glyphNameIndex: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var isFixedPitch: scala.Double
  var italicAngle: scala.Double
  var maxMemType1: scala.Double
  var maxMemType42: scala.Double
  var minMemType1: scala.Double
  var minMemType42: scala.Double
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var numberOfGlyphs: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var underlinePosition: scala.Double
  var underlineThickness: scala.Double
  var version: scala.Double
}

object Post {
  @scala.inline
  def apply(
    isFixedPitch: scala.Double,
    italicAngle: scala.Double,
    maxMemType1: scala.Double,
    maxMemType42: scala.Double,
    minMemType1: scala.Double,
    minMemType42: scala.Double,
    underlinePosition: scala.Double,
    underlineThickness: scala.Double,
    version: scala.Double,
    glyphNameIndex: js.Array[scala.Double] = null,
    names: js.Array[java.lang.String] = null,
    numberOfGlyphs: scala.Int | scala.Double = null,
    offset: js.Array[scala.Double] = null
  ): Post = {
    val __obj = js.Dynamic.literal(isFixedPitch = isFixedPitch, italicAngle = italicAngle, maxMemType1 = maxMemType1, maxMemType42 = maxMemType42, minMemType1 = minMemType1, minMemType42 = minMemType42, underlinePosition = underlinePosition, underlineThickness = underlineThickness, version = version)
    if (glyphNameIndex != null) __obj.updateDynamic("glyphNameIndex")(glyphNameIndex)
    if (names != null) __obj.updateDynamic("names")(names)
    if (numberOfGlyphs != null) __obj.updateDynamic("numberOfGlyphs")(numberOfGlyphs.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Post]
  }
}

