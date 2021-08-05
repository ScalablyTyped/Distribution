package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for saving settings.
  */
trait SaveSettingsOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Indicates whether the setting will be replaced if stale.
    */
  var overwriteIfStale: js.UndefOr[Boolean] = js.undefined
}
object SaveSettingsOptions {
  
  inline def apply(): SaveSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSettingsOptions]
  }
  
  extension [Self <: SaveSettingsOptions](x: Self) {
    
    inline def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setOverwriteIfStale(value: Boolean): Self = StObject.set(x, "overwriteIfStale", value.asInstanceOf[js.Any])
    
    inline def setOverwriteIfStaleUndefined: Self = StObject.set(x, "overwriteIfStale", js.undefined)
  }
}
