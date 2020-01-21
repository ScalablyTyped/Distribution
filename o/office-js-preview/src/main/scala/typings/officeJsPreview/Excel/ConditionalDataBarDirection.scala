package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalDataBarDirection extends js.Object

/**
  *
  * Represents the Data Bar direction within a cell.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarDirection")
@js.native
object ConditionalDataBarDirection extends js.Object {
  @js.native
  sealed trait context extends ConditionalDataBarDirection
  
  @js.native
  sealed trait leftToRight extends ConditionalDataBarDirection
  
  @js.native
  sealed trait rightToLeft extends ConditionalDataBarDirection
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalDataBarDirection with String] = js.native
  /* "Context" */ @js.native
  object context extends TopLevel[context with String]
  
  /* "LeftToRight" */ @js.native
  object leftToRight extends TopLevel[leftToRight with String]
  
  /* "RightToLeft" */ @js.native
  object rightToLeft extends TopLevel[rightToLeft with String]
  
}

