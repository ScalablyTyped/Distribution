package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortMethod extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortMethod")
@js.native
object SortMethod extends js.Object {
  @js.native
  sealed trait pinYin extends SortMethod
  
  @js.native
  sealed trait strokeCount extends SortMethod
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortMethod with String] = js.native
  /* "PinYin" */ @js.native
  object pinYin extends TopLevel[pinYin with String]
  
  /* "StrokeCount" */ @js.native
  object strokeCount extends TopLevel[strokeCount with String]
  
}

