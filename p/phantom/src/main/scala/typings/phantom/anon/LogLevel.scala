package typings.phantom.anon

import typings.phantom.phantomStrings.debug
import typings.phantom.phantomStrings.error
import typings.phantom.phantomStrings.info
import typings.phantom.phantomStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevel extends js.Object {
  
  var logLevel: js.UndefOr[debug | info | warn | error] = js.native
  
  var logger: js.UndefOr[Debug] = js.native
  
  var phantomPath: js.UndefOr[String] = js.native
  
  var shimPath: js.UndefOr[String] = js.native
}
object LogLevel {
  
  @scala.inline
  def apply(): LogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogLevel]
  }
  
  @scala.inline
  implicit class LogLevelOps[Self <: LogLevel] (val x: Self) extends AnyVal {
    
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
    def setLogLevel(value: debug | info | warn | error): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Debug): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setPhantomPath(value: String): Self = this.set("phantomPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhantomPath: Self = this.set("phantomPath", js.undefined)
    
    @scala.inline
    def setShimPath(value: String): Self = this.set("shimPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimPath: Self = this.set("shimPath", js.undefined)
  }
}
