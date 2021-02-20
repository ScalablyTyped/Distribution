package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontNames extends StObject {
  
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
  implicit class FontNamesMutableBuilder[Self <: FontNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: LocalizedName): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: LocalizedName): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesigner(value: LocalizedName): Self = StObject.set(x, "designer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignerURL(value: LocalizedName): Self = StObject.set(x, "designerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: LocalizedName): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSubfamily(value: LocalizedName): Self = StObject.set(x, "fontSubfamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: LocalizedName): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: LocalizedName): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseURL(value: LocalizedName): Self = StObject.set(x, "licenseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: LocalizedName): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerURL(value: LocalizedName): Self = StObject.set(x, "manufacturerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostScriptName(value: LocalizedName): Self = StObject.set(x, "postScriptName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrademark(value: LocalizedName): Self = StObject.set(x, "trademark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: LocalizedName): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
