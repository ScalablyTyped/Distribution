package typings.notie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object notie extends js.Object {
    
    def alert(`type`: Double, message: String, seconds: Double): Unit = js.native
    
    def confirm(title: String, yes_text: String, no_text: String, yes_callback: js.Function0[Unit]): Unit = js.native
    
    def input(
      title: String,
      submit_text: String,
      cancel_text: String,
      `type`: String,
      placeholder: String,
      submit_callback: js.Function1[/* value_entered */ String, Unit]
    ): Unit = js.native
    def input(
      title: String,
      submit_text: String,
      cancel_text: String,
      `type`: String,
      placeholder: String,
      submit_callback: js.Function1[/* value_entered */ String, Unit],
      prefilled_value_optional: String
    ): Unit = js.native
  }
}
