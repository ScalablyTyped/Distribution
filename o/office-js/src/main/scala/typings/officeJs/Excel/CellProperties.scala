package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the returned properties of getCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellProperties
  extends StObject
     with SettableCellProperties {
  
  /**
    *
    * Represents the `address` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the `addressLocal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the `hidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object CellProperties {
  
  @scala.inline
  def apply(): CellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProperties]
  }
  
  @scala.inline
  implicit class CellPropertiesMutableBuilder[Self <: CellProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocal(value: String): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
