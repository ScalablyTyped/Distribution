package typings
package milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetCurrentUser extends js.Object

@JSGlobal("milkcocoa.MilkCocoa.Error.GetCurrentUser")
@js.native
object GetCurrentUser extends js.Object {
  // NotLoggedIn = 1
  @js.native
  sealed trait NotLoggedIn
    extends milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.GetCurrentUser
  
  /* 0 */ val NotLoggedIn: NotLoggedIn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[milkcocoaLib.milkcocoaNs.MilkCocoaNs.ErrorNs.GetCurrentUser with scala.Double] = js.native
}

