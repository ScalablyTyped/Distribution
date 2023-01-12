package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationStatus extends StObject {
  
  /** Describes the replication status of a SecretVersion with automatic replication. Only populated if the parent Secret has an automatic replication policy. */
  var automatic: js.UndefOr[AutomaticStatus] = js.undefined
  
  /** Describes the replication status of a SecretVersion with user-managed replication. Only populated if the parent Secret has a user-managed replication policy. */
  var userManaged: js.UndefOr[UserManagedStatus] = js.undefined
}
object ReplicationStatus {
  
  inline def apply(): ReplicationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationStatus] (val x: Self) extends AnyVal {
    
    inline def setAutomatic(value: AutomaticStatus): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    inline def setUserManaged(value: UserManagedStatus): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
