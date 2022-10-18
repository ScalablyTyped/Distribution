package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedRegex extends StObject {
  
  var namedRegex: String
}
object NamedRegex {
  
  inline def apply(namedRegex: String): NamedRegex = {
    val __obj = js.Dynamic.literal(namedRegex = namedRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedRegex]
  }
  
  extension [Self <: NamedRegex](x: Self) {
    
    inline def setNamedRegex(value: String): Self = StObject.set(x, "namedRegex", value.asInstanceOf[js.Any])
  }
}
