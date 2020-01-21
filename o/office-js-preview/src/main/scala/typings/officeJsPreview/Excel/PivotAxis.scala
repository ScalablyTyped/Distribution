package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotAxis extends js.Object

/**
  *
  * The ShowAs Calculation function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends js.Object {
  /**
    *
    * The column axis.
    *
    */
  @js.native
  sealed trait column extends PivotAxis
  
  /**
    *
    * The data axis.
    *
    */
  @js.native
  sealed trait data extends PivotAxis
  
  /**
    *
    * The filter axis.
    *
    */
  @js.native
  sealed trait filter extends PivotAxis
  
  /**
    *
    * The row axis.
    *
    */
  @js.native
  sealed trait row extends PivotAxis
  
  /**
    *
    * The axis or region is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends PivotAxis
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PivotAxis with String] = js.native
  /* "Column" */ @js.native
  object column extends TopLevel[column with String]
  
  /* "Data" */ @js.native
  object data extends TopLevel[data with String]
  
  /* "Filter" */ @js.native
  object filter extends TopLevel[filter with String]
  
  /* "Row" */ @js.native
  object row extends TopLevel[row with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

