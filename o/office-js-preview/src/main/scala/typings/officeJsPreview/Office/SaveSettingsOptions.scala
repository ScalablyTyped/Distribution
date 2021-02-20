package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for saving settings.
  */
@js.native
trait SaveSettingsOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates whether the setting will be replaced if stale.
    */
  var overwriteIfStale: js.UndefOr[Boolean] = js.native
}
object SaveSettingsOptions {
  
  @scala.inline
  def apply(): SaveSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSettingsOptions]
  }
  
  @scala.inline
  implicit class SaveSettingsOptionsMutableBuilder[Self <: SaveSettingsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    @scala.inline
    def setOverwriteIfStale(value: Boolean): Self = StObject.set(x, "overwriteIfStale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteIfStaleUndefined: Self = StObject.set(x, "overwriteIfStale", js.undefined)
  }
}
