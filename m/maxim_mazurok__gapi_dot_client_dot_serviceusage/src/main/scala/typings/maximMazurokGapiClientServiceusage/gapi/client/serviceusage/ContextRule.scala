package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextRule extends StObject {
  
  /** A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend. */
  var allowedRequestExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client. */
  var allowedResponseExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of full type names of provided contexts. */
  var provided: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of full type names of requested contexts. */
  var requested: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Selects the methods to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.undefined
}
object ContextRule {
  
  inline def apply(): ContextRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRule]
  }
  
  extension [Self <: ContextRule](x: Self) {
    
    inline def setAllowedRequestExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedRequestExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedRequestExtensionsUndefined: Self = StObject.set(x, "allowedRequestExtensions", js.undefined)
    
    inline def setAllowedRequestExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedRequestExtensions", js.Array(value*))
    
    inline def setAllowedResponseExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedResponseExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedResponseExtensionsUndefined: Self = StObject.set(x, "allowedResponseExtensions", js.undefined)
    
    inline def setAllowedResponseExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedResponseExtensions", js.Array(value*))
    
    inline def setProvided(value: js.Array[String]): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
    
    inline def setProvidedUndefined: Self = StObject.set(x, "provided", js.undefined)
    
    inline def setProvidedVarargs(value: String*): Self = StObject.set(x, "provided", js.Array(value*))
    
    inline def setRequested(value: js.Array[String]): Self = StObject.set(x, "requested", value.asInstanceOf[js.Any])
    
    inline def setRequestedUndefined: Self = StObject.set(x, "requested", js.undefined)
    
    inline def setRequestedVarargs(value: String*): Self = StObject.set(x, "requested", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
