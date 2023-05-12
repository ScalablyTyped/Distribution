package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeFlatNodeModules extends StObject {
  
  var assumeFlatNodeModules: Boolean
}
object AssumeFlatNodeModules {
  
  inline def apply(assumeFlatNodeModules: Boolean): AssumeFlatNodeModules = {
    val __obj = js.Dynamic.literal(assumeFlatNodeModules = assumeFlatNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeFlatNodeModules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssumeFlatNodeModules] (val x: Self) extends AnyVal {
    
    inline def setAssumeFlatNodeModules(value: Boolean): Self = StObject.set(x, "assumeFlatNodeModules", value.asInstanceOf[js.Any])
  }
}
