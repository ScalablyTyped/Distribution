package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait On extends StObject {
  
  var on: Boolean
}
object On {
  
  inline def apply(on: Boolean): On = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: On] (val x: Self) extends AnyVal {
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
