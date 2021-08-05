package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserManaged extends StObject {
  
  /** Required. The list of Replicas for this Secret. Cannot be empty. */
  var replicas: js.UndefOr[js.Array[Replica]] = js.undefined
}
object UserManaged {
  
  inline def apply(): UserManaged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserManaged]
  }
  
  extension [Self <: UserManaged](x: Self) {
    
    inline def setReplicas(value: js.Array[Replica]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: Replica*): Self = StObject.set(x, "replicas", js.Array(value :_*))
  }
}
