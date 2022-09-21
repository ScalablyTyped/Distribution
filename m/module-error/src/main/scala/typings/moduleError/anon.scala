package typings.moduleError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cause extends StObject {
    
    var cause: js.UndefOr[js.Error] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var expected: js.UndefOr[Boolean] = js.undefined
    
    var transient: js.UndefOr[Boolean] = js.undefined
  }
  object Cause {
    
    inline def apply(): Cause = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cause]
    }
    
    extension [Self <: Cause](x: Self) {
      
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
