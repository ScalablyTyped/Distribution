package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Octicon extends StObject {
  
  var message: String
  
  var octicon: String
}
object Octicon {
  
  inline def apply(message: String, octicon: String): Octicon = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], octicon = octicon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Octicon]
  }
  
  extension [Self <: Octicon](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOcticon(value: String): Self = StObject.set(x, "octicon", value.asInstanceOf[js.Any])
  }
}
