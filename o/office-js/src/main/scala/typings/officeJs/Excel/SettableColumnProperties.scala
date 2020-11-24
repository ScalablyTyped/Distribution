package typings.officeJs.Excel

import typings.officeJs.anon.CellPropertiesFormatcolum
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
  implicit class SettableColumnPropertiesOps[Self <: SettableColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnHidden(value: Boolean): Self = this.set("columnHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHidden: Self = this.set("columnHidden", js.undefined)
    
    @scala.inline
    def setFormat(value: CellPropertiesFormatcolum): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
