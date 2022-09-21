package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /** Dual password status for the user. */
  var dualPasswordType: js.UndefOr[String] = js.undefined
  
  /** This field is deprecated and will be removed from a future version of the API. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The host from which the user can connect. For `insert` operations, host defaults to an empty string. For `update` operations, host is specified as part of the request URL.
    * The host name cannot be updated after insertion. For a MySQL instance, it's required; for a PostgreSQL or SQL Server instance, it's optional.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /** The name of the Cloud SQL instance. This does not include the project ID. Can be omitted for `update` because it is already specified on the URL. */
  var instance: js.UndefOr[String] = js.undefined
  
  /** This is always `sql#user`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of the user in the Cloud SQL instance. Can be omitted for `update` because it is already specified in the URL. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The password for the user. */
  var password: js.UndefOr[String] = js.undefined
  
  /** User level password validation policy. */
  var passwordPolicy: js.UndefOr[UserPasswordValidationPolicy] = js.undefined
  
  /**
    * The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. Can be omitted for `update` because it is already specified on the
    * URL.
    */
  var project: js.UndefOr[String] = js.undefined
  
  var sqlserverUserDetails: js.UndefOr[SqlServerUserDetails] = js.undefined
  
  /** The user type. It determines the method to authenticate the user during login. The default is the database's built-in user type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setDualPasswordType(value: String): Self = StObject.set(x, "dualPasswordType", value.asInstanceOf[js.Any])
    
    inline def setDualPasswordTypeUndefined: Self = StObject.set(x, "dualPasswordType", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicy(value: UserPasswordValidationPolicy): Self = StObject.set(x, "passwordPolicy", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicyUndefined: Self = StObject.set(x, "passwordPolicy", js.undefined)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSqlserverUserDetails(value: SqlServerUserDetails): Self = StObject.set(x, "sqlserverUserDetails", value.asInstanceOf[js.Any])
    
    inline def setSqlserverUserDetailsUndefined: Self = StObject.set(x, "sqlserverUserDetails", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
