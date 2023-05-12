package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetExecutionModeOptions extends StObject {
  
  var enableErrorStacktraces: js.UndefOr[Boolean] = js.undefined
  
  var logRejections: js.UndefOr[Boolean] = js.undefined
}
object SetExecutionModeOptions {
  
  inline def apply(): SetExecutionModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetExecutionModeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetExecutionModeOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableErrorStacktraces(value: Boolean): Self = StObject.set(x, "enableErrorStacktraces", value.asInstanceOf[js.Any])
    
    inline def setEnableErrorStacktracesUndefined: Self = StObject.set(x, "enableErrorStacktraces", js.undefined)
    
    inline def setLogRejections(value: Boolean): Self = StObject.set(x, "logRejections", value.asInstanceOf[js.Any])
    
    inline def setLogRejectionsUndefined: Self = StObject.set(x, "logRejections", js.undefined)
  }
}
