package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialsFlows extends StObject {
  
  var credentials: js.Object
  
  var flows: js.Array[js.Object]
  
  var rev: String
}
object CredentialsFlows {
  
  inline def apply(credentials: js.Object, flows: js.Array[js.Object], rev: String): CredentialsFlows = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsFlows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredentialsFlows] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setFlows(value: js.Array[js.Object]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsVarargs(value: js.Object*): Self = StObject.set(x, "flows", js.Array(value*))
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
