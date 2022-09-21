package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.array
import typings.officeJsPreview.Excel.CellValueType.entity
import typings.officeJsPreview.Excel.ReferenceValueType.root
import typings.officeJsPreview.officeJsPreviewStrings.Array
import typings.officeJsPreview.officeJsPreviewStrings.Entity
import typings.officeJsPreview.officeJsPreviewStrings.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value in a cell.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
/* Rewritten from type alias, can be one of: 
  - typings.officeJsPreview.Excel.ArrayCellValue
  - typings.officeJsPreview.Excel.EntityCellValue
  - typings.officeJsPreview.Excel.RootReferenceCellValue
*/
trait ReferencedValue extends StObject
object ReferencedValue {
  
  inline def ArrayCellValue(
    elements: js.Array[js.Array[CellValue]],
    `type`: array | typings.officeJsPreview.Excel.ReferenceValueType.array | Array
  ): typings.officeJsPreview.Excel.ArrayCellValue = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJsPreview.Excel.ArrayCellValue]
  }
  
  inline def EntityCellValue(`type`: entity | typings.officeJsPreview.Excel.ReferenceValueType.entity | Entity): typings.officeJsPreview.Excel.EntityCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJsPreview.Excel.EntityCellValue]
  }
  
  inline def RootReferenceCellValue(`type`: root | Root): typings.officeJsPreview.Excel.RootReferenceCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJsPreview.Excel.RootReferenceCellValue]
  }
}
