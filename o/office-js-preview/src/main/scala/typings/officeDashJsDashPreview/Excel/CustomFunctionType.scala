package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.CustomFunctionType.invalid
import typings.officeDashJsDashPreview.Excel.CustomFunctionType.script
import typings.officeDashJsDashPreview.Excel.CustomFunctionType.webService
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomFunctionType with String] = js.native
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "Script" */ @js.native
  object script extends TopLevel[script with String]
  
  /* "WebService" */ @js.native
  object webService extends TopLevel[webService with String]
  
}

