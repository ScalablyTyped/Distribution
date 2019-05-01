package typings
package officeDashJsLib.ExcelNs

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
  sealed trait save
    extends officeDashJsLib.ExcelNs.CloseBehavior
  
  /**
    *
    * Discard the possible changes when closing the workbook.
    *
    */
  @js.native
  sealed trait skipSave
    extends officeDashJsLib.ExcelNs.CloseBehavior
  
  /* "Save" */ val save: save with java.lang.String = js.native
  /* "SkipSave" */ val skipSave: skipSave with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.CloseBehavior with java.lang.String] = js.native
}

