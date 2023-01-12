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
  var asyncContext: js.UndefOr[Any] = js.undefined
  
  /**
    * **Warning**: This setting has been deprecated and should not be used. It has no effect on most platforms and will cause errors if set to `false` in Excel on the web.
    * 
    * @deprecated `overwriteIfStale` is no longer supported.
    */
  var overwriteIfStale: js.UndefOr[Boolean] = js.undefined
}
object SaveSettingsOptions {
  
  inline def apply(): SaveSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSettingsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveSettingsOptions] (val x: Self) extends AnyVal {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setOverwriteIfStale(value: Boolean): Self = StObject.set(x, "overwriteIfStale", value.asInstanceOf[js.Any])
    
    inline def setOverwriteIfStaleUndefined: Self = StObject.set(x, "overwriteIfStale", js.undefined)
  }
}
