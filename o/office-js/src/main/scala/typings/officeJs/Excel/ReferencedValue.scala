package typings.officeJs.Excel

import typings.officeJs.Excel.CellValueType.array
import typings.officeJs.Excel.CellValueType.entity
import typings.officeJs.Excel.ReferenceValueType.root
import typings.officeJs.officeJsStrings.Array
import typings.officeJs.officeJsStrings.Entity
import typings.officeJs.officeJsStrings.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value in a cell.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
/* Rewritten from type alias, can be one of: 
  - typings.officeJs.Excel.ArrayCellValue
  - typings.officeJs.Excel.EntityCellValue
  - typings.officeJs.Excel.RootReferenceCellValue
*/
trait ReferencedValue extends StObject
object ReferencedValue {
  
  inline def ArrayCellValue(
    elements: js.Array[js.Array[CellValue]],
    `type`: array | typings.officeJs.Excel.ReferenceValueType.array | Array
  ): typings.officeJs.Excel.ArrayCellValue = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJs.Excel.ArrayCellValue]
  }
  
  inline def EntityCellValue(`type`: entity | typings.officeJs.Excel.ReferenceValueType.entity | Entity): typings.officeJs.Excel.EntityCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJs.Excel.EntityCellValue]
  }
  
  inline def RootReferenceCellValue(`type`: root | Root): typings.officeJs.Excel.RootReferenceCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJs.Excel.RootReferenceCellValue]
  }
}
