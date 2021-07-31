package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPollingOptions
  extends StObject
     with ConstructorOptions {
  
  var restart: js.UndefOr[Boolean] = js.undefined
}
object StartPollingOptions {
  
  @scala.inline
  def apply(): StartPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPollingOptions]
  }
  
  @scala.inline
  implicit class StartPollingOptionsMutableBuilder[Self <: StartPollingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
  }
}
