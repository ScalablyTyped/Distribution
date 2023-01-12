package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basic extends StObject {
  
  var basic: PartialCSSProperties
  
  var chip: PartialCSSProperties
  
  var container: PartialCSSProperties
  
  var table: PartialCSSProperties
  
  var tableCell: PartialCSSProperties
  
  var tableCellValue: PartialCSSProperties
}
object Basic {
  
  inline def apply(
    basic: PartialCSSProperties,
    chip: PartialCSSProperties,
    container: PartialCSSProperties,
    table: PartialCSSProperties,
    tableCell: PartialCSSProperties,
    tableCellValue: PartialCSSProperties
  ): Basic = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], chip = chip.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableCell = tableCell.asInstanceOf[js.Any], tableCellValue = tableCellValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
    
    inline def setBasic(value: PartialCSSProperties): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setChip(value: PartialCSSProperties): Self = StObject.set(x, "chip", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: PartialCSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setTable(value: PartialCSSProperties): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableCell(value: PartialCSSProperties): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
    
    inline def setTableCellValue(value: PartialCSSProperties): Self = StObject.set(x, "tableCellValue", value.asInstanceOf[js.Any])
  }
}
