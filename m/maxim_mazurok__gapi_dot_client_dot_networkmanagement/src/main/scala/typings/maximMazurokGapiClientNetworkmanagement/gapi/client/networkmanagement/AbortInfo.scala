package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortInfo extends StObject {
  
  /** Causes that the analysis is aborted. */
  var cause: js.UndefOr[String] = js.undefined
  
  /** URI of the resource that caused the abort. */
  var resourceUri: js.UndefOr[String] = js.undefined
}
object AbortInfo {
  
  inline def apply(): AbortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbortInfo] (val x: Self) extends AnyVal {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
