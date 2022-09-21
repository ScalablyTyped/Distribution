package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data validation type enum.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationType")
@js.native
object DataValidationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataValidationType & String] = js.native
  
  /* "Custom" */ val custom: typings.officeJs.Excel.DataValidationType.custom & String = js.native
  
  /* "Date" */ val date: typings.officeJs.Excel.DataValidationType.date & String = js.native
  
  /* "Decimal" */ val decimal: typings.officeJs.Excel.DataValidationType.decimal & String = js.native
  
  /* "Inconsistent" */ val inconsistent: typings.officeJs.Excel.DataValidationType.inconsistent & String = js.native
  
  /* "List" */ val list: typings.officeJs.Excel.DataValidationType.list & String = js.native
  
  /* "MixedCriteria" */ val mixedCriteria: typings.officeJs.Excel.DataValidationType.mixedCriteria & String = js.native
  
  /* "None" */ val none: typings.officeJs.Excel.DataValidationType.none & String = js.native
  
  /* "TextLength" */ val textLength: typings.officeJs.Excel.DataValidationType.textLength & String = js.native
  
  /* "Time" */ val time: typings.officeJs.Excel.DataValidationType.time & String = js.native
  
  /* "WholeNumber" */ val wholeNumber: typings.officeJs.Excel.DataValidationType.wholeNumber & String = js.native
}
