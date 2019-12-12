package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartAxisCategoryType.automatic
import typings.officeDashJsDashPreview.Excel.ChartAxisCategoryType.dateAxis
import typings.officeDashJsDashPreview.Excel.ChartAxisCategoryType.textAxis
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisCategoryType with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "DateAxis" */ @js.native
  object dateAxis extends TopLevel[dateAxis with String]
  
  /* "TextAxis" */ @js.native
  object textAxis extends TopLevel[textAxis with String]
  
}

