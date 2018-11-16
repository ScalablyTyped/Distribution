package typings
package officeDashJsLib.ExcelNs

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
  sealed trait bottomItems
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait bottomPercent
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait cellColor
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait custom
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait dynamic
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait fontColor
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait icon
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait topItems
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait topPercent
    extends officeDashJsLib.ExcelNs.FilterOn
  
  @js.native
  sealed trait values
    extends officeDashJsLib.ExcelNs.FilterOn
  
  /* "BottomItems" */ val bottomItems: bottomItems with java.lang.String = js.native
  /* "BottomPercent" */ val bottomPercent: bottomPercent with java.lang.String = js.native
  /* "CellColor" */ val cellColor: cellColor with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "Dynamic" */ val dynamic: dynamic with java.lang.String = js.native
  /* "FontColor" */ val fontColor: fontColor with java.lang.String = js.native
  /* "Icon" */ val icon: icon with java.lang.String = js.native
  /* "TopItems" */ val topItems: topItems with java.lang.String = js.native
  /* "TopPercent" */ val topPercent: topPercent with java.lang.String = js.native
  /* "Values" */ val values: values with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.FilterOn with java.lang.String] = js.native
}

