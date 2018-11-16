package typings
package milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddAccount extends js.Object

@JSGlobal("milkcocoa.MilkCocoa.Error.AddAccount")
@js.native
object AddAccount extends js.Object {
  @js.native
  sealed trait AlreadyExist
    extends milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount
  
  // FormatError = 1, AlreadyExist = 2
  @js.native
  sealed trait FormatError
    extends milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount
  
  val AlreadyExist: AlreadyExist with java.lang.String = js.native
  val FormatError: FormatError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount with java.lang.String] = js.native
}

