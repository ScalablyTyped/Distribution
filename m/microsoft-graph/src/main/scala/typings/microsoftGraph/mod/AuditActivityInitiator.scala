package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditActivityInitiator extends StObject {
  
  /**
    * If the resource initiating the activity is an app, this property indicates all the app related information like appId,
    * Name, servicePrincipalId, Name.
    */
  var app: js.UndefOr[NullableOption[AppIdentity]] = js.undefined
  
  /**
    * If the resource initiating the activity is a user, this property Indicates all the user related information like
    * userId, Name, UserPrinicpalName.
    */
  var user: js.UndefOr[NullableOption[UserIdentity]] = js.undefined
}
object AuditActivityInitiator {
  
  inline def apply(): AuditActivityInitiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditActivityInitiator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditActivityInitiator] (val x: Self) extends AnyVal {
    
    inline def setApp(value: NullableOption[AppIdentity]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppNull: Self = StObject.set(x, "app", null)
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setUser(value: NullableOption[UserIdentity]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
