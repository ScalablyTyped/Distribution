package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseRole extends StObject {
  
  /**
    * Required. The name of the database role. Values are of the form `projects//instances//databases//databaseRoles/ {role}`, where `` is as specified in the `CREATE ROLE` DDL statement.
    * This name can be passed to Get/Set IAMPolicy methods to identify the database role.
    */
  var name: js.UndefOr[String] = js.undefined
}
object DatabaseRole {
  
  inline def apply(): DatabaseRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseRole]
  }
  
  extension [Self <: DatabaseRole](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
