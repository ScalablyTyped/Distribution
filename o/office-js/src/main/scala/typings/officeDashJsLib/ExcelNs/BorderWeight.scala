package typings
package officeDashJsLib.ExcelNs

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
    extends officeDashJsLib.ExcelNs.BorderWeight
  
  @js.native
  sealed trait medium
    extends officeDashJsLib.ExcelNs.BorderWeight
  
  @js.native
  sealed trait thick
    extends officeDashJsLib.ExcelNs.BorderWeight
  
  @js.native
  sealed trait thin
    extends officeDashJsLib.ExcelNs.BorderWeight
  
  /* "Hairline" */ val hairline: hairline with java.lang.String = js.native
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Thick" */ val thick: thick with java.lang.String = js.native
  /* "Thin" */ val thin: thin with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.BorderWeight with java.lang.String] = js.native
}

