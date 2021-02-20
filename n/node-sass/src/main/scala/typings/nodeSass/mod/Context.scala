package typings.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context
  extends /* key */ StringDictionary[js.Any] {
  
  var callback: js.UndefOr[SassRenderCallback] = js.native
  
  var options: Options = js.native
}
object Context {
  
  @scala.inline
  def apply(options: Options): Context = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: (/* err */ SassError, /* result */ Result) => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
