package typings.officeJsPreview.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-js-preview.Office.AsyncContextOptions & {  isRest :boolean | undefined} */
trait AsyncContextOptionsisRest extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
  
  var isRest: js.UndefOr[Boolean] = js.undefined
}
object AsyncContextOptionsisRest {
  
  inline def apply(): AsyncContextOptionsisRest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncContextOptionsisRest]
  }
  
  extension [Self <: AsyncContextOptionsisRest](x: Self) {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setIsRest(value: Boolean): Self = StObject.set(x, "isRest", value.asInstanceOf[js.Any])
    
    inline def setIsRestUndefined: Self = StObject.set(x, "isRest", js.undefined)
  }
}
