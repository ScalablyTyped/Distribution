package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableCellStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableCellStyle` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the table cell background color, set `fields` to `"backgroundColor"`. To reset a property to its default value, include its field name
    * in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The style to set on the table cells. When updating borders, if a cell shares a border with an adjacent cell, the corresponding border property of the adjacent cell is updated as
    * well. Borders that are merged and invisible are not updated. Since updating a border shared by adjacent cells in the same request can cause conflicting border updates, border
    * updates are applied in the following order: - `border_right` - `border_left` - `border_bottom` - `border_top`
    */
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
  
  /** The table range representing the subset of the table to which the updates are applied. */
  var tableRange: js.UndefOr[TableRange] = js.undefined
  
  /** The location where the table starts in the document. When specified, the updates are applied to all the cells in the table. */
  var tableStartLocation: js.UndefOr[Location] = js.undefined
}
object UpdateTableCellStyleRequest {
  
  inline def apply(): UpdateTableCellStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableCellStyleRequest]
  }
  
  extension [Self <: UpdateTableCellStyleRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setTableCellStyle(value: TableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
    
    inline def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
    
    inline def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
    
    inline def setTableStartLocation(value: Location): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
