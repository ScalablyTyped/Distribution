package typings.officeJs.Excel

import typings.officeJs.anon.CellPropertiesFormatrowHe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the input parameter of setRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableRowProperties
  extends StObject
     with SettableCellProperties {
  
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormatrowHe] = js.undefined
  
  /**
    *
    * Represents the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
}
object SettableRowProperties {
  
  @scala.inline
  def apply(): SettableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableRowProperties]
  }
  
  @scala.inline
  implicit class SettableRowPropertiesMutableBuilder[Self <: SettableRowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: CellPropertiesFormatrowHe): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
  }
}
