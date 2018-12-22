package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait colorScale
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait containsText
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait custom
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait dataBar
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait iconSet
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait presetCriteria
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  @js.native
  sealed trait topBottom
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType
  
  /* "CellValue" */ val cellValue: cellValue with java.lang.String = js.native
  /* "ColorScale" */ val colorScale: colorScale with java.lang.String = js.native
  /* "ContainsText" */ val containsText: containsText with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "DataBar" */ val dataBar: dataBar with java.lang.String = js.native
  /* "IconSet" */ val iconSet: iconSet with java.lang.String = js.native
  /* "PresetCriteria" */ val presetCriteria: presetCriteria with java.lang.String = js.native
  /* "TopBottom" */ val topBottom: topBottom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatType with java.lang.String] = js.native
}

