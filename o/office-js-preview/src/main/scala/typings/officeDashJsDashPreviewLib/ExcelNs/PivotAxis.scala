package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotAxis extends js.Object

/**
     *
     * The ShowAs Calculation function for the Data Pivot Field.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
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
  sealed trait column
    extends officeDashJsDashPreviewLib.ExcelNs.PivotAxis
  
  /**
           *
           * The data axis.
           *
           */
  @js.native
  sealed trait data
    extends officeDashJsDashPreviewLib.ExcelNs.PivotAxis
  
  /**
           *
           * The filter axis.
           *
           */
  @js.native
  sealed trait filter
    extends officeDashJsDashPreviewLib.ExcelNs.PivotAxis
  
  /**
           *
           * The row axis.
           *
           */
  @js.native
  sealed trait row
    extends officeDashJsDashPreviewLib.ExcelNs.PivotAxis
  
  /**
           *
           * The axis or region is unknown or unsupported.
           *
           */
  @js.native
  sealed trait unknown
    extends officeDashJsDashPreviewLib.ExcelNs.PivotAxis
  
  /* "Column" */ val column: column with java.lang.String = js.native
  /* "Data" */ val data: data with java.lang.String = js.native
  /* "Filter" */ val filter: filter with java.lang.String = js.native
  /* "Row" */ val row: row with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.PivotAxis with java.lang.String] = js.native
}

