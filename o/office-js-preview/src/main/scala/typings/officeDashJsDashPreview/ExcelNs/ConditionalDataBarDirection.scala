package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalDataBarDirection extends js.Object

/**
  *
  * Represents the Data Bar direction within a cell.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarDirection")
@js.native
object ConditionalDataBarDirection extends js.Object {
  @js.native
  sealed trait context extends ConditionalDataBarDirection
  
  @js.native
  sealed trait leftToRight extends ConditionalDataBarDirection
  
  @js.native
  sealed trait rightToLeft extends ConditionalDataBarDirection
  
  /* "Context" */ val context: typings.officeDashJsDashPreview.ExcelNs.ConditionalDataBarDirection.context with String = js.native
  /* "LeftToRight" */ val leftToRight: typings.officeDashJsDashPreview.ExcelNs.ConditionalDataBarDirection.leftToRight with String = js.native
  /* "RightToLeft" */ val rightToLeft: typings.officeDashJsDashPreview.ExcelNs.ConditionalDataBarDirection.rightToLeft with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalDataBarDirection with String] = js.native
}

