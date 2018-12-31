package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalDataBarDirection extends js.Object

/**
  *
  * Represents the Data Bar direction within a cell.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalDataBarDirection")
@js.native
object ConditionalDataBarDirection extends js.Object {
  @js.native
  sealed trait context
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalDataBarDirection
  
  @js.native
  sealed trait leftToRight
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalDataBarDirection
  
  @js.native
  sealed trait rightToLeft
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalDataBarDirection
  
  /* "Context" */ val context: context with java.lang.String = js.native
  /* "LeftToRight" */ val leftToRight: leftToRight with java.lang.String = js.native
  /* "RightToLeft" */ val rightToLeft: rightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalDataBarDirection with java.lang.String
  ] = js.native
}

