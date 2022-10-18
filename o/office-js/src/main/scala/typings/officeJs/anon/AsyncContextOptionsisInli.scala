package typings.officeJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-js.Office.AsyncContextOptions & {  isInline :boolean} */
trait AsyncContextOptionsisInli extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
    * that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
  
  var isInline: Boolean
}
object AsyncContextOptionsisInli {
  
  inline def apply(isInline: Boolean): AsyncContextOptionsisInli = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncContextOptionsisInli]
  }
  
  extension [Self <: AsyncContextOptionsisInli](x: Self) {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
  }
}
