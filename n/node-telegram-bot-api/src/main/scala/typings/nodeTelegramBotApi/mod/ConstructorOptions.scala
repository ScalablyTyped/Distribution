package typings.nodeTelegramBotApi.mod

import typings.request.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorOptions extends StObject {
  
  var baseApiUrl: js.UndefOr[String] = js.undefined
  
  var filepath: js.UndefOr[Boolean] = js.undefined
  
  var onlyFirstMatch: js.UndefOr[Boolean] = js.undefined
  
  var polling: js.UndefOr[Boolean | PollingOptions] = js.undefined
  
  var request: js.UndefOr[Options] = js.undefined
  
  var webHook: js.UndefOr[Boolean | WebHookOptions] = js.undefined
}
object ConstructorOptions {
  
  inline def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setBaseApiUrl(value: String): Self = StObject.set(x, "baseApiUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseApiUrlUndefined: Self = StObject.set(x, "baseApiUrl", js.undefined)
    
    inline def setFilepath(value: Boolean): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    
    inline def setOnlyFirstMatch(value: Boolean): Self = StObject.set(x, "onlyFirstMatch", value.asInstanceOf[js.Any])
    
    inline def setOnlyFirstMatchUndefined: Self = StObject.set(x, "onlyFirstMatch", js.undefined)
    
    inline def setPolling(value: Boolean | PollingOptions): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setWebHook(value: Boolean | WebHookOptions): Self = StObject.set(x, "webHook", value.asInstanceOf[js.Any])
    
    inline def setWebHookUndefined: Self = StObject.set(x, "webHook", js.undefined)
  }
}
