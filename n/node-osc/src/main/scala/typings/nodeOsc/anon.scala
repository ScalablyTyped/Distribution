package typings.nodeOsc

import typings.nodeOsc.mod.ArgumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var args: js.Array[ArgumentType]
  }
  object Address {
    
    inline def apply(address: String, args: js.Array[ArgumentType]): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: js.Array[ArgumentType]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: ArgumentType*): Self = StObject.set(x, "args", js.Array(value*))
    }
  }
}
