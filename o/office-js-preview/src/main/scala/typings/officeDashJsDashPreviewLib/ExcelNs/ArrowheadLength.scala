package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadLength extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ArrowheadLength")
@js.native
object ArrowheadLength extends js.Object {
  @js.native
  sealed trait long
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength
  
  @js.native
  sealed trait medium
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength
  
  @js.native
  sealed trait short
    extends officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength
  
  /* "Long" */ val long: long with java.lang.String = js.native
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Short" */ val short: short with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength with java.lang.String] = js.native
}

