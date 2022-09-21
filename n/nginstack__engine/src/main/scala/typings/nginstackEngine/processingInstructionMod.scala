package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processingInstructionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/ProcessingInstruction", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ProcessingInstruction {
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/ProcessingInstruction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ProcessingInstruction extends StObject {
    
    var data: String
    
    var target: String
  }
  object ProcessingInstruction {
    
    inline def apply(data: String, target: String): ProcessingInstruction = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessingInstruction]
    }
    
    extension [Self <: ProcessingInstruction](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
