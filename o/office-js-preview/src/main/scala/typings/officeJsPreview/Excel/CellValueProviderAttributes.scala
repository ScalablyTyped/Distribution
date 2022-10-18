package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The provider attributes object represents the set of details used in card view to provide specified branding information for a `CellValue` type that supports provider attributes.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CellValueProviderAttributes extends StObject {
  
  /**
    * Represents the provider description property that is used in card view if no logo is specified.
    * If a logo is specified, this will be used as tooltip text.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a URL used to download an image that will be used as a logo in card view.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var logoSourceAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a URL that is the navigation target if the user clicks on the logo element in card view.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var logoTargetAddress: js.UndefOr[String] = js.undefined
}
object CellValueProviderAttributes {
  
  inline def apply(): CellValueProviderAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValueProviderAttributes]
  }
  
  extension [Self <: CellValueProviderAttributes](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLogoSourceAddress(value: String): Self = StObject.set(x, "logoSourceAddress", value.asInstanceOf[js.Any])
    
    inline def setLogoSourceAddressUndefined: Self = StObject.set(x, "logoSourceAddress", js.undefined)
    
    inline def setLogoTargetAddress(value: String): Self = StObject.set(x, "logoTargetAddress", value.asInstanceOf[js.Any])
    
    inline def setLogoTargetAddressUndefined: Self = StObject.set(x, "logoTargetAddress", js.undefined)
  }
}
