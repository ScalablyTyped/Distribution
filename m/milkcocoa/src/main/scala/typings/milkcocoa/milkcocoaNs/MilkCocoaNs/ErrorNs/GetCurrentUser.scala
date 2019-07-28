package typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs

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
  sealed trait NotLoggedIn extends GetCurrentUser
  
  /* 0 */ val NotLoggedIn: typings.milkcocoa.milkcocoaNs.MilkCocoaNs.ErrorNs.GetCurrentUser.NotLoggedIn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetCurrentUser with Double] = js.native
}

