package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsDirty extends StObject {
  
  var credentials: js.Object = js.native
  
  var credentialsDirty: js.UndefOr[Boolean] = js.native
  
  var flows: js.Array[js.Object] = js.native
}
object CredentialsDirty {
  
  @scala.inline
  def apply(credentials: js.Object, flows: js.Array[js.Object]): CredentialsDirty = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsDirty]
  }
  
  @scala.inline
  implicit class CredentialsDirtyMutableBuilder[Self <: CredentialsDirty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsDirty(value: Boolean): Self = StObject.set(x, "credentialsDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsDirtyUndefined: Self = StObject.set(x, "credentialsDirty", js.undefined)
    
    @scala.inline
    def setFlows(value: js.Array[js.Object]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsVarargs(value: js.Object*): Self = StObject.set(x, "flows", js.Array(value :_*))
  }
}
