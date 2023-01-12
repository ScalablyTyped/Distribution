package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserManagedStatus extends StObject {
  
  /** Output only. The list of replica statuses for the SecretVersion. */
  var replicas: js.UndefOr[js.Array[ReplicaStatus]] = js.undefined
}
object UserManagedStatus {
  
  inline def apply(): UserManagedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserManagedStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserManagedStatus] (val x: Self) extends AnyVal {
    
    inline def setReplicas(value: js.Array[ReplicaStatus]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setReplicasVarargs(value: ReplicaStatus*): Self = StObject.set(x, "replicas", js.Array(value*))
  }
}
