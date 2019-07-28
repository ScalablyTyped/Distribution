package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Save" */ val save: typings.officeDashJsDashPreview.ExcelNs.CloseBehavior.save with String = js.native
  /* "SkipSave" */ val skipSave: typings.officeDashJsDashPreview.ExcelNs.CloseBehavior.skipSave with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CloseBehavior with String] = js.native
}

