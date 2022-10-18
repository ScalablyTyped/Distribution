package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #SPILL! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.SpillErrorCellValueSubType")
@js.native
object SpillErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SpillErrorCellValueSubType & String] = js.native
  
  /* "Collision" */ val collision: typings.officeJs.Excel.SpillErrorCellValueSubType.collision & String = js.native
  
  /* "IndeterminateSize" */ val indeterminateSize: typings.officeJs.Excel.SpillErrorCellValueSubType.indeterminateSize & String = js.native
  
  /* "MergedCell" */ val mergedCell: typings.officeJs.Excel.SpillErrorCellValueSubType.mergedCell & String = js.native
  
  /* "OutOfMemoryWhileCalc" */ val outOfMemoryWhileCalc: typings.officeJs.Excel.SpillErrorCellValueSubType.outOfMemoryWhileCalc & String = js.native
  
  /* "Table" */ val table: typings.officeJs.Excel.SpillErrorCellValueSubType.table & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.SpillErrorCellValueSubType.unknown & String = js.native
  
  /* "WorksheetEdge" */ val worksheetEdge: typings.officeJs.Excel.SpillErrorCellValueSubType.worksheetEdge & String = js.native
}
