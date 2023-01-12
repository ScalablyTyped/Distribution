package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailOnError extends StObject {
  
  /**
    * whether "sap-ui-version.json" should be loaded asynchronously
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether to propagate load errors or not (not relevant for async loading)
    */
  var failOnError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * name of the library (e.g. "sap.ui.core")
    */
  var library: js.UndefOr[Boolean] = js.undefined
}
object FailOnError {
  
  inline def apply(): FailOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailOnError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailOnError] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
    
    inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
    
    inline def setLibrary(value: Boolean): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
  }
}
