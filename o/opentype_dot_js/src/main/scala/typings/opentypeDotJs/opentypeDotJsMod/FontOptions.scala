package typings.opentypeDotJs.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var ascender: Double
  var copyright: js.UndefOr[String] = js.undefined
  var createdTimestamp: Double
  var descender: Double
  var description: js.UndefOr[String] = js.undefined
  var designer: js.UndefOr[String] = js.undefined
  var designerURL: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var familyName: String
  var fsSelection: js.UndefOr[String] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var license: js.UndefOr[String] = js.undefined
  var licenseURL: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var manufacturerURL: js.UndefOr[String] = js.undefined
  var postScriptName: js.UndefOr[String] = js.undefined
  var styleName: String
  var trademark: js.UndefOr[String] = js.undefined
  var unitsPerEm: Double
  var version: js.UndefOr[String] = js.undefined
  var weightClass: js.UndefOr[String] = js.undefined
  var widthClass: js.UndefOr[String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    ascender: Double,
    createdTimestamp: Double,
    descender: Double,
    familyName: String,
    styleName: String,
    unitsPerEm: Double,
    copyright: String = null,
    description: String = null,
    designer: String = null,
    designerURL: String = null,
    empty: js.UndefOr[Boolean] = js.undefined,
    fsSelection: String = null,
    fullName: String = null,
    license: String = null,
    licenseURL: String = null,
    manufacturer: String = null,
    manufacturerURL: String = null,
    postScriptName: String = null,
    trademark: String = null,
    version: String = null,
    weightClass: String = null,
    widthClass: String = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal(ascender = ascender, createdTimestamp = createdTimestamp, descender = descender, familyName = familyName, styleName = styleName, unitsPerEm = unitsPerEm)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (description != null) __obj.updateDynamic("description")(description)
    if (designer != null) __obj.updateDynamic("designer")(designer)
    if (designerURL != null) __obj.updateDynamic("designerURL")(designerURL)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (fsSelection != null) __obj.updateDynamic("fsSelection")(fsSelection)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (license != null) __obj.updateDynamic("license")(license)
    if (licenseURL != null) __obj.updateDynamic("licenseURL")(licenseURL)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (manufacturerURL != null) __obj.updateDynamic("manufacturerURL")(manufacturerURL)
    if (postScriptName != null) __obj.updateDynamic("postScriptName")(postScriptName)
    if (trademark != null) __obj.updateDynamic("trademark")(trademark)
    if (version != null) __obj.updateDynamic("version")(version)
    if (weightClass != null) __obj.updateDynamic("weightClass")(weightClass)
    if (widthClass != null) __obj.updateDynamic("widthClass")(widthClass)
    __obj.asInstanceOf[FontOptions]
  }
}

