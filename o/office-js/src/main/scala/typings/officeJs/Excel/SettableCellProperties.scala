package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the input parameter of setCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableCellProperties extends StObject {
  
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[CellPropertiesFormat] = js.undefined
  
  /**
    *
    * Represents the `hyperlink` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  
  /**
    *
    * Represents the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[String] = js.undefined
}
object SettableCellProperties {
  
  @scala.inline
  def apply(): SettableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableCellProperties]
  }
  
  @scala.inline
  implicit class SettableCellPropertiesMutableBuilder[Self <: SettableCellProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: CellPropertiesFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHyperlink(value: RangeHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
