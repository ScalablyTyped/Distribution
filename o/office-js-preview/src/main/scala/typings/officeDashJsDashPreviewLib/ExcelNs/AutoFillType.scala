package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFillType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.AutoFillType")
@js.native
object AutoFillType extends js.Object {
  @js.native
  sealed trait fillCopy
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillDays
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillDefault
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillFormats
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillMonths
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillSeries
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillValues
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillWeekdays
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait fillYears
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait flashFill
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait growthTrend
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  @js.native
  sealed trait linearTrend
    extends officeDashJsDashPreviewLib.ExcelNs.AutoFillType
  
  /* "FillCopy" */ val fillCopy: fillCopy with java.lang.String = js.native
  /* "FillDays" */ val fillDays: fillDays with java.lang.String = js.native
  /* "FillDefault" */ val fillDefault: fillDefault with java.lang.String = js.native
  /* "FillFormats" */ val fillFormats: fillFormats with java.lang.String = js.native
  /* "FillMonths" */ val fillMonths: fillMonths with java.lang.String = js.native
  /* "FillSeries" */ val fillSeries: fillSeries with java.lang.String = js.native
  /* "FillValues" */ val fillValues: fillValues with java.lang.String = js.native
  /* "FillWeekdays" */ val fillWeekdays: fillWeekdays with java.lang.String = js.native
  /* "FillYears" */ val fillYears: fillYears with java.lang.String = js.native
  /* "FlashFill" */ val flashFill: flashFill with java.lang.String = js.native
  /* "GrowthTrend" */ val growthTrend: growthTrend with java.lang.String = js.native
  /* "LinearTrend" */ val linearTrend: linearTrend with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.AutoFillType with java.lang.String] = js.native
}

