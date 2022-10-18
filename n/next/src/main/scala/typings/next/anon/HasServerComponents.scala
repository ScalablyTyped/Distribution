package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasServerComponents extends StObject {
  
  var hasServerComponents: Boolean
}
object HasServerComponents {
  
  inline def apply(hasServerComponents: Boolean): HasServerComponents = {
    val __obj = js.Dynamic.literal(hasServerComponents = hasServerComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasServerComponents]
  }
  
  extension [Self <: HasServerComponents](x: Self) {
    
    inline def setHasServerComponents(value: Boolean): Self = StObject.set(x, "hasServerComponents", value.asInstanceOf[js.Any])
  }
}
