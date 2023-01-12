package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait InputMb extends StObject {
    
    var inputMb: Double
    
    var outputMb: Double
  }
  object InputMb {
    
    inline def apply(inputMb: Double, outputMb: Double): InputMb = {
      val __obj = js.Dynamic.literal(inputMb = inputMb.asInstanceOf[js.Any], outputMb = outputMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputMb] (val x: Self) extends AnyVal {
      
      inline def setInputMb(value: Double): Self = StObject.set(x, "inputMb", value.asInstanceOf[js.Any])
      
      inline def setOutputMb(value: Double): Self = StObject.set(x, "outputMb", value.asInstanceOf[js.Any])
    }
  }
}
