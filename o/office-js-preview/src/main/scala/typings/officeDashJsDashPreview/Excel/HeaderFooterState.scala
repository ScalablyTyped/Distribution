package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderFooterState extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.HeaderFooterState")
@js.native
object HeaderFooterState extends js.Object {
  /**
    *
    * Only one general header/footer is used for all pages printed.
    *
    */
  @js.native
  sealed trait default extends HeaderFooterState
  
  /**
    *
    * There is a separate first page header/footer, and a general header/footer used for all other pages.
    *
    */
  @js.native
  sealed trait firstAndDefault extends HeaderFooterState
  
  /**
    *
    * There is a separate first page header/footer, then there is a separate header/footer for odd and even pages.
    *
    */
  @js.native
  sealed trait firstOddAndEven extends HeaderFooterState
  
  /**
    *
    * There is a different header/footer for odd and even pages.
    *
    */
  @js.native
  sealed trait oddAndEven extends HeaderFooterState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HeaderFooterState with String] = js.native
  /* "Default" */ @js.native
  object default extends TopLevel[default with String]
  
  /* "FirstAndDefault" */ @js.native
  object firstAndDefault extends TopLevel[firstAndDefault with String]
  
  /* "FirstOddAndEven" */ @js.native
  object firstOddAndEven extends TopLevel[firstOddAndEven with String]
  
  /* "OddAndEven" */ @js.native
  object oddAndEven extends TopLevel[oddAndEven with String]
  
}

