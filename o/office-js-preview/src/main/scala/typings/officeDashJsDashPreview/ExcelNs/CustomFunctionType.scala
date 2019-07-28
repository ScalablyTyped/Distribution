package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait invalid extends CustomFunctionType
  
  @js.native
  sealed trait script extends CustomFunctionType
  
  @js.native
  sealed trait webService extends CustomFunctionType
  
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.ExcelNs.CustomFunctionType.invalid with String = js.native
  /* "Script" */ val script: typings.officeDashJsDashPreview.ExcelNs.CustomFunctionType.script with String = js.native
  /* "WebService" */ val webService: typings.officeDashJsDashPreview.ExcelNs.CustomFunctionType.webService with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomFunctionType with String] = js.native
}

