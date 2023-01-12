package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintServiceEndpoint
  extends StObject
     with Entity {
  
  // A human-readable display name for the endpoint.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The URI that can be used to access the service.
  var uri: js.UndefOr[String] = js.undefined
}
object PrintServiceEndpoint {
  
  inline def apply(): PrintServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintServiceEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintServiceEndpoint] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
