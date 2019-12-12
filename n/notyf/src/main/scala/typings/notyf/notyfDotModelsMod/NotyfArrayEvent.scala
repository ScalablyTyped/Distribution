package typings.notyf.notyfDotModelsMod

import org.scalablytyped.runtime.TopLevel
import typings.notyf.notyfDotModelsMod.NotyfArrayEvent.Add
import typings.notyf.notyfDotModelsMod.NotyfArrayEvent.Remove
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotyfArrayEvent with Double] = js.native
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 1 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
}

