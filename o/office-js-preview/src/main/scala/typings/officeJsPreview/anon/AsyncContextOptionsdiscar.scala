package typings.officeJsPreview.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-js-preview.Office.AsyncContextOptions & {  discardItem :boolean} */
trait AsyncContextOptionsdiscar extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
  
  var discardItem: Boolean
}
object AsyncContextOptionsdiscar {
  
  inline def apply(discardItem: Boolean): AsyncContextOptionsdiscar = {
    val __obj = js.Dynamic.literal(discardItem = discardItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContextOptionsdiscar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncContextOptionsdiscar] (val x: Self) extends AnyVal {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setDiscardItem(value: Boolean): Self = StObject.set(x, "discardItem", value.asInstanceOf[js.Any])
  }
}
