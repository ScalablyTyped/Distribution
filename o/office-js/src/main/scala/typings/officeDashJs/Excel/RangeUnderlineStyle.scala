package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.RangeUnderlineStyle.double
import typings.officeDashJs.Excel.RangeUnderlineStyle.doubleAccountant
import typings.officeDashJs.Excel.RangeUnderlineStyle.none
import typings.officeDashJs.Excel.RangeUnderlineStyle.single
import typings.officeDashJs.Excel.RangeUnderlineStyle.singleAccountant
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeUnderlineStyle with String] = js.native
  /* "Double" */ @js.native
  object double extends TopLevel[double with String]
  
  /* "DoubleAccountant" */ @js.native
  object doubleAccountant extends TopLevel[doubleAccountant with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Single" */ @js.native
  object single extends TopLevel[single with String]
  
  /* "SingleAccountant" */ @js.native
  object singleAccountant extends TopLevel[singleAccountant with String]
  
}

