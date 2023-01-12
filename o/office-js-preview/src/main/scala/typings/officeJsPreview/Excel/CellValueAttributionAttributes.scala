package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The attribution attributes object represents the set of details that can be used to describe where information came from, if the information comes from a public source.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CellValueAttributionAttributes extends StObject {
  
  /**
    * Represents a URL to a license or source that describes how this property can be used.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var licenseAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a name for the license that governs this property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var licenseText: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a URL to the source of the `CellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var sourceAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a name for the source of the `CellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var sourceText: js.UndefOr[String] = js.undefined
}
object CellValueAttributionAttributes {
  
  inline def apply(): CellValueAttributionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValueAttributionAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellValueAttributionAttributes] (val x: Self) extends AnyVal {
    
    inline def setLicenseAddress(value: String): Self = StObject.set(x, "licenseAddress", value.asInstanceOf[js.Any])
    
    inline def setLicenseAddressUndefined: Self = StObject.set(x, "licenseAddress", js.undefined)
    
    inline def setLicenseText(value: String): Self = StObject.set(x, "licenseText", value.asInstanceOf[js.Any])
    
    inline def setLicenseTextUndefined: Self = StObject.set(x, "licenseText", js.undefined)
    
    inline def setSourceAddress(value: String): Self = StObject.set(x, "sourceAddress", value.asInstanceOf[js.Any])
    
    inline def setSourceAddressUndefined: Self = StObject.set(x, "sourceAddress", js.undefined)
    
    inline def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
    
    inline def setSourceTextUndefined: Self = StObject.set(x, "sourceText", js.undefined)
  }
}
