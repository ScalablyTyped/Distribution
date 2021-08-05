package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlActiveDirectoryConfig extends StObject {
  
  /** The name of the domain (e.g., mydomain.com). */
  var domain: js.UndefOr[String] = js.undefined
  
  /** This is always sql#activeDirectoryConfig. */
  var kind: js.UndefOr[String] = js.undefined
}
object SqlActiveDirectoryConfig {
  
  inline def apply(): SqlActiveDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlActiveDirectoryConfig]
  }
  
  extension [Self <: SqlActiveDirectoryConfig](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
