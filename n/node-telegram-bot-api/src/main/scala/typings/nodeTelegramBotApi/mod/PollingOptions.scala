package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// METHODS OPTIONS ///
trait PollingOptions extends StObject {
  
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[String | Double] = js.undefined
  
  var params: js.UndefOr[GetUpdatesOptions] = js.undefined
}
object PollingOptions {
  
  @scala.inline
  def apply(): PollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingOptions]
  }
  
  @scala.inline
  implicit class PollingOptionsMutableBuilder[Self <: PollingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    @scala.inline
    def setInterval(value: String | Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setParams(value: GetUpdatesOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
