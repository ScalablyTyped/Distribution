package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotAfter extends StObject {
  
  var notAfter: js.Date
  
  var notBefore: js.Date
}
object NotAfter {
  
  inline def apply(notAfter: js.Date, notBefore: js.Date): NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAfter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotAfter] (val x: Self) extends AnyVal {
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
  }
}
