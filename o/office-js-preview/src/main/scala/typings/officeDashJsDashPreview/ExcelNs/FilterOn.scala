package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOn")
@js.native
object FilterOn extends js.Object {
  @js.native
  sealed trait bottomItems extends FilterOn
  
  @js.native
  sealed trait bottomPercent extends FilterOn
  
  @js.native
  sealed trait cellColor extends FilterOn
  
  @js.native
  sealed trait custom extends FilterOn
  
  @js.native
  sealed trait dynamic extends FilterOn
  
  @js.native
  sealed trait fontColor extends FilterOn
  
  @js.native
  sealed trait icon extends FilterOn
  
  @js.native
  sealed trait topItems extends FilterOn
  
  @js.native
  sealed trait topPercent extends FilterOn
  
  @js.native
  sealed trait values extends FilterOn
  
  /* "BottomItems" */ val bottomItems: typings.officeDashJsDashPreview.ExcelNs.FilterOn.bottomItems with String = js.native
  /* "BottomPercent" */ val bottomPercent: typings.officeDashJsDashPreview.ExcelNs.FilterOn.bottomPercent with String = js.native
  /* "CellColor" */ val cellColor: typings.officeDashJsDashPreview.ExcelNs.FilterOn.cellColor with String = js.native
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.ExcelNs.FilterOn.custom with String = js.native
  /* "Dynamic" */ val dynamic: typings.officeDashJsDashPreview.ExcelNs.FilterOn.dynamic with String = js.native
  /* "FontColor" */ val fontColor: typings.officeDashJsDashPreview.ExcelNs.FilterOn.fontColor with String = js.native
  /* "Icon" */ val icon: typings.officeDashJsDashPreview.ExcelNs.FilterOn.icon with String = js.native
  /* "TopItems" */ val topItems: typings.officeDashJsDashPreview.ExcelNs.FilterOn.topItems with String = js.native
  /* "TopPercent" */ val topPercent: typings.officeDashJsDashPreview.ExcelNs.FilterOn.topPercent with String = js.native
  /* "Values" */ val values: typings.officeDashJsDashPreview.ExcelNs.FilterOn.values with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterOn with String] = js.native
}

