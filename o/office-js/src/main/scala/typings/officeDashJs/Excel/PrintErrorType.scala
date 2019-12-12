package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.PrintErrorType.asDisplayed
import typings.officeDashJs.Excel.PrintErrorType.blank
import typings.officeDashJs.Excel.PrintErrorType.dash
import typings.officeDashJs.Excel.PrintErrorType.notAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintErrorType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintErrorType")
@js.native
object PrintErrorType extends js.Object {
  @js.native
  sealed trait asDisplayed extends PrintErrorType
  
  @js.native
  sealed trait blank extends PrintErrorType
  
  @js.native
  sealed trait dash extends PrintErrorType
  
  @js.native
  sealed trait notAvailable extends PrintErrorType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintErrorType with String] = js.native
  /* "AsDisplayed" */ @js.native
  object asDisplayed extends TopLevel[asDisplayed with String]
  
  /* "Blank" */ @js.native
  object blank extends TopLevel[blank with String]
  
  /* "Dash" */ @js.native
  object dash extends TopLevel[dash with String]
  
  /* "NotAvailable" */ @js.native
  object notAvailable extends TopLevel[notAvailable with String]
  
}

