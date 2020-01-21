package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrientation extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOrientation")
@js.native
object SortOrientation extends js.Object {
  @js.native
  sealed trait columns extends SortOrientation
  
  @js.native
  sealed trait rows extends SortOrientation
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOrientation with String] = js.native
  /* "Columns" */ @js.native
  object columns extends TopLevel[columns with String]
  
  /* "Rows" */ @js.native
  object rows extends TopLevel[rows with String]
  
}

