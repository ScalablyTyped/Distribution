package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendParams extends StObject {
  
  var From: String
  
  var Text: String
  
  var To: String
}
object SendParams {
  
  inline def apply(From: String, Text: String, To: String): SendParams = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  
  extension [Self <: SendParams](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
