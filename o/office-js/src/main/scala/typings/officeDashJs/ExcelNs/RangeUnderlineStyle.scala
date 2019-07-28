package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeUnderlineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeUnderlineStyle")
@js.native
object RangeUnderlineStyle extends js.Object {
  @js.native
  sealed trait double extends RangeUnderlineStyle
  
  @js.native
  sealed trait doubleAccountant extends RangeUnderlineStyle
  
  @js.native
  sealed trait none extends RangeUnderlineStyle
  
  @js.native
  sealed trait single extends RangeUnderlineStyle
  
  @js.native
  sealed trait singleAccountant extends RangeUnderlineStyle
  
  /* "Double" */ val double: typings.officeDashJs.ExcelNs.RangeUnderlineStyle.double with String = js.native
  /* "DoubleAccountant" */ val doubleAccountant: typings.officeDashJs.ExcelNs.RangeUnderlineStyle.doubleAccountant with String = js.native
  /* "None" */ val none: typings.officeDashJs.ExcelNs.RangeUnderlineStyle.none with String = js.native
  /* "Single" */ val single: typings.officeDashJs.ExcelNs.RangeUnderlineStyle.single with String = js.native
  /* "SingleAccountant" */ val singleAccountant: typings.officeDashJs.ExcelNs.RangeUnderlineStyle.singleAccountant with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeUnderlineStyle with String] = js.native
}

