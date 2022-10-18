package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var debug_id: String
  
  var details: js.UndefOr[js.Array[ErrorDetails]] = js.undefined
  
  var information_link: js.UndefOr[String] = js.undefined
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.undefined
  
  var message: String
  
  var name: String
}
object Error {
  
  inline def apply(debug_id: String, message: String, name: String): Error = {
    val __obj = js.Dynamic.literal(debug_id = debug_id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setDebug_id(value: String): Self = StObject.set(x, "debug_id", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[ErrorDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: ErrorDetails*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setInformation_link(value: String): Self = StObject.set(x, "information_link", value.asInstanceOf[js.Any])
    
    inline def setInformation_linkUndefined: Self = StObject.set(x, "information_link", js.undefined)
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
