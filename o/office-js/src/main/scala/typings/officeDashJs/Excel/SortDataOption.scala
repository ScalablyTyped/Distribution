package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortDataOption extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortDataOption")
@js.native
object SortDataOption extends js.Object {
  @js.native
  sealed trait normal extends SortDataOption
  
  @js.native
  sealed trait textAsNumber extends SortDataOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortDataOption with String] = js.native
  /* "Normal" */ @js.native
  object normal extends TopLevel[normal with String]
  
  /* "TextAsNumber" */ @js.native
  object textAsNumber extends TopLevel[textAsNumber with String]
  
}

