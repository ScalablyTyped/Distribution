package typings.phantom.anon

import typings.phantom.phantomStrings.debug
import typings.phantom.phantomStrings.error
import typings.phantom.phantomStrings.info
import typings.phantom.phantomStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogLevel extends StObject {
  
  var logLevel: js.UndefOr[debug | info | warn | error] = js.undefined
  
  var logger: js.UndefOr[Debug] = js.undefined
  
  var phantomPath: js.UndefOr[String] = js.undefined
  
  var shimPath: js.UndefOr[String] = js.undefined
}
object LogLevel {
  
  inline def apply(): LogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogLevel]
  }
  
  extension [Self <: LogLevel](x: Self) {
    
    inline def setLogLevel(value: debug | info | warn | error): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
    
    inline def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
    
    inline def setShimPath(value: String): Self = StObject.set(x, "shimPath", value.asInstanceOf[js.Any])
    
    inline def setShimPathUndefined: Self = StObject.set(x, "shimPath", js.undefined)
  }
}
