package typings.nodeLogglyBulk.mod

import typings.loggly.mod.LogglyOptions
import typings.nodeLogglyBulk.anon.RetriesInMilliSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogglyBulkOptions extends LogglyOptions {
  
  var bufferOptions: js.UndefOr[RetriesInMilliSeconds] = js.native
  
  var isBulk: js.UndefOr[Boolean] = js.native
  
  var networkErrorsOnConsole: js.UndefOr[Boolean] = js.native
  
  var proxy: js.UndefOr[js.Any] = js.native
  
  var useTagHeader: js.UndefOr[Boolean] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
}
object LogglyBulkOptions {
  
  @scala.inline
  def apply(subdomain: String, token: String): LogglyBulkOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyBulkOptions]
  }
  
  @scala.inline
  implicit class LogglyBulkOptionsOps[Self <: LogglyBulkOptions] (val x: Self) extends AnyVal {
    
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
    def setBufferOptions(value: RetriesInMilliSeconds): Self = this.set("bufferOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferOptions: Self = this.set("bufferOptions", js.undefined)
    
    @scala.inline
    def setIsBulk(value: Boolean): Self = this.set("isBulk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBulk: Self = this.set("isBulk", js.undefined)
    
    @scala.inline
    def setNetworkErrorsOnConsole(value: Boolean): Self = this.set("networkErrorsOnConsole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkErrorsOnConsole: Self = this.set("networkErrorsOnConsole", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setUseTagHeader(value: Boolean): Self = this.set("useTagHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTagHeader: Self = this.set("useTagHeader", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
