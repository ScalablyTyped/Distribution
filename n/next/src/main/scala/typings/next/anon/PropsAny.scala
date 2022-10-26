package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsAny extends StObject {
  
  var props: Any
}
object PropsAny {
  
  inline def apply(props: Any): PropsAny = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsAny]
  }
  
  extension [Self <: PropsAny](x: Self) {
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
