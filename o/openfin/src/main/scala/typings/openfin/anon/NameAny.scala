package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameAny extends StObject {
  
  var name: Any
}
object NameAny {
  
  inline def apply(name: Any): NameAny = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameAny]
  }
  
  extension [Self <: NameAny](x: Self) {
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
