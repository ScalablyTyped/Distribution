package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeleteShiftDirection extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.DeleteShiftDirection")
@js.native
object DeleteShiftDirection extends js.Object {
  @js.native
  sealed trait left extends DeleteShiftDirection
  
  @js.native
  sealed trait up extends DeleteShiftDirection
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeleteShiftDirection with String] = js.native
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Up" */ @js.native
  object up extends TopLevel[up with String]
  
}

