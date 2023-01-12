package typings.moduleError

import typings.moduleError.anon.Cause
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("module-error", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ModuleError {
    /**
      * @param message Error message
      */
    def this(message: String) = this()
    def this(message: String, options: Cause) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait ModuleError
    extends StObject
       with Error {
    
    @JSName("cause")
    var cause_ModuleError: js.UndefOr[js.Error] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var expected: js.UndefOr[Boolean] = js.undefined
    
    var transient: js.UndefOr[Boolean] = js.undefined
  }
  object ModuleError {
    
    inline def apply(message: String, name: String): ModuleError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleError] (val x: Self) extends AnyVal {
      
      inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setExpected(value: Boolean): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setTransient(value: Boolean): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
      
      inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
    }
  }
}
