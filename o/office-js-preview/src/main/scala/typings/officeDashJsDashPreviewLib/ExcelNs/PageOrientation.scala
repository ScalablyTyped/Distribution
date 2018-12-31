package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientation extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.PageOrientation")
@js.native
object PageOrientation extends js.Object {
  @js.native
  sealed trait landscape
    extends officeDashJsDashPreviewLib.ExcelNs.PageOrientation
  
  @js.native
  sealed trait portrait
    extends officeDashJsDashPreviewLib.ExcelNs.PageOrientation
  
  /* "Landscape" */ val landscape: landscape with java.lang.String = js.native
  /* "Portrait" */ val portrait: portrait with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.PageOrientation with java.lang.String] = js.native
}

