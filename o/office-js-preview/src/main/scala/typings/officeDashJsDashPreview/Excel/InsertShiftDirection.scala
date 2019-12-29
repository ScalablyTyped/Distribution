package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InsertShiftDirection extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.InsertShiftDirection")
@js.native
object InsertShiftDirection extends js.Object {
  @js.native
  sealed trait down extends InsertShiftDirection
  
  @js.native
  sealed trait right extends InsertShiftDirection
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertShiftDirection with String] = js.native
  /* "Down" */ @js.native
  object down extends TopLevel[down with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
}

