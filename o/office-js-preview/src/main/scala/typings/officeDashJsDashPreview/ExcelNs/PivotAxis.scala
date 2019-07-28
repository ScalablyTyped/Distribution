package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Column" */ val column: typings.officeDashJsDashPreview.ExcelNs.PivotAxis.column with String = js.native
  /* "Data" */ val data: typings.officeDashJsDashPreview.ExcelNs.PivotAxis.data with String = js.native
  /* "Filter" */ val filter: typings.officeDashJsDashPreview.ExcelNs.PivotAxis.filter with String = js.native
  /* "Row" */ val row: typings.officeDashJsDashPreview.ExcelNs.PivotAxis.row with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.ExcelNs.PivotAxis.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PivotAxis with String] = js.native
}

