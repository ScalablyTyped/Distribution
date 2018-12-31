package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderWeight extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderWeight")
@js.native
object BorderWeight extends js.Object {
  @js.native
  sealed trait hairline
    extends officeDashJsDashPreviewLib.ExcelNs.BorderWeight
  
  @js.native
  sealed trait medium
    extends officeDashJsDashPreviewLib.ExcelNs.BorderWeight
  
  @js.native
  sealed trait thick
    extends officeDashJsDashPreviewLib.ExcelNs.BorderWeight
  
  @js.native
  sealed trait thin
    extends officeDashJsDashPreviewLib.ExcelNs.BorderWeight
  
  /* "Hairline" */ val hairline: hairline with java.lang.String = js.native
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Thick" */ val thick: thick with java.lang.String = js.native
  /* "Thin" */ val thin: thin with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.BorderWeight with java.lang.String] = js.native
}

