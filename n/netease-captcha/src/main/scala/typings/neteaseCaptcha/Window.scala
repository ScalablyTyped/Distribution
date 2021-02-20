package typings.neteaseCaptcha

import typings.neteaseCaptcha.NeteaseCaptcha.Config
import typings.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typings.neteaseCaptcha.NeteaseCaptcha.onError
import typings.neteaseCaptcha.NeteaseCaptcha.onLoad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var initNECaptcha: js.UndefOr[InitFunction] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitNECaptcha(
      value: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Unit
    ): Self = StObject.set(x, "initNECaptcha", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitNECaptchaUndefined: Self = StObject.set(x, "initNECaptcha", js.undefined)
  }
}
