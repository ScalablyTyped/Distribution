package typings.pdfjsDist.anon

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameAny] (val x: Self) extends AnyVal {
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
