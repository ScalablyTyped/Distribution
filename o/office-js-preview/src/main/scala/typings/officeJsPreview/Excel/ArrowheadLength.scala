package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadLength extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadLength")
@js.native
object ArrowheadLength extends js.Object {
  @js.native
  sealed trait long extends ArrowheadLength
  
  @js.native
  sealed trait medium extends ArrowheadLength
  
  @js.native
  sealed trait short extends ArrowheadLength
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadLength with String] = js.native
  /* "Long" */ @js.native
  object long extends TopLevel[long with String]
  
  /* "Medium" */ @js.native
  object medium extends TopLevel[medium with String]
  
  /* "Short" */ @js.native
  object short extends TopLevel[short with String]
  
}

