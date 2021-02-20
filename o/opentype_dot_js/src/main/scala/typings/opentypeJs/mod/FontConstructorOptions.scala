package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined opentype.js.opentype.js.FontConstructorOptionsBase & std.Partial<opentype.js.opentype.js.FontOptions> & {  glyphs :std.Array<opentype.js.opentype.js.Glyph>} */
@js.native
trait FontConstructorOptions extends StObject {
  
  var ascender: Double with js.UndefOr[Double] = js.native
  
  var copyright: js.UndefOr[String] = js.native
  
  var createdTimestamp: js.UndefOr[Double] = js.native
  
  var descender: Double with js.UndefOr[Double] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var designer: js.UndefOr[String] = js.native
  
  var designerURL: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var familyName: String with js.UndefOr[String] = js.native
  
  var fsSelection: js.UndefOr[String] = js.native
  
  var fullName: js.UndefOr[String] = js.native
  
  var glyphs: js.Array[Glyph] = js.native
  
  var license: js.UndefOr[String] = js.native
  
  var licenseURL: js.UndefOr[String] = js.native
  
  var manufacturer: js.UndefOr[String] = js.native
  
  var manufacturerURL: js.UndefOr[String] = js.native
  
  var postScriptName: js.UndefOr[String] = js.native
  
  var styleName: String with js.UndefOr[String] = js.native
  
  var trademark: js.UndefOr[String] = js.native
  
  var unitsPerEm: Double with js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var weightClass: js.UndefOr[String] = js.native
  
  var widthClass: js.UndefOr[String] = js.native
}
object FontConstructorOptions {
  
  @scala.inline
  def apply(
    ascender: Double with js.UndefOr[Double],
    descender: Double with js.UndefOr[Double],
    familyName: String with js.UndefOr[String],
    glyphs: js.Array[Glyph],
    styleName: String with js.UndefOr[String],
    unitsPerEm: Double with js.UndefOr[Double]
  ): FontConstructorOptions = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptions]
  }
  
  @scala.inline
  implicit class FontConstructorOptionsMutableBuilder[Self <: FontConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscender(value: Double with js.UndefOr[Double]): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Double): Self = StObject.set(x, "createdTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "createdTimestamp", js.undefined)
    
    @scala.inline
    def setDescender(value: Double with js.UndefOr[Double]): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDesigner(value: String): Self = StObject.set(x, "designer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignerURL(value: String): Self = StObject.set(x, "designerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignerURLUndefined: Self = StObject.set(x, "designerURL", js.undefined)
    
    @scala.inline
    def setDesignerUndefined: Self = StObject.set(x, "designer", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String with js.UndefOr[String]): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsSelection(value: String): Self = StObject.set(x, "fsSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsSelectionUndefined: Self = StObject.set(x, "fsSelection", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setGlyphs(value: js.Array[Glyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphsVarargs(value: Glyph*): Self = StObject.set(x, "glyphs", js.Array(value :_*))
    
    @scala.inline
    def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseURL(value: String): Self = StObject.set(x, "licenseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseURLUndefined: Self = StObject.set(x, "licenseURL", js.undefined)
    
    @scala.inline
    def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerURL(value: String): Self = StObject.set(x, "manufacturerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerURLUndefined: Self = StObject.set(x, "manufacturerURL", js.undefined)
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setPostScriptName(value: String): Self = StObject.set(x, "postScriptName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostScriptNameUndefined: Self = StObject.set(x, "postScriptName", js.undefined)
    
    @scala.inline
    def setStyleName(value: String with js.UndefOr[String]): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrademark(value: String): Self = StObject.set(x, "trademark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrademarkUndefined: Self = StObject.set(x, "trademark", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: Double with js.UndefOr[Double]): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWeightClass(value: String): Self = StObject.set(x, "weightClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightClassUndefined: Self = StObject.set(x, "weightClass", js.undefined)
    
    @scala.inline
    def setWidthClass(value: String): Self = StObject.set(x, "widthClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthClassUndefined: Self = StObject.set(x, "widthClass", js.undefined)
  }
}
