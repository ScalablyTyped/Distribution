package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait invalid extends CustomFunctionMetadataFormat
  
  @js.native
  sealed trait openApi extends CustomFunctionMetadataFormat
  
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.ExcelNs.CustomFunctionMetadataFormat.invalid with String = js.native
  /* "OpenApi" */ val openApi: typings.officeDashJsDashPreview.ExcelNs.CustomFunctionMetadataFormat.openApi with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomFunctionMetadataFormat with String] = js.native
}

