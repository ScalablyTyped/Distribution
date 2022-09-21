package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxArgsMaxArgs[MaxArgs /* <: Double */] extends StObject {
  
  var maxArgs: MaxArgs
}
object MaxArgsMaxArgs {
  
  inline def apply[MaxArgs /* <: Double */](maxArgs: MaxArgs): MaxArgsMaxArgs[MaxArgs] = {
    val __obj = js.Dynamic.literal(maxArgs = maxArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxArgsMaxArgs[MaxArgs]]
  }
  
  extension [Self <: MaxArgsMaxArgs[?], MaxArgs /* <: Double */](x: Self & MaxArgsMaxArgs[MaxArgs]) {
    
    inline def setMaxArgs(value: MaxArgs): Self = StObject.set(x, "maxArgs", value.asInstanceOf[js.Any])
  }
}
