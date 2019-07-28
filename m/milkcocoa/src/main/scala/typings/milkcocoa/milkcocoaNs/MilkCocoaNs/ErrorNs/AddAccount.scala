package typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddAccount extends js.Object

@JSGlobal("milkcocoa.MilkCocoa.Error.AddAccount")
@js.native
object AddAccount extends js.Object {
  @js.native
  sealed trait AlreadyExist extends AddAccount
  
  // FormatError = 1, AlreadyExist = 2
  @js.native
  sealed trait FormatError extends AddAccount
  
  /* 1 */ val AlreadyExist: typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount.AlreadyExist with Double = js.native
  /* 0 */ val FormatError: typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount.FormatError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddAccount with Double] = js.native
}

