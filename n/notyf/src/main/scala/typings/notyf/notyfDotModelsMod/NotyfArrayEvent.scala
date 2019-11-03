package typings.notyf.notyfDotModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotyfArrayEvent extends js.Object

@JSImport("notyf/notyf.models", "NotyfArrayEvent")
@js.native
object NotyfArrayEvent extends js.Object {
  @js.native
  sealed trait Add extends NotyfArrayEvent
  
  @js.native
  sealed trait Remove extends NotyfArrayEvent
  
  /* 0 */ val Add: typings.notyf.notyfDotModelsMod.NotyfArrayEvent.Add with Double = js.native
  /* 1 */ val Remove: typings.notyf.notyfDotModelsMod.NotyfArrayEvent.Remove with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotyfArrayEvent with Double] = js.native
}

