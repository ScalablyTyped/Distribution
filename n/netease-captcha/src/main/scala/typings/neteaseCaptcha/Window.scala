package typings.neteaseCaptcha

import typings.neteaseCaptcha.NeteaseCaptcha.Config
import typings.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typings.neteaseCaptcha.NeteaseCaptcha.onError
import typings.neteaseCaptcha.NeteaseCaptcha.onLoad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var initNECaptcha: js.UndefOr[InitFunction] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setInitNECaptcha(
      value: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Unit
    ): Self = StObject.set(x, "initNECaptcha", js.Any.fromFunction3(value))
    
    inline def setInitNECaptchaUndefined: Self = StObject.set(x, "initNECaptcha", js.undefined)
  }
}
