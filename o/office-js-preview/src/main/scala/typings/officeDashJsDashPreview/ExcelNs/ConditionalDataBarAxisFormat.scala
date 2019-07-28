package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalDataBarAxisFormat extends js.Object

/**
  *
  * Represents the format options for a Data Bar Axis.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarAxisFormat")
@js.native
object ConditionalDataBarAxisFormat extends js.Object {
  @js.native
  sealed trait automatic extends ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait cellMidPoint extends ConditionalDataBarAxisFormat
  
  @js.native
  sealed trait none extends ConditionalDataBarAxisFormat
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.ConditionalDataBarAxisFormat.automatic with String = js.native
  /* "CellMidPoint" */ val cellMidPoint: typings.officeDashJsDashPreview.ExcelNs.ConditionalDataBarAxisFormat.cellMidPoint with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.ExcelNs.ConditionalDataBarAxisFormat.none with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalDataBarAxisFormat with String] = js.native
}

