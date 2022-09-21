package typings.obsStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveInfo extends StObject {
  
  var active: Boolean
}
object ActiveInfo {
  
  inline def apply(active: Boolean): ActiveInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveInfo]
  }
  
  extension [Self <: ActiveInfo](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
