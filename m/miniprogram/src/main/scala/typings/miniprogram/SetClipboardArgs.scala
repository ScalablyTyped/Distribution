package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetClipboardArgs extends AsyncCallback[Unit] {
  
  var text: String = js.native
}
object SetClipboardArgs {
  
  @scala.inline
  def apply(text: String): SetClipboardArgs = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetClipboardArgs]
  }
  
  @scala.inline
  implicit class SetClipboardArgsMutableBuilder[Self <: SetClipboardArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
