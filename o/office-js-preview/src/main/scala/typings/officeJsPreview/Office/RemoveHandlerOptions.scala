package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options to determine which event handler or handlers are removed.
  */
trait RemoveHandlerOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
  
  /**
    * The handler to be removed. If a particular handler is not specified, then all handlers for the specified event type are removed.
    */
  var handler: js.UndefOr[
    js.Function1[
      /* eventArgs */ js.UndefOr[BindingDataChangedEventArgs | BindingSelectionChangedEventArgs], 
      Any
    ]
  ] = js.undefined
}
object RemoveHandlerOptions {
  
  inline def apply(): RemoveHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHandlerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveHandlerOptions] (val x: Self) extends AnyVal {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setHandler(
      value: /* eventArgs */ js.UndefOr[BindingDataChangedEventArgs | BindingSelectionChangedEventArgs] => Any
    ): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
  }
}
