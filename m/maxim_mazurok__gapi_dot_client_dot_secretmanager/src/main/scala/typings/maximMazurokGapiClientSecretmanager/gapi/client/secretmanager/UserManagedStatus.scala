package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserManagedStatus extends StObject {
  
  /** Output only. The list of replica statuses for the SecretVersion. */
  var replicas: js.UndefOr[js.Array[ReplicaStatus]] = js.undefined
}
object UserManagedStatus {
  
  @scala.inline
  def apply(): UserManagedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserManagedStatus]
  }
  
  @scala.inline
  implicit class UserManagedStatusMutableBuilder[Self <: UserManagedStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicas(value: js.Array[ReplicaStatus]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: ReplicaStatus*): Self = StObject.set(x, "replicas", js.Array(value :_*))
  }
}
