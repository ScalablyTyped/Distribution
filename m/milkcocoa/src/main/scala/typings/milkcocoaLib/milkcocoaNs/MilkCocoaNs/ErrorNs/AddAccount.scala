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
  
  /* 1 */ val AlreadyExist: AlreadyExist with scala.Double = js.native
  /* 0 */ val FormatError: FormatError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.AddAccount with scala.Double] = js.native
}

