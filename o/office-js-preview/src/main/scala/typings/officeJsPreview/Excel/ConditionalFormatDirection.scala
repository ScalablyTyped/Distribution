package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatDirection extends js.Object

/**
  *
  * Represents the direction for a selection.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatDirection")
@js.native
object ConditionalFormatDirection extends js.Object {
  @js.native
  sealed trait bottom extends ConditionalFormatDirection
  
  @js.native
  sealed trait top extends ConditionalFormatDirection
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatDirection with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

