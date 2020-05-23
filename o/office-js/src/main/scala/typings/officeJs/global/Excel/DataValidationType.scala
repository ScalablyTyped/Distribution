package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents Data validation type enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationType")
@js.native
object DataValidationType extends js.Object {
  /* "Custom" */ val custom: typings.officeJs.Excel.DataValidationType.custom with String = js.native
  /* "Date" */ val date: typings.officeJs.Excel.DataValidationType.date with String = js.native
  /* "Decimal" */ val decimal: typings.officeJs.Excel.DataValidationType.decimal with String = js.native
  /* "Inconsistent" */ val inconsistent: typings.officeJs.Excel.DataValidationType.inconsistent with String = js.native
  /* "List" */ val list: typings.officeJs.Excel.DataValidationType.list with String = js.native
  /* "MixedCriteria" */ val mixedCriteria: typings.officeJs.Excel.DataValidationType.mixedCriteria with String = js.native
  /* "None" */ val none: typings.officeJs.Excel.DataValidationType.none with String = js.native
  /* "TextLength" */ val textLength: typings.officeJs.Excel.DataValidationType.textLength with String = js.native
  /* "Time" */ val time: typings.officeJs.Excel.DataValidationType.time with String = js.native
  /* "WholeNumber" */ val wholeNumber: typings.officeJs.Excel.DataValidationType.wholeNumber with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataValidationType with String] = js.native
}

