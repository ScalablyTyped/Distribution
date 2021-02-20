package typings.nodeTelegramBotApi.mod

import typings.request.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorOptions extends StObject {
  
  var baseApiUrl: js.UndefOr[String] = js.native
  
  var filepath: js.UndefOr[Boolean] = js.native
  
  var onlyFirstMatch: js.UndefOr[Boolean] = js.native
  
  var polling: js.UndefOr[Boolean | PollingOptions] = js.native
  
  var request: js.UndefOr[Options] = js.native
  
  var webHook: js.UndefOr[Boolean | WebHookOptions] = js.native
}
object ConstructorOptions {
  
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  
  @scala.inline
  implicit class ConstructorOptionsMutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseApiUrl(value: String): Self = StObject.set(x, "baseApiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseApiUrlUndefined: Self = StObject.set(x, "baseApiUrl", js.undefined)
    
    @scala.inline
    def setFilepath(value: Boolean): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    
    @scala.inline
    def setOnlyFirstMatch(value: Boolean): Self = StObject.set(x, "onlyFirstMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyFirstMatchUndefined: Self = StObject.set(x, "onlyFirstMatch", js.undefined)
    
    @scala.inline
    def setPolling(value: Boolean | PollingOptions): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    @scala.inline
    def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setWebHook(value: Boolean | WebHookOptions): Self = StObject.set(x, "webHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebHookUndefined: Self = StObject.set(x, "webHook", js.undefined)
  }
}
