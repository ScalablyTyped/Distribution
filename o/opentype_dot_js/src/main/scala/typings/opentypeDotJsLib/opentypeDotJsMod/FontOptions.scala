package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var ascender: scala.Double
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var createdTimestamp: scala.Double
  var descender: scala.Double
  var description: js.UndefOr[java.lang.String] = js.undefined
  var designer: js.UndefOr[java.lang.String] = js.undefined
  var designerURL: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var familyName: java.lang.String
  var fsSelection: js.UndefOr[java.lang.String] = js.undefined
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  var license: js.UndefOr[java.lang.String] = js.undefined
  var licenseURL: js.UndefOr[java.lang.String] = js.undefined
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var manufacturerURL: js.UndefOr[java.lang.String] = js.undefined
  var postScriptName: js.UndefOr[java.lang.String] = js.undefined
  var styleName: java.lang.String
  var trademark: js.UndefOr[java.lang.String] = js.undefined
  var unitsPerEm: scala.Double
  var version: js.UndefOr[java.lang.String] = js.undefined
  var weightClass: js.UndefOr[java.lang.String] = js.undefined
  var widthClass: js.UndefOr[java.lang.String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    ascender: scala.Double,
    createdTimestamp: scala.Double,
    descender: scala.Double,
    familyName: java.lang.String,
    styleName: java.lang.String,
    unitsPerEm: scala.Double,
    copyright: java.lang.String = null,
    description: java.lang.String = null,
    designer: java.lang.String = null,
    designerURL: java.lang.String = null,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    fsSelection: java.lang.String = null,
    fullName: java.lang.String = null,
    license: java.lang.String = null,
    licenseURL: java.lang.String = null,
    manufacturer: java.lang.String = null,
    manufacturerURL: java.lang.String = null,
    postScriptName: java.lang.String = null,
    trademark: java.lang.String = null,
    version: java.lang.String = null,
    weightClass: java.lang.String = null,
    widthClass: java.lang.String = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascender")(ascender)
    __obj.updateDynamic("createdTimestamp")(createdTimestamp)
    __obj.updateDynamic("descender")(descender)
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("styleName")(styleName)
    __obj.updateDynamic("unitsPerEm")(unitsPerEm)
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

