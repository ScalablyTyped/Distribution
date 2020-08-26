package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontNames extends js.Object {
  var copyright: LocalizedName = js.native
  var description: LocalizedName = js.native
  var designer: LocalizedName = js.native
  var designerURL: LocalizedName = js.native
  var fontFamily: LocalizedName = js.native
  var fontSubfamily: LocalizedName = js.native
  var fullName: LocalizedName = js.native
  var license: LocalizedName = js.native
  var licenseURL: LocalizedName = js.native
  var manufacturer: LocalizedName = js.native
  var manufacturerURL: LocalizedName = js.native
  var postScriptName: LocalizedName = js.native
  var trademark: LocalizedName = js.native
  var version: LocalizedName = js.native
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
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], designer = designer.asInstanceOf[js.Any], designerURL = designerURL.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSubfamily = fontSubfamily.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseURL = licenseURL.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], manufacturerURL = manufacturerURL.asInstanceOf[js.Any], postScriptName = postScriptName.asInstanceOf[js.Any], trademark = trademark.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontNames]
  }
  @scala.inline
  implicit class FontNamesOps[Self <: FontNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopyright(value: LocalizedName): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: LocalizedName): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesigner(value: LocalizedName): Self = this.set("designer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesignerURL(value: LocalizedName): Self = this.set("designerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: LocalizedName): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSubfamily(value: LocalizedName): Self = this.set("fontSubfamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: LocalizedName): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicense(value: LocalizedName): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicenseURL(value: LocalizedName): Self = this.set("licenseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturer(value: LocalizedName): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturerURL(value: LocalizedName): Self = this.set("manufacturerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostScriptName(value: LocalizedName): Self = this.set("postScriptName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrademark(value: LocalizedName): Self = this.set("trademark", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: LocalizedName): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

