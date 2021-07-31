package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.oracledb.anon.ConnectionString
  - typings.oracledb.anon.ConnectString
*/
trait DBCredentials extends StObject
object DBCredentials {
  
  @scala.inline
  def ConnectString(connectString: String, password: String, user: String): typings.oracledb.anon.ConnectString = {
    val __obj = js.Dynamic.literal(connectString = connectString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.oracledb.anon.ConnectString]
  }
  
  @scala.inline
  def ConnectionString(connectionString: String, password: String, user: String): typings.oracledb.anon.ConnectionString = {
    val __obj = js.Dynamic.literal(connectionString = connectionString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.oracledb.anon.ConnectionString]
  }
}
