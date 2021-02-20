package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends StObject {
  
  /**
    * The charset for the connection. This is called "collation" in the SQL-level of MySQL (like utf8_general_ci).
    * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
    * (Default: 'UTF8_GENERAL_CI')
    */
  var charset: js.UndefOr[String] = js.native
  
  /**
    * Name of the database to use for this connection
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * The password of that MySQL user
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Number of milliseconds
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * The MySQL user to authenticate as
    */
  var user: js.UndefOr[String] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
