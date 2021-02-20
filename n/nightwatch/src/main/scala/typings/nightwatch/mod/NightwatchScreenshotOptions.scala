package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchScreenshotOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var on_error: js.UndefOr[Boolean] = js.native
  
  var on_failure: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object NightwatchScreenshotOptions {
  
  @scala.inline
  def apply(): NightwatchScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchScreenshotOptions]
  }
  
  @scala.inline
  implicit class NightwatchScreenshotOptionsMutableBuilder[Self <: NightwatchScreenshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOn_error(value: Boolean): Self = StObject.set(x, "on_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_errorUndefined: Self = StObject.set(x, "on_error", js.undefined)
    
    @scala.inline
    def setOn_failure(value: Boolean): Self = StObject.set(x, "on_failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_failureUndefined: Self = StObject.set(x, "on_failure", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
