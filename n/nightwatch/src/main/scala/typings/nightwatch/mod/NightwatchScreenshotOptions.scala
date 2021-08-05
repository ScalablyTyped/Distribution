package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchScreenshotOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var on_error: js.UndefOr[Boolean] = js.undefined
  
  var on_failure: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object NightwatchScreenshotOptions {
  
  inline def apply(): NightwatchScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchScreenshotOptions]
  }
  
  extension [Self <: NightwatchScreenshotOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOn_error(value: Boolean): Self = StObject.set(x, "on_error", value.asInstanceOf[js.Any])
    
    inline def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
    
    inline def setOn_failure(value: Boolean): Self = StObject.set(x, "on_failure", value.asInstanceOf[js.Any])
    
    inline def setOn_failureUndefined: Self = StObject.set(x, "on_failure", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
