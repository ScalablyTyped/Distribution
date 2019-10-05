package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadStyle extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadStyle")
@js.native
object ArrowheadStyle extends js.Object {
  @js.native
  sealed trait diamond extends ArrowheadStyle
  
  @js.native
  sealed trait none extends ArrowheadStyle
  
  @js.native
  sealed trait open extends ArrowheadStyle
  
  @js.native
  sealed trait oval extends ArrowheadStyle
  
  @js.native
  sealed trait stealth extends ArrowheadStyle
  
  @js.native
  sealed trait triangle extends ArrowheadStyle
  
  /* "Diamond" */ val diamond: typings.officeDashJs.Excel.ArrowheadStyle.diamond with String = js.native
  /* "None" */ val none: typings.officeDashJs.Excel.ArrowheadStyle.none with String = js.native
  /* "Open" */ val open: typings.officeDashJs.Excel.ArrowheadStyle.open with String = js.native
  /* "Oval" */ val oval: typings.officeDashJs.Excel.ArrowheadStyle.oval with String = js.native
  /* "Stealth" */ val stealth: typings.officeDashJs.Excel.ArrowheadStyle.stealth with String = js.native
  /* "Triangle" */ val triangle: typings.officeDashJs.Excel.ArrowheadStyle.triangle with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadStyle with String] = js.native
}

