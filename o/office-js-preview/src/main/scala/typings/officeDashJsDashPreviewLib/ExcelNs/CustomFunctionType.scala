package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomFunctionType extends js.Object

/**
     * [Api set: CustomFunctions 1.1]
     * @beta
     */
@JSGlobal("Excel.CustomFunctionType")
@js.native
object CustomFunctionType extends js.Object {
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.CustomFunctionType
  
  @js.native
  sealed trait script
    extends officeDashJsDashPreviewLib.ExcelNs.CustomFunctionType
  
  @js.native
  sealed trait webService
    extends officeDashJsDashPreviewLib.ExcelNs.CustomFunctionType
  
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "Script" */ val script: script with java.lang.String = js.native
  /* "WebService" */ val webService: webService with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.CustomFunctionType with java.lang.String] = js.native
}

