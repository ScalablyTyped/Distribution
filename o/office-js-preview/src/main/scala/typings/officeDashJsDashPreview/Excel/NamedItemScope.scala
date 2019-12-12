package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.NamedItemScope.workbook
import typings.officeDashJsDashPreview.Excel.NamedItemScope.worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NamedItemScope extends js.Object

/**
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.NamedItemScope")
@js.native
object NamedItemScope extends js.Object {
  @js.native
  sealed trait workbook extends NamedItemScope
  
  @js.native
  sealed trait worksheet extends NamedItemScope
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NamedItemScope with String] = js.native
  /* "Workbook" */ @js.native
  object workbook extends TopLevel[workbook with String]
  
  /* "Worksheet" */ @js.native
  object worksheet extends TopLevel[worksheet with String]
  
}

