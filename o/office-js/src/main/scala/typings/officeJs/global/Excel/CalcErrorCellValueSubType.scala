package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents types of #CALC! errors.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.CalcErrorCellValueSubType")
@js.native
object CalcErrorCellValueSubType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CalcErrorCellValueSubType & String] = js.native
  
  /* "ArrayOfArrays" */ val arrayOfArrays: typings.officeJs.Excel.CalcErrorCellValueSubType.arrayOfArrays & String = js.native
  
  /* "ArrayOfRanges" */ val arrayOfRanges: typings.officeJs.Excel.CalcErrorCellValueSubType.arrayOfRanges & String = js.native
  
  /* "DataTableReferencedPendingFormula" */ val dataTableReferencedPendingFormula: typings.officeJs.Excel.CalcErrorCellValueSubType.dataTableReferencedPendingFormula & String = js.native
  
  /* "EmptyArray" */ val emptyArray: typings.officeJs.Excel.CalcErrorCellValueSubType.emptyArray & String = js.native
  
  /* "LambdaInCell" */ val lambdaInCell: typings.officeJs.Excel.CalcErrorCellValueSubType.lambdaInCell & String = js.native
  
  /* "TextOverflow" */ val textOverflow: typings.officeJs.Excel.CalcErrorCellValueSubType.textOverflow & String = js.native
  
  /* "TooDeeplyNested" */ val tooDeeplyNested: typings.officeJs.Excel.CalcErrorCellValueSubType.tooDeeplyNested & String = js.native
  
  /* "TooManyCells" */ val tooManyCells: typings.officeJs.Excel.CalcErrorCellValueSubType.tooManyCells & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.CalcErrorCellValueSubType.unknown & String = js.native
  
  /* "UnsupportedLifting" */ val unsupportedLifting: typings.officeJs.Excel.CalcErrorCellValueSubType.unsupportedLifting & String = js.native
}
