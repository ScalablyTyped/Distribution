package typings.notyf.notyfOptionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotyfEvent extends js.Object
@JSImport("notyf/notyf.options", "NotyfEvent")
@js.native
object NotyfEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NotyfEvent with String] = js.native
  
  @js.native
  sealed trait Click extends NotyfEvent
  /* "click" */ @js.native
  object Click extends TopLevel[Click with String]
  
  @js.native
  sealed trait Dismiss extends NotyfEvent
  /* "dismiss" */ @js.native
  object Dismiss extends TopLevel[Dismiss with String]
}
