package typings
package milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Login extends js.Object

@JSGlobal("milkcocoa.MilkCocoa.Error.Login")
@js.native
object Login extends js.Object {
  @js.native
  sealed trait EmailNotVerificated
    extends milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.Login
  
  // FormatError = 1, LoginError = 2, EmailNotVerificated = 3
  @js.native
  sealed trait FormatError
    extends milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.Login
  
  @js.native
  sealed trait LoginError
    extends milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.Login
  
  val EmailNotVerificated: EmailNotVerificated with java.lang.String = js.native
  val FormatError: FormatError with java.lang.String = js.native
  val LoginError: LoginError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.Login with java.lang.String] = js.native
}

