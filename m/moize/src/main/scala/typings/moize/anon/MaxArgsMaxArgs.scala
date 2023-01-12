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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxArgsMaxArgs[?], MaxArgs /* <: Double */] (val x: Self & MaxArgsMaxArgs[MaxArgs]) extends AnyVal {
    
    inline def setMaxArgs(value: MaxArgs): Self = StObject.set(x, "maxArgs", value.asInstanceOf[js.Any])
  }
}
