package typings.opentypeDotJs.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var glyphNameIndex: js.UndefOr[js.Array[Double]] = js.undefined
  var isFixedPitch: Double
  var italicAngle: Double
  var maxMemType1: Double
  var maxMemType42: Double
  var minMemType1: Double
  var minMemType42: Double
  var names: js.UndefOr[js.Array[String]] = js.undefined
  var numberOfGlyphs: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  var underlinePosition: Double
  var underlineThickness: Double
  var version: Double
}

object Post {
  @scala.inline
  def apply(
    isFixedPitch: Double,
    italicAngle: Double,
    maxMemType1: Double,
    maxMemType42: Double,
    minMemType1: Double,
    minMemType42: Double,
    underlinePosition: Double,
    underlineThickness: Double,
    version: Double,
    glyphNameIndex: js.Array[Double] = null,
    names: js.Array[String] = null,
    numberOfGlyphs: Int | Double = null,
    offset: js.Array[Double] = null
  ): Post = {
    val __obj = js.Dynamic.literal(isFixedPitch = isFixedPitch, italicAngle = italicAngle, maxMemType1 = maxMemType1, maxMemType42 = maxMemType42, minMemType1 = minMemType1, minMemType42 = minMemType42, underlinePosition = underlinePosition, underlineThickness = underlineThickness, version = version)
    if (glyphNameIndex != null) __obj.updateDynamic("glyphNameIndex")(glyphNameIndex)
    if (names != null) __obj.updateDynamic("names")(names)
    if (numberOfGlyphs != null) __obj.updateDynamic("numberOfGlyphs")(numberOfGlyphs.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Post]
  }
}

