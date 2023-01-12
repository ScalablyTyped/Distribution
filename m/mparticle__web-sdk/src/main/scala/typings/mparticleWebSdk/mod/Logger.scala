package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var error: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  var verbose: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  var warning: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
}
object Logger {
  
  inline def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* error */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setVerbose(value: /* error */ String => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWarning(value: /* error */ String => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
