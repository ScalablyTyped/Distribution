package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an option for preserving context data of any type, unchanged, for use in a callback.
  */
@js.native
trait AsyncContextOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
}
object AsyncContextOptions {
  
  @scala.inline
  def apply(): AsyncContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncContextOptions]
  }
  
  @scala.inline
  implicit class AsyncContextOptionsMutableBuilder[Self <: AsyncContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
  }
}
