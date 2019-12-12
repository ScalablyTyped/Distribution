package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.SheetVisibility.hidden
import typings.officeDashJsDashPreview.Excel.SheetVisibility.veryHidden
import typings.officeDashJsDashPreview.Excel.SheetVisibility.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetVisibility extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.SheetVisibility")
@js.native
object SheetVisibility extends js.Object {
  @js.native
  sealed trait hidden extends SheetVisibility
  
  @js.native
  sealed trait veryHidden extends SheetVisibility
  
  @js.native
  sealed trait visible extends SheetVisibility
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetVisibility with String] = js.native
  /* "Hidden" */ @js.native
  object hidden extends TopLevel[hidden with String]
  
  /* "VeryHidden" */ @js.native
  object veryHidden extends TopLevel[veryHidden with String]
  
  /* "Visible" */ @js.native
  object visible extends TopLevel[visible with String]
  
}

