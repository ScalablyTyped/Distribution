package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpResult
  extends StObject
     with IDisposable {
  
  var value: SignatureHelp
}
object SignatureHelpResult {
  
  inline def apply(dispose: () => Unit, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureHelpResult] (val x: Self) extends AnyVal {
    
    inline def setValue(value: SignatureHelp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
