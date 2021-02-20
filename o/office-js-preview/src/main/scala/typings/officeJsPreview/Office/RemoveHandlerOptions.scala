package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options to determine which event handler or handlers are removed.
  */
@js.native
trait RemoveHandlerOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  /**
    * The handler to be removed. If a particular handler is not specified, then all handlers for the specified event type are removed. The `BindingEventHandler` type is defined with `type BindingEventHandler = (eventArgs?: Office.BindingDataChangedEventArgs | Office.BindingSelectionChangedEventArgs) => any`.
    */
  var handler: js.UndefOr[BindingEventHandler] = js.native
}
object RemoveHandlerOptions {
  
  @scala.inline
  def apply(): RemoveHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHandlerOptions]
  }
  
  @scala.inline
  implicit class RemoveHandlerOptionsMutableBuilder[Self <: RemoveHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    @scala.inline
    def setHandler(
      value: /* eventArgs */ js.UndefOr[BindingDataChangedEventArgs | BindingSelectionChangedEventArgs] => js.Any
    ): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
  }
}
