package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  var credentials: js.Object
  
  var flows: js.Array[js.Object]
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object Credentials {
  
  @scala.inline
  def apply(credentials: js.Object, flows: js.Array[js.Object]): Credentials = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlows(value: js.Array[js.Object]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsVarargs(value: js.Object*): Self = StObject.set(x, "flows", js.Array(value :_*))
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
