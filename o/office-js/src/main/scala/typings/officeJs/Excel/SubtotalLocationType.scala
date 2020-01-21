package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubtotalLocationType extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SubtotalLocationType")
@js.native
object SubtotalLocationType extends js.Object {
  /**
    *
    * Subtotals are at the bottom.
    *
    */
  @js.native
  sealed trait atBottom extends SubtotalLocationType
  
  /**
    *
    * Subtotals are at the top.
    *
    */
  @js.native
  sealed trait atTop extends SubtotalLocationType
  
  /**
    *
    * Subtotals are off.
    *
    */
  @js.native
  sealed trait off extends SubtotalLocationType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SubtotalLocationType with String] = js.native
  /* "AtBottom" */ @js.native
  object atBottom extends TopLevel[atBottom with String]
  
  /* "AtTop" */ @js.native
  object atTop extends TopLevel[atTop with String]
  
  /* "Off" */ @js.native
  object off extends TopLevel[off with String]
  
}

