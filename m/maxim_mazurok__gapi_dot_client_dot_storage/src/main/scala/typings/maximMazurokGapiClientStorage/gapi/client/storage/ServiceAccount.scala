package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccount extends StObject {
  
  /** The ID of the notification. */
  var email_address: js.UndefOr[String] = js.undefined
  
  /** The kind of item this is. For notifications, this is always storage#notification. */
  var kind: js.UndefOr[String] = js.undefined
}
object ServiceAccount {
  
  @scala.inline
  def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  
  @scala.inline
  implicit class ServiceAccountMutableBuilder[Self <: ServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
