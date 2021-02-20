package typings.mssql.mod

import typings.tedious.mod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait config extends StObject {
  
  /**
    * Invoked before opening the connection. The parameter conn is the configured
    * tedious Connection. It can be used for attaching event handlers.
    */
  var beforeConnect: js.UndefOr[js.Function1[/* conn */ Connection, Unit]] = js.native
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var database: String = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var driver: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[IOptions] = js.native
  
  var parseJSON: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var pool: js.UndefOr[IPool] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var server: String = js.native
  
  var stream: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object config {
  
  @scala.inline
  def apply(database: String, server: String): config = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit class configMutableBuilder[Self <: config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeConnect(value: /* conn */ Connection => Unit): Self = StObject.set(x, "beforeConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeConnectUndefined: Self = StObject.set(x, "beforeConnect", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    @scala.inline
    def setOptions(value: IOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParseJSON(value: Boolean): Self = StObject.set(x, "parseJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPool(value: IPool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
