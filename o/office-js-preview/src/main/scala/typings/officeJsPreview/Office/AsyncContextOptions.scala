package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an option for preserving context data of any type, unchanged, for use in a callback.
  */
trait AsyncContextOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
}
object AsyncContextOptions {
  
  inline def apply(): AsyncContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncContextOptions]
  }
  
  extension [Self <: AsyncContextOptions](x: Self) {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
  }
}
