package typings.notyf.notyfOptionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotyfEvent extends js.Object

@JSImport("notyf/notyf.options", "NotyfEvent")
@js.native
object NotyfEvent extends js.Object {
  @js.native
  sealed trait Dismiss extends NotyfEvent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotyfEvent with Double] = js.native
  /* 0 */ @js.native
  object Dismiss extends TopLevel[Dismiss with Double]
  
}

