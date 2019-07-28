package typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Login extends js.Object

@JSGlobal("milkcocoa.MilkCocoa.Error.Login")
@js.native
object Login extends js.Object {
  @js.native
  sealed trait EmailNotVerificated extends Login
  
  // FormatError = 1, LoginError = 2, EmailNotVerificated = 3
  @js.native
  sealed trait FormatError extends Login
  
  @js.native
  sealed trait LoginError extends Login
  
  /* 2 */ val EmailNotVerificated: typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.Login.EmailNotVerificated with Double = js.native
  /* 0 */ val FormatError: typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.Login.FormatError with Double = js.native
  /* 1 */ val LoginError: typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.Login.LoginError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Login with Double] = js.native
}

