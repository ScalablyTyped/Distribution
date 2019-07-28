package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorksheetPositionType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetPositionType")
@js.native
object WorksheetPositionType extends js.Object {
  @js.native
  sealed trait after extends WorksheetPositionType
  
  @js.native
  sealed trait before extends WorksheetPositionType
  
  @js.native
  sealed trait beginning extends WorksheetPositionType
  
  @js.native
  sealed trait end extends WorksheetPositionType
  
  @js.native
  sealed trait none extends WorksheetPositionType
  
  /* "After" */ val after: typings.officeDashJsDashPreview.ExcelNs.WorksheetPositionType.after with String = js.native
  /* "Before" */ val before: typings.officeDashJsDashPreview.ExcelNs.WorksheetPositionType.before with String = js.native
  /* "Beginning" */ val beginning: typings.officeDashJsDashPreview.ExcelNs.WorksheetPositionType.beginning with String = js.native
  /* "End" */ val end: typings.officeDashJsDashPreview.ExcelNs.WorksheetPositionType.end with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.ExcelNs.WorksheetPositionType.none with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WorksheetPositionType with String] = js.native
}

