package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeCopyType with String] = js.native
  /* "All" */ @js.native
  object all extends TopLevel[all with String]
  
  /* "Formats" */ @js.native
  object formats extends TopLevel[formats with String]
  
  /* "Formulas" */ @js.native
  object formulas extends TopLevel[formulas with String]
  
  /* "Values" */ @js.native
  object values extends TopLevel[values with String]
  
}

