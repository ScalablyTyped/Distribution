package typings.opentypeDotJs.opentypeDotJsMod

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
    val __obj = js.Dynamic.literal(copyright = copyright, description = description, designer = designer, designerURL = designerURL, fontFamily = fontFamily, fontSubfamily = fontSubfamily, fullName = fullName, license = license, licenseURL = licenseURL, manufacturer = manufacturer, manufacturerURL = manufacturerURL, postScriptName = postScriptName, trademark = trademark, version = version)
  
    __obj.asInstanceOf[FontNames]
  }
}

