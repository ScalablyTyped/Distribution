package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined opentype.js.opentype.js.FontConstructorOptionsBase & std.Partial<opentype.js.opentype.js.FontOptions> & {  glyphs  :std.Array<opentype.js.opentype.js.Glyph>} */
trait FontConstructorOptions extends js.Object {
  var ascender: js.UndefOr[Double] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var createdTimestamp: js.UndefOr[Double] = js.undefined
  var descender: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var designer: js.UndefOr[String] = js.undefined
  var designerURL: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var familyName: js.UndefOr[String] = js.undefined
  var fsSelection: js.UndefOr[String] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var glyphs: js.Array[Glyph]
  var license: js.UndefOr[String] = js.undefined
  var licenseURL: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var manufacturerURL: js.UndefOr[String] = js.undefined
  var postScriptName: js.UndefOr[String] = js.undefined
  var styleName: js.UndefOr[String] = js.undefined
  var trademark: js.UndefOr[String] = js.undefined
  var unitsPerEm: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var weightClass: js.UndefOr[String] = js.undefined
  var widthClass: js.UndefOr[String] = js.undefined
}

object FontConstructorOptions {
  @scala.inline
  def apply(
    glyphs: js.Array[Glyph],
    ascender: js.UndefOr[Double] = js.undefined,
    copyright: String = null,
    createdTimestamp: js.UndefOr[Double] = js.undefined,
    descender: js.UndefOr[Double] = js.undefined,
    description: String = null,
    designer: String = null,
    designerURL: String = null,
    empty: js.UndefOr[Boolean] = js.undefined,
    familyName: String = null,
    fsSelection: String = null,
    fullName: String = null,
    license: String = null,
    licenseURL: String = null,
    manufacturer: String = null,
    manufacturerURL: String = null,
    postScriptName: String = null,
    styleName: String = null,
    trademark: String = null,
    unitsPerEm: js.UndefOr[Double] = js.undefined,
    version: String = null,
    weightClass: String = null,
    widthClass: String = null
  ): FontConstructorOptions = {
    val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any])
    if (!js.isUndefined(ascender)) __obj.updateDynamic("ascender")(ascender.get.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (!js.isUndefined(createdTimestamp)) __obj.updateDynamic("createdTimestamp")(createdTimestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(descender)) __obj.updateDynamic("descender")(descender.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (designer != null) __obj.updateDynamic("designer")(designer.asInstanceOf[js.Any])
    if (designerURL != null) __obj.updateDynamic("designerURL")(designerURL.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.get.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (fsSelection != null) __obj.updateDynamic("fsSelection")(fsSelection.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (licenseURL != null) __obj.updateDynamic("licenseURL")(licenseURL.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (manufacturerURL != null) __obj.updateDynamic("manufacturerURL")(manufacturerURL.asInstanceOf[js.Any])
    if (postScriptName != null) __obj.updateDynamic("postScriptName")(postScriptName.asInstanceOf[js.Any])
    if (styleName != null) __obj.updateDynamic("styleName")(styleName.asInstanceOf[js.Any])
    if (trademark != null) __obj.updateDynamic("trademark")(trademark.asInstanceOf[js.Any])
    if (!js.isUndefined(unitsPerEm)) __obj.updateDynamic("unitsPerEm")(unitsPerEm.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (weightClass != null) __obj.updateDynamic("weightClass")(weightClass.asInstanceOf[js.Any])
    if (widthClass != null) __obj.updateDynamic("widthClass")(widthClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptions]
  }
}

