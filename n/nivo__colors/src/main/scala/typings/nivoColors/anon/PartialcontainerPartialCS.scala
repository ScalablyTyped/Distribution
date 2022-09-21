package typings.nivoColors.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  container :std.Partial<react.react.CSSProperties>,   basic :std.Partial<react.react.CSSProperties>,   chip :std.Partial<react.react.CSSProperties>,   table :std.Partial<react.react.CSSProperties>,   tableCell :std.Partial<react.react.CSSProperties>,   tableCellValue :std.Partial<react.react.CSSProperties>}> */
trait PartialcontainerPartialCS extends StObject {
  
  var basic: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var chip: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var container: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var table: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var tableCell: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var tableCellValue: js.UndefOr[PartialCSSProperties] = js.undefined
}
object PartialcontainerPartialCS {
  
  inline def apply(): PartialcontainerPartialCS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcontainerPartialCS]
  }
  
  extension [Self <: PartialcontainerPartialCS](x: Self) {
    
    inline def setBasic(value: PartialCSSProperties): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setChip(value: PartialCSSProperties): Self = StObject.set(x, "chip", value.asInstanceOf[js.Any])
    
    inline def setChipUndefined: Self = StObject.set(x, "chip", js.undefined)
    
    inline def setContainer(value: PartialCSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setTable(value: PartialCSSProperties): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableCell(value: PartialCSSProperties): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
    
    inline def setTableCellUndefined: Self = StObject.set(x, "tableCell", js.undefined)
    
    inline def setTableCellValue(value: PartialCSSProperties): Self = StObject.set(x, "tableCellValue", value.asInstanceOf[js.Any])
    
    inline def setTableCellValueUndefined: Self = StObject.set(x, "tableCellValue", js.undefined)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
