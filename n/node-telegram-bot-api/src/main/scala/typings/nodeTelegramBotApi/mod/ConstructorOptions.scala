package typings.nodeTelegramBotApi.mod

import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorOptions extends js.Object {
  
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
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseApiUrl(value: String): Self = this.set("baseApiUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseApiUrl: Self = this.set("baseApiUrl", js.undefined)
    
    @scala.inline
    def setFilepath(value: Boolean): Self = this.set("filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilepath: Self = this.set("filepath", js.undefined)
    
    @scala.inline
    def setOnlyFirstMatch(value: Boolean): Self = this.set("onlyFirstMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyFirstMatch: Self = this.set("onlyFirstMatch", js.undefined)
    
    @scala.inline
    def setPolling(value: Boolean | PollingOptions): Self = this.set("polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolling: Self = this.set("polling", js.undefined)
    
    @scala.inline
    def setRequest(value: Options): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setWebHook(value: Boolean | WebHookOptions): Self = this.set("webHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebHook: Self = this.set("webHook", js.undefined)
  }
}
