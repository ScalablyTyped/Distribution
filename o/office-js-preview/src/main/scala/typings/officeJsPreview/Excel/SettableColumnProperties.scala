package typings.officeJsPreview.Excel

import typings.officeJsPreview.anon.CellPropertiesFormatcolum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the input parameter of setColumnProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SettableColumnProperties extends SettableCellProperties {
  
  /**
    *
    * Represents the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableColumnProperties: js.UndefOr[CellPropertiesFormatcolum] = js.native
}
object SettableColumnProperties {
  
  @scala.inline
  def apply(): SettableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableColumnProperties]
  }
  
  @scala.inline
  implicit class SettableColumnPropertiesMutableBuilder[Self <: SettableColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    @scala.inline
    def setFormat(value: CellPropertiesFormatcolum): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
