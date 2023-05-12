package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reset extends StObject {
  
  var reset: Boolean
  
  var shallow: Boolean
}
object Reset {
  
  inline def apply(reset: Boolean, shallow: Boolean): Reset = {
    val __obj = js.Dynamic.literal(reset = reset.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
  }
}
