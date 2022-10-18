package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next-auth.next-auth.CookieOption, 'options'> */
trait OmitCookieOptionoptions extends StObject {
  
  var name: String
}
object OmitCookieOptionoptions {
  
  inline def apply(name: String): OmitCookieOptionoptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitCookieOptionoptions]
  }
  
  extension [Self <: OmitCookieOptionoptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
