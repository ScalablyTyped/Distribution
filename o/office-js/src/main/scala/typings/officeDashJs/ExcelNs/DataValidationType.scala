package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationType extends js.Object

/**
  *
  * Represents Data validation type enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationType")
@js.native
object DataValidationType extends js.Object {
  /**
    *
    * Custom data validation type
    *
    */
  @js.native
  sealed trait custom extends DataValidationType
  
  /**
    *
    * Date data validation type
    *
    */
  @js.native
  sealed trait date extends DataValidationType
  
  /**
    *
    * Decimal data validation type
    *
    */
  @js.native
  sealed trait decimal extends DataValidationType
  
  /**
    *
    * Inconsistent means that the range has inconsistent data validation (there are different rules on different cells)
    *
    */
  @js.native
  sealed trait inconsistent extends DataValidationType
  
  /**
    *
    * List data validation type
    *
    */
  @js.native
  sealed trait list extends DataValidationType
  
  /**
    *
    * MixedCriteria means that the range has data validation present on some but not all cells
    *
    */
  @js.native
  sealed trait mixedCriteria extends DataValidationType
  
  /**
    *
    * None means allow any value and so there is no data validation in the range.
    *
    */
  @js.native
  sealed trait none extends DataValidationType
  
  /**
    *
    * Text length data validation type
    *
    */
  @js.native
  sealed trait textLength extends DataValidationType
  
  /**
    *
    * Time data validation type
    *
    */
  @js.native
  sealed trait time extends DataValidationType
  
  /**
    *
    * Whole number data validation type
    *
    */
  @js.native
  sealed trait wholeNumber extends DataValidationType
  
  /* "Custom" */ val custom: typings.officeDashJs.ExcelNs.DataValidationType.custom with String = js.native
  /* "Date" */ val date: typings.officeDashJs.ExcelNs.DataValidationType.date with String = js.native
  /* "Decimal" */ val decimal: typings.officeDashJs.ExcelNs.DataValidationType.decimal with String = js.native
  /* "Inconsistent" */ val inconsistent: typings.officeDashJs.ExcelNs.DataValidationType.inconsistent with String = js.native
  /* "List" */ val list: typings.officeDashJs.ExcelNs.DataValidationType.list with String = js.native
  /* "MixedCriteria" */ val mixedCriteria: typings.officeDashJs.ExcelNs.DataValidationType.mixedCriteria with String = js.native
  /* "None" */ val none: typings.officeDashJs.ExcelNs.DataValidationType.none with String = js.native
  /* "TextLength" */ val textLength: typings.officeDashJs.ExcelNs.DataValidationType.textLength with String = js.native
  /* "Time" */ val time: typings.officeDashJs.ExcelNs.DataValidationType.time with String = js.native
  /* "WholeNumber" */ val wholeNumber: typings.officeDashJs.ExcelNs.DataValidationType.wholeNumber with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationType with String] = js.native
}

