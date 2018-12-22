package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisCategoryType extends js.Object

/**
     *
     * Specifies the type of the category axis.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.ChartAxisCategoryType")
@js.native
object ChartAxisCategoryType extends js.Object {
  /**
           *
           * Excel controls the axis type.
           *
           */
  @js.native
  sealed trait automatic
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisCategoryType
  
  /**
           *
           * Axis groups data on a time scale.
           *
           */
  @js.native
  sealed trait dateAxis
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisCategoryType
  
  /**
           *
           * Axis groups data by an arbitrary set of categories.
           *
           */
  @js.native
  sealed trait textAxis
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisCategoryType
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "DateAxis" */ val dateAxis: dateAxis with java.lang.String = js.native
  /* "TextAxis" */ val textAxis: textAxis with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartAxisCategoryType with java.lang.String] = js.native
}

