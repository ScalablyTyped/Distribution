package typings.polished.fontFaceConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceConfiguration extends js.Object {
  var fileFormats: js.UndefOr[js.Array[String]] = js.undefined
  var fontDisplay: js.UndefOr[String] = js.undefined
  var fontFamily: String
  var fontFeatureSettings: js.UndefOr[String] = js.undefined
  var fontFilePath: js.UndefOr[String] = js.undefined
  var fontStretch: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontVariant: js.UndefOr[String] = js.undefined
  var fontVariationSettings: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var formatHint: js.UndefOr[Boolean] = js.undefined
  var localFonts: js.UndefOr[js.Array[String]] = js.undefined
  var unicodeRange: js.UndefOr[String] = js.undefined
}

object FontFaceConfiguration {
  @scala.inline
  def apply(
    fontFamily: String,
    fileFormats: js.Array[String] = null,
    fontDisplay: String = null,
    fontFeatureSettings: String = null,
    fontFilePath: String = null,
    fontStretch: String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontVariationSettings: String = null,
    fontWeight: String = null,
    formatHint: js.UndefOr[Boolean] = js.undefined,
    localFonts: js.Array[String] = null,
    unicodeRange: String = null
  ): FontFaceConfiguration = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    if (fileFormats != null) __obj.updateDynamic("fileFormats")(fileFormats.asInstanceOf[js.Any])
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontFilePath != null) __obj.updateDynamic("fontFilePath")(fontFilePath.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(formatHint)) __obj.updateDynamic("formatHint")(formatHint.get.asInstanceOf[js.Any])
    if (localFonts != null) __obj.updateDynamic("localFonts")(localFonts.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceConfiguration]
  }
}

