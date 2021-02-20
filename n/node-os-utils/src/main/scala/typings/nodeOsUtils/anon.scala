package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait InputMb extends StObject {
    
    var inputMb: Double = js.native
    
    var outputMb: Double = js.native
  }
  object InputMb {
    
    @scala.inline
    def apply(inputMb: Double, outputMb: Double): InputMb = {
      val __obj = js.Dynamic.literal(inputMb = inputMb.asInstanceOf[js.Any], outputMb = outputMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMb]
    }
    
    @scala.inline
    implicit class InputMbMutableBuilder[Self <: InputMb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputMb(value: Double): Self = StObject.set(x, "inputMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputMb(value: Double): Self = StObject.set(x, "outputMb", value.asInstanceOf[js.Any])
    }
  }
}
