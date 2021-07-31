package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replication extends StObject {
  
  /** The Secret will automatically be replicated without any restrictions. */
  var automatic: js.UndefOr[Automatic] = js.undefined
  
  /** The Secret will only be replicated into the locations specified. */
  var userManaged: js.UndefOr[UserManaged] = js.undefined
}
object Replication {
  
  @scala.inline
  def apply(): Replication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replication]
  }
  
  @scala.inline
  implicit class ReplicationMutableBuilder[Self <: Replication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatic(value: Automatic): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    @scala.inline
    def setUserManaged(value: UserManaged): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
