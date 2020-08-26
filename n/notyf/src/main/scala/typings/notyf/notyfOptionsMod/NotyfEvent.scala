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
  sealed trait Click extends NotyfEvent
  
  @js.native
  sealed trait Dismiss extends NotyfEvent
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NotyfEvent with String] = js.native
  /* "click" */ @js.native
  object Click extends TopLevel[Click with String]
  
  /* "dismiss" */ @js.native
  object Dismiss extends TopLevel[Dismiss with String]
  
}

