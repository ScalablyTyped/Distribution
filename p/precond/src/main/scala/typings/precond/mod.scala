package typings.precond

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("precond", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def checkArgument(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): Unit = js.native
  def checkArgument(value: js.Any, message: String, formatArgs: js.Any*): Unit = js.native
  
  def checkIsArray(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsArray(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsBoolean(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsBoolean(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsDef(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsDef(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsDefAndNotNull(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsDefAndNotNull(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsFunction(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsFunction(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsNumber(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsNumber(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsObject(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsObject(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkIsString(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): js.Any = js.native
  def checkIsString(value: js.Any, message: String, formatArgs: js.Any*): js.Any = js.native
  
  def checkState(value: js.Any, message: js.UndefOr[scala.Nothing], formatArgs: js.Any*): Unit = js.native
  def checkState(value: js.Any, message: String, formatArgs: js.Any*): Unit = js.native
}
