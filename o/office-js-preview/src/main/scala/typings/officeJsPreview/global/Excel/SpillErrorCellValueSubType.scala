package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #SPILL! errors.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.SpillErrorCellValueSubType")
@js.native
object SpillErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.SpillErrorCellValueSubType & String] = js.native
  
  /* "Collision" */ val collision: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.collision & String = js.native
  
  /* "IndeterminateSize" */ val indeterminateSize: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.indeterminateSize & String = js.native
  
  /* "MergedCell" */ val mergedCell: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.mergedCell & String = js.native
  
  /* "OutOfMemoryWhileCalc" */ val outOfMemoryWhileCalc: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.outOfMemoryWhileCalc & String = js.native
  
  /* "Table" */ val table: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.table & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.unknown & String = js.native
  
  /* "WorksheetEdge" */ val worksheetEdge: typings.officeJsPreview.Excel.SpillErrorCellValueSubType.worksheetEdge & String = js.native
}
