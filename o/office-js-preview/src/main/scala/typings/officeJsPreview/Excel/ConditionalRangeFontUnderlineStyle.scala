package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeFontUnderlineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeFontUnderlineStyle")
@js.native
object ConditionalRangeFontUnderlineStyle extends js.Object {
  @js.native
  sealed trait double extends ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait none extends ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait single extends ConditionalRangeFontUnderlineStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeFontUnderlineStyle with String] = js.native
  /* "Double" */ @js.native
  object double extends TopLevel[double with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Single" */ @js.native
  object single extends TopLevel[single with String]
  
}

