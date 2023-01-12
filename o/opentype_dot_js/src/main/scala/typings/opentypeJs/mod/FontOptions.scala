package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontOptions extends StObject {
  
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
  
  inline def apply(
    ascender: Double,
    createdTimestamp: Double,
    descender: Double,
    familyName: String,
    styleName: String,
    unitsPerEm: Double
  ): FontOptions = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], createdTimestamp = createdTimestamp.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
    
    inline def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCreatedTimestamp(value: Double): Self = StObject.set(x, "createdTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDesigner(value: String): Self = StObject.set(x, "designer", value.asInstanceOf[js.Any])
    
    inline def setDesignerURL(value: String): Self = StObject.set(x, "designerURL", value.asInstanceOf[js.Any])
    
    inline def setDesignerURLUndefined: Self = StObject.set(x, "designerURL", js.undefined)
    
    inline def setDesignerUndefined: Self = StObject.set(x, "designer", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFsSelection(value: String): Self = StObject.set(x, "fsSelection", value.asInstanceOf[js.Any])
    
    inline def setFsSelectionUndefined: Self = StObject.set(x, "fsSelection", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseURL(value: String): Self = StObject.set(x, "licenseURL", value.asInstanceOf[js.Any])
    
    inline def setLicenseURLUndefined: Self = StObject.set(x, "licenseURL", js.undefined)
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerURL(value: String): Self = StObject.set(x, "manufacturerURL", value.asInstanceOf[js.Any])
    
    inline def setManufacturerURLUndefined: Self = StObject.set(x, "manufacturerURL", js.undefined)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setPostScriptName(value: String): Self = StObject.set(x, "postScriptName", value.asInstanceOf[js.Any])
    
    inline def setPostScriptNameUndefined: Self = StObject.set(x, "postScriptName", js.undefined)
    
    inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    inline def setTrademark(value: String): Self = StObject.set(x, "trademark", value.asInstanceOf[js.Any])
    
    inline def setTrademarkUndefined: Self = StObject.set(x, "trademark", js.undefined)
    
    inline def setUnitsPerEm(value: Double): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWeightClass(value: String): Self = StObject.set(x, "weightClass", value.asInstanceOf[js.Any])
    
    inline def setWeightClassUndefined: Self = StObject.set(x, "weightClass", js.undefined)
    
    inline def setWidthClass(value: String): Self = StObject.set(x, "widthClass", value.asInstanceOf[js.Any])
    
    inline def setWidthClassUndefined: Self = StObject.set(x, "widthClass", js.undefined)
  }
}
