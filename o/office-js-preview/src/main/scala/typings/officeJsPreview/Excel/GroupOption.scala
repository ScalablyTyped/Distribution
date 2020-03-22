package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupOption extends js.Object

/**
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.GroupOption")
@js.native
object GroupOption extends js.Object {
  /**
    * Group by columns.
    *
    */
  @js.native
  sealed trait byColumns extends GroupOption
  
  /**
    * Group by rows.
    *
    */
  @js.native
  sealed trait byRows extends GroupOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GroupOption with String] = js.native
  /* "ByColumns" */ @js.native
  object byColumns extends TopLevel[byColumns with String]
  
  /* "ByRows" */ @js.native
  object byRows extends TopLevel[byRows with String]
  
}

