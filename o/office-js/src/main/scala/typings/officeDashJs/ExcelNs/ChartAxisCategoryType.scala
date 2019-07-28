package typings.officeDashJs.ExcelNs

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
  sealed trait automatic extends ChartAxisCategoryType
  
  /**
    *
    * Axis groups data on a time scale.
    *
    */
  @js.native
  sealed trait dateAxis extends ChartAxisCategoryType
  
  /**
    *
    * Axis groups data by an arbitrary set of categories.
    *
    */
  @js.native
  sealed trait textAxis extends ChartAxisCategoryType
  
  /* "Automatic" */ val automatic: typings.officeDashJs.ExcelNs.ChartAxisCategoryType.automatic with String = js.native
  /* "DateAxis" */ val dateAxis: typings.officeDashJs.ExcelNs.ChartAxisCategoryType.dateAxis with String = js.native
  /* "TextAxis" */ val textAxis: typings.officeDashJs.ExcelNs.ChartAxisCategoryType.textAxis with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisCategoryType with String] = js.native
}

