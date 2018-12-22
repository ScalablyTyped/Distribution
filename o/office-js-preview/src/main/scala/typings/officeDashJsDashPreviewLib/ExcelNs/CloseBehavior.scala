package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloseBehavior extends js.Object

/**
     *
     * Specifies the close behavior for workbook.close API.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
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
    extends officeDashJsDashPreviewLib.ExcelNs.CloseBehavior
  
  /**
           *
           * Discard the possible changes when closing the workbook.
           *
           */
  @js.native
  sealed trait skipSave
    extends officeDashJsDashPreviewLib.ExcelNs.CloseBehavior
  
  /* "Save" */ val save: save with java.lang.String = js.native
  /* "SkipSave" */ val skipSave: skipSave with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.CloseBehavior with java.lang.String] = js.native
}

