package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeCopyType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RangeCopyType")
@js.native
object RangeCopyType extends js.Object {
  @js.native
  sealed trait all extends RangeCopyType
  
  @js.native
  sealed trait formats extends RangeCopyType
  
  @js.native
  sealed trait formulas extends RangeCopyType
  
  @js.native
  sealed trait values extends RangeCopyType
  
  /* "All" */ val all: typings.officeDashJs.ExcelNs.RangeCopyType.all with String = js.native
  /* "Formats" */ val formats: typings.officeDashJs.ExcelNs.RangeCopyType.formats with String = js.native
  /* "Formulas" */ val formulas: typings.officeDashJs.ExcelNs.RangeCopyType.formulas with String = js.native
  /* "Values" */ val values: typings.officeDashJs.ExcelNs.RangeCopyType.values with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeCopyType with String] = js.native
}

