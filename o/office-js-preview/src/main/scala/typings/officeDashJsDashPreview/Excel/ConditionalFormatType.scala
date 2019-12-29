package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatType with String] = js.native
  /* "CellValue" */ @js.native
  object cellValue extends TopLevel[cellValue with String]
  
  /* "ColorScale" */ @js.native
  object colorScale extends TopLevel[colorScale with String]
  
  /* "ContainsText" */ @js.native
  object containsText extends TopLevel[containsText with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "DataBar" */ @js.native
  object dataBar extends TopLevel[dataBar with String]
  
  /* "IconSet" */ @js.native
  object iconSet extends TopLevel[iconSet with String]
  
  /* "PresetCriteria" */ @js.native
  object presetCriteria extends TopLevel[presetCriteria with String]
  
  /* "TopBottom" */ @js.native
  object topBottom extends TopLevel[topBottom with String]
  
}

