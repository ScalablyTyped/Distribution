package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<node.crypto.X509CheckOptions, 'subject'> */
trait PickX509CheckOptionssubje extends StObject {
  
  var subject: "always" | "never"
}
object PickX509CheckOptionssubje {
  
  inline def apply(subject: "always" | "never"): PickX509CheckOptionssubje = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickX509CheckOptionssubje]
  }
  
  extension [Self <: PickX509CheckOptionssubje](x: Self) {
    
    inline def setSubject(value: "always" | "never"): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
