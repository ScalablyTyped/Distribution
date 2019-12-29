package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloseBehavior extends js.Object

/**
  *
  * Specifies the close behavior for Workbook.close API.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends js.Object {
  /**
    *
    * Save the possible changes before closing the workbook.
    *
    */
  @js.native
  sealed trait save extends CloseBehavior
  
  /**
    *
    * Discard the possible changes when closing the workbook.
    *
    */
  @js.native
  sealed trait skipSave extends CloseBehavior
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CloseBehavior with String] = js.native
  /* "Save" */ @js.native
  object save extends TopLevel[save with String]
  
  /* "SkipSave" */ @js.native
  object skipSave extends TopLevel[skipSave with String]
  
}

