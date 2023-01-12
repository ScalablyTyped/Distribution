package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait config extends StObject {
  
  var arrayRowMode: js.UndefOr[Boolean] = js.undefined
  
  var authentication: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tds.ConnectionAuthentication */ Any
  ] = js.undefined
  
  /**
    * Invoked before opening the connection. The parameter conn is the configured
    * tedious Connection. It can be used for attaching event handlers.
    */
  var beforeConnect: js.UndefOr[js.Function1[/* conn */ Connection, Unit]] = js.undefined
  
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  
  var database: js.UndefOr[String] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var driver: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[IOptions] = js.undefined
  
  var parseJSON: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var pool: js.UndefOr[PoolOpts[Connection]] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var server: String
  
  var stream: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object config {
  
  inline def apply(server: String): config = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: config] (val x: Self) extends AnyVal {
    
    inline def setArrayRowMode(value: Boolean): Self = StObject.set(x, "arrayRowMode", value.asInstanceOf[js.Any])
    
    inline def setArrayRowModeUndefined: Self = StObject.set(x, "arrayRowMode", js.undefined)
    
    inline def setAuthentication(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tds.ConnectionAuthentication */ Any
    ): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setBeforeConnect(value: /* conn */ Connection => Unit): Self = StObject.set(x, "beforeConnect", js.Any.fromFunction1(value))
    
    inline def setBeforeConnectUndefined: Self = StObject.set(x, "beforeConnect", js.undefined)
    
    inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setOptions(value: IOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParseJSON(value: Boolean): Self = StObject.set(x, "parseJSON", value.asInstanceOf[js.Any])
    
    inline def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPool(value: PoolOpts[Connection]): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
