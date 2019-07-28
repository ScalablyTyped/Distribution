package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait cellValue extends ConditionalFormatType
  
  @js.native
  sealed trait colorScale extends ConditionalFormatType
  
  @js.native
  sealed trait containsText extends ConditionalFormatType
  
  @js.native
  sealed trait custom extends ConditionalFormatType
  
  @js.native
  sealed trait dataBar extends ConditionalFormatType
  
  @js.native
  sealed trait iconSet extends ConditionalFormatType
  
  @js.native
  sealed trait presetCriteria extends ConditionalFormatType
  
  @js.native
  sealed trait topBottom extends ConditionalFormatType
  
  /* "CellValue" */ val cellValue: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.cellValue with String = js.native
  /* "ColorScale" */ val colorScale: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.colorScale with String = js.native
  /* "ContainsText" */ val containsText: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.containsText with String = js.native
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.custom with String = js.native
  /* "DataBar" */ val dataBar: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.dataBar with String = js.native
  /* "IconSet" */ val iconSet: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.iconSet with String = js.native
  /* "PresetCriteria" */ val presetCriteria: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.presetCriteria with String = js.native
  /* "TopBottom" */ val topBottom: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatType.topBottom with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatType with String] = js.native
}

