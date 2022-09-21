package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  /** The human readable name of the database the user connected to. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The target usernames/roles/groups of a SQL privilege grant (not an IAM policy change). */
  var grantees: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The full resource name of the database the user connected to, if it is supported by CAI. (https://google.aip.dev/122#full-resource-names) */
  var name: js.UndefOr[String] = js.undefined
  
  /** The SQL statement associated with the relevant access. */
  var query: js.UndefOr[String] = js.undefined
  
  /** The username used to connect to the DB. This may not necessarily be an IAM principal, and has no required format. */
  var userName: js.UndefOr[String] = js.undefined
}
object Database {
  
  inline def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  extension [Self <: Database](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGrantees(value: js.Array[String]): Self = StObject.set(x, "grantees", value.asInstanceOf[js.Any])
    
    inline def setGranteesUndefined: Self = StObject.set(x, "grantees", js.undefined)
    
    inline def setGranteesVarargs(value: String*): Self = StObject.set(x, "grantees", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
