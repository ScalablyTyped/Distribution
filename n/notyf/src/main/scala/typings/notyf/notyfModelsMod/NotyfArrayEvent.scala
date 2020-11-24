package typings.notyf.notyfModelsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotyfArrayEvent extends js.Object
@JSImport("notyf/notyf.models", "NotyfArrayEvent")
@js.native
object NotyfArrayEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotyfArrayEvent with Double] = js.native
  
  @js.native
  sealed trait Add extends NotyfArrayEvent
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  @js.native
  sealed trait Remove extends NotyfArrayEvent
  /* 1 */ @js.native
  object Remove extends TopLevel[Remove with Double]
}
