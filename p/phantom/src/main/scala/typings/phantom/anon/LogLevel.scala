package typings.phantom.anon

import typings.phantom.phantomStrings.debug
import typings.phantom.phantomStrings.error
import typings.phantom.phantomStrings.info
import typings.phantom.phantomStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevel extends StObject {
  
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
  implicit class LogLevelMutableBuilder[Self <: LogLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: debug | info | warn | error): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
    
    @scala.inline
    def setShimPath(value: String): Self = StObject.set(x, "shimPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShimPathUndefined: Self = StObject.set(x, "shimPath", js.undefined)
  }
}
