package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowHeadLength extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ArrowHeadLength")
@js.native
object ArrowHeadLength extends js.Object {
  @js.native
  sealed trait long
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength
  
  @js.native
  sealed trait medium
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength
  
  @js.native
  sealed trait short
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength
  
  /* "Long" */ val long: long with java.lang.String = js.native
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Short" */ val short: short with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength with java.lang.String] = js.native
}

