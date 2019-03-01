package typings
package polishedLib.libTypesFontFaceConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceConfiguration extends js.Object {
  var fileFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fontDisplay: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: java.lang.String
  var fontFeatureSettings: js.UndefOr[java.lang.String] = js.undefined
  var fontFilePath: js.UndefOr[java.lang.String] = js.undefined
  var fontStretch: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontVariant: js.UndefOr[java.lang.String] = js.undefined
  var fontVariationSettings: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var localFonts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
}

object FontFaceConfiguration {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fileFormats: js.Array[java.lang.String] = null,
    fontDisplay: java.lang.String = null,
    fontFeatureSettings: java.lang.String = null,
    fontFilePath: java.lang.String = null,
    fontStretch: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontVariant: java.lang.String = null,
    fontVariationSettings: java.lang.String = null,
    fontWeight: java.lang.String = null,
    localFonts: js.Array[java.lang.String] = null,
    unicodeRange: java.lang.String = null
  ): FontFaceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontFamily")(fontFamily)
    if (fileFormats != null) __obj.updateDynamic("fileFormats")(fileFormats)
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay)
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings)
    if (fontFilePath != null) __obj.updateDynamic("fontFilePath")(fontFilePath)
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (localFonts != null) __obj.updateDynamic("localFonts")(localFonts)
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange)
    __obj.asInstanceOf[FontFaceConfiguration]
  }
}

