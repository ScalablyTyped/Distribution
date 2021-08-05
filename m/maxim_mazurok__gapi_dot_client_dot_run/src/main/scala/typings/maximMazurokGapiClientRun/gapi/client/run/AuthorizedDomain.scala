package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizedDomain extends StObject {
  
  /** Relative name of the domain authorized for use. Example: `example.com`. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Deprecated Read only. Full path to the `AuthorizedDomain` resource in the API. Example: `projects/myproject/authorizedDomains/example.com`. */
  var name: js.UndefOr[String] = js.undefined
}
object AuthorizedDomain {
  
  inline def apply(): AuthorizedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedDomain]
  }
  
  extension [Self <: AuthorizedDomain](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
