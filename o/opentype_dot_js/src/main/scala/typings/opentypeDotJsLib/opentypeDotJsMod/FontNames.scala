package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontNames extends js.Object {
  var copyright: LocalizedName
  var description: LocalizedName
  var designer: LocalizedName
  var designerURL: LocalizedName
  var fontFamily: LocalizedName
  var fontSubfamily: LocalizedName
  var fullName: LocalizedName
  var license: LocalizedName
  var licenseURL: LocalizedName
  var manufacturer: LocalizedName
  var manufacturerURL: LocalizedName
  var postScriptName: LocalizedName
  var trademark: LocalizedName
  var version: LocalizedName
}

object FontNames {
  @scala.inline
  def apply(
    copyright: LocalizedName,
    description: LocalizedName,
    designer: LocalizedName,
    designerURL: LocalizedName,
    fontFamily: LocalizedName,
    fontSubfamily: LocalizedName,
    fullName: LocalizedName,
    license: LocalizedName,
    licenseURL: LocalizedName,
    manufacturer: LocalizedName,
    manufacturerURL: LocalizedName,
    postScriptName: LocalizedName,
    trademark: LocalizedName,
    version: LocalizedName
  ): FontNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyright")(copyright)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("designer")(designer)
    __obj.updateDynamic("designerURL")(designerURL)
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSubfamily")(fontSubfamily)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("license")(license)
    __obj.updateDynamic("licenseURL")(licenseURL)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("manufacturerURL")(manufacturerURL)
    __obj.updateDynamic("postScriptName")(postScriptName)
    __obj.updateDynamic("trademark")(trademark)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[FontNames]
  }
}

