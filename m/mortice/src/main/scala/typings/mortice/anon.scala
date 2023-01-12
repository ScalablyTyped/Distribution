package typings.mortice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<mortice.mortice.MorticeOptions> */
  trait RequiredMorticeOptions extends StObject {
    
    var concurrency: Double
    
    var name: String
    
    var singleProcess: Boolean
    
    var timeout: Double
  }
  object RequiredMorticeOptions {
    
    inline def apply(concurrency: Double, name: String, singleProcess: Boolean, timeout: Double): RequiredMorticeOptions = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], singleProcess = singleProcess.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredMorticeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredMorticeOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSingleProcess(value: Boolean): Self = StObject.set(x, "singleProcess", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
