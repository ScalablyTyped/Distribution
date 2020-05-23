package typings.opentypeJs.mod

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
    numberOfGlyphs: js.UndefOr[Double] = js.undefined,
    offset: js.Array[Double] = null
  ): Post = {
    val __obj = js.Dynamic.literal(isFixedPitch = isFixedPitch.asInstanceOf[js.Any], italicAngle = italicAngle.asInstanceOf[js.Any], maxMemType1 = maxMemType1.asInstanceOf[js.Any], maxMemType42 = maxMemType42.asInstanceOf[js.Any], minMemType1 = minMemType1.asInstanceOf[js.Any], minMemType42 = minMemType42.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (glyphNameIndex != null) __obj.updateDynamic("glyphNameIndex")(glyphNameIndex.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfGlyphs)) __obj.updateDynamic("numberOfGlyphs")(numberOfGlyphs.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
}

