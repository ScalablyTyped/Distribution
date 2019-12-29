package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomFunctionMetadataFormat with String] = js.native
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "OpenApi" */ @js.native
  object openApi extends TopLevel[openApi with String]
  
}

