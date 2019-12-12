package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ConditionalDataBarAxisFormat.automatic
import typings.officeDashJs.Excel.ConditionalDataBarAxisFormat.cellMidPoint
import typings.officeDashJs.Excel.ConditionalDataBarAxisFormat.none
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalDataBarAxisFormat with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "CellMidPoint" */ @js.native
  object cellMidPoint extends TopLevel[cellMidPoint with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
}

