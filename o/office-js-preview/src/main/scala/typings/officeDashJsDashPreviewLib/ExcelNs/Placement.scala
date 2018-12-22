package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends js.Object {
  @js.native
  sealed trait absolute
    extends officeDashJsDashPreviewLib.ExcelNs.Placement
  
  @js.native
  sealed trait oneCell
    extends officeDashJsDashPreviewLib.ExcelNs.Placement
  
  @js.native
  sealed trait twoCell
    extends officeDashJsDashPreviewLib.ExcelNs.Placement
  
  /* "Absolute" */ val absolute: absolute with java.lang.String = js.native
  /* "OneCell" */ val oneCell: oneCell with java.lang.String = js.native
  /* "TwoCell" */ val twoCell: twoCell with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.Placement with java.lang.String] = js.native
}

