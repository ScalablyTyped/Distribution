package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialsDirty extends StObject {
  
  var credentials: js.Object
  
  var credentialsDirty: js.UndefOr[Boolean] = js.undefined
  
  var flows: js.Array[js.Object]
}
object CredentialsDirty {
  
  inline def apply(credentials: js.Object, flows: js.Array[js.Object]): CredentialsDirty = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsDirty]
  }
  
  extension [Self <: CredentialsDirty](x: Self) {
    
    inline def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsDirty(value: Boolean): Self = StObject.set(x, "credentialsDirty", value.asInstanceOf[js.Any])
    
    inline def setCredentialsDirtyUndefined: Self = StObject.set(x, "credentialsDirty", js.undefined)
    
    inline def setFlows(value: js.Array[js.Object]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsVarargs(value: js.Object*): Self = StObject.set(x, "flows", js.Array(value :_*))
  }
}
