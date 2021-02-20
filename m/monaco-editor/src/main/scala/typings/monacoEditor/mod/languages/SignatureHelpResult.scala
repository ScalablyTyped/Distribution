package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpResult extends IDisposable {
  
  var value: SignatureHelp = js.native
}
object SignatureHelpResult {
  
  @scala.inline
  def apply(dispose: () => Unit, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpResult]
  }
  
  @scala.inline
  implicit class SignatureHelpResultMutableBuilder[Self <: SignatureHelpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SignatureHelp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
