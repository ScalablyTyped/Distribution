package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomFunctionMetadataFormat extends js.Object

/**
     * [Api set: CustomFunctions 1.1]
     * @beta
     */
@JSGlobal("Excel.CustomFunctionMetadataFormat")
@js.native
object CustomFunctionMetadataFormat extends js.Object {
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.CustomFunctionMetadataFormat
  
  @js.native
  sealed trait openApi
    extends officeDashJsDashPreviewLib.ExcelNs.CustomFunctionMetadataFormat
  
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "OpenApi" */ val openApi: openApi with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.CustomFunctionMetadataFormat with java.lang.String
  ] = js.native
}

