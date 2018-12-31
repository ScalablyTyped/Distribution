package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatType extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatType")
@js.native
object ConditionalFormatType extends js.Object {
  @js.native
  sealed trait cellValue
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait colorScale
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait containsText
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait custom
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait dataBar
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait iconSet
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait presetCriteria
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait topBottom
    extends officeDashJsLib.ExcelNs.ConditionalFormatType
  
  /* "CellValue" */ val cellValue: cellValue with java.lang.String = js.native
  /* "ColorScale" */ val colorScale: colorScale with java.lang.String = js.native
  /* "ContainsText" */ val containsText: containsText with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "DataBar" */ val dataBar: dataBar with java.lang.String = js.native
  /* "IconSet" */ val iconSet: iconSet with java.lang.String = js.native
  /* "PresetCriteria" */ val presetCriteria: presetCriteria with java.lang.String = js.native
  /* "TopBottom" */ val topBottom: topBottom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalFormatType with java.lang.String] = js.native
}

