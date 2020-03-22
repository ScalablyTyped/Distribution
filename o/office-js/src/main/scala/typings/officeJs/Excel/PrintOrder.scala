package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrder extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintOrder")
@js.native
object PrintOrder extends js.Object {
  /**
    * Process down the rows before processing across pages or page fields to the right.
    *
    */
  @js.native
  sealed trait downThenOver extends PrintOrder
  
  /**
    * Process across pages or page fields to the right before moving down the rows.
    *
    */
  @js.native
  sealed trait overThenDown extends PrintOrder
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintOrder with String] = js.native
  /* "DownThenOver" */ @js.native
  object downThenOver extends TopLevel[downThenOver with String]
  
  /* "OverThenDown" */ @js.native
  object overThenDown extends TopLevel[overThenDown with String]
  
}

