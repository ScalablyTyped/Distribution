package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * A collection of application IDs for registered Azure Active Directory apps that are allowed to manage the
    * externalConnection and to index content in the externalConnection.
    */
  var authorizedAppIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setAuthorizedAppIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "authorizedAppIds", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedAppIdsNull: Self = StObject.set(x, "authorizedAppIds", null)
    
    inline def setAuthorizedAppIdsUndefined: Self = StObject.set(x, "authorizedAppIds", js.undefined)
    
    inline def setAuthorizedAppIdsVarargs(value: String*): Self = StObject.set(x, "authorizedAppIds", js.Array(value*))
  }
}
