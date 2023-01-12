package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartActivityNotFound extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object StartActivityNotFound {
  
  inline def apply(): StartActivityNotFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityNotFound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartActivityNotFound] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
