package typings.notie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object notie {
    
    @JSGlobal("notie")
    @js.native
    val ^ : js.Any = js.native
    
    inline def alert(`type`: Double, message: String, seconds: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(`type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def confirm(title: String, yes_text: String, no_text: String, yes_callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], yes_text.asInstanceOf[js.Any], no_text.asInstanceOf[js.Any], yes_callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def input(
      title: String,
      submit_text: String,
      cancel_text: String,
      `type`: String,
      placeholder: String,
      submit_callback: js.Function1[/* value_entered */ String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(title.asInstanceOf[js.Any], submit_text.asInstanceOf[js.Any], cancel_text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any], submit_callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def input(
      title: String,
      submit_text: String,
      cancel_text: String,
      `type`: String,
      placeholder: String,
      submit_callback: js.Function1[/* value_entered */ String, Unit],
      prefilled_value_optional: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(title.asInstanceOf[js.Any], submit_text.asInstanceOf[js.Any], cancel_text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any], submit_callback.asInstanceOf[js.Any], prefilled_value_optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
