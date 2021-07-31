package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the returned properties of getRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait RowProperties
  extends StObject
     with SettableRowProperties {
  
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
    * Represents the `rowIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object RowProperties {
  
  @scala.inline
  def apply(): RowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProperties]
  }
  
  @scala.inline
  implicit class RowPropertiesMutableBuilder[Self <: RowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocal(value: String): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
