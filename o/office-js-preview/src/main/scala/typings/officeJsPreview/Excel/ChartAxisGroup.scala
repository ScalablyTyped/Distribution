package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisGroup extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisGroup")
@js.native
object ChartAxisGroup extends js.Object {
  @js.native
  sealed trait primary extends ChartAxisGroup
  
  @js.native
  sealed trait secondary extends ChartAxisGroup
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisGroup with String] = js.native
  /* "Primary" */ @js.native
  object primary extends TopLevel[primary with String]
  
  /* "Secondary" */ @js.native
  object secondary extends TopLevel[secondary with String]
  
}

