package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.DataValidationType.custom
import typings.officeDashJsDashPreview.Excel.DataValidationType.date
import typings.officeDashJsDashPreview.Excel.DataValidationType.decimal
import typings.officeDashJsDashPreview.Excel.DataValidationType.inconsistent
import typings.officeDashJsDashPreview.Excel.DataValidationType.list
import typings.officeDashJsDashPreview.Excel.DataValidationType.mixedCriteria
import typings.officeDashJsDashPreview.Excel.DataValidationType.none
import typings.officeDashJsDashPreview.Excel.DataValidationType.textLength
import typings.officeDashJsDashPreview.Excel.DataValidationType.time
import typings.officeDashJsDashPreview.Excel.DataValidationType.wholeNumber
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationType with String] = js.native
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "Date" */ @js.native
  object date extends TopLevel[date with String]
  
  /* "Decimal" */ @js.native
  object decimal extends TopLevel[decimal with String]
  
  /* "Inconsistent" */ @js.native
  object inconsistent extends TopLevel[inconsistent with String]
  
  /* "List" */ @js.native
  object list extends TopLevel[list with String]
  
  /* "MixedCriteria" */ @js.native
  object mixedCriteria extends TopLevel[mixedCriteria with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "TextLength" */ @js.native
  object textLength extends TopLevel[textLength with String]
  
  /* "Time" */ @js.native
  object time extends TopLevel[time with String]
  
  /* "WholeNumber" */ @js.native
  object wholeNumber extends TopLevel[wholeNumber with String]
  
}

