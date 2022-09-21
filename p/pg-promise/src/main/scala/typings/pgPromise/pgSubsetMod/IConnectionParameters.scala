package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// See:
// 1) https://github.com/brianc/node-postgres/blob/master/packages/pg/lib/defaults.js
// 2) https://github.com/brianc/node-pg-pool
trait IConnectionParameters[C /* <: IClient */] extends StObject {
  
  var Client: js.UndefOr[Instantiable1[/* config */ String | IConnectionParameters[IClient], C]] = js.undefined
  
  var Promise: js.UndefOr[Any] = js.undefined
  
  var allowExitOnIdle: js.UndefOr[Boolean] = js.undefined
  
  var application_name: js.UndefOr[String] = js.undefined
  
  var binary: js.UndefOr[Boolean] = js.undefined
  
  var client_encoding: js.UndefOr[String] = js.undefined
  
  var connectionString: js.UndefOr[String] = js.undefined
  
  var connectionTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var database: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var fallback_application_name: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var isDomainSocket: js.UndefOr[Boolean] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined
  
  var keepalives: js.UndefOr[Double] = js.undefined
  
  var keepalives_idle: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var maxLifetimeSeconds: js.UndefOr[Double] = js.undefined
  
  var maxUses: js.UndefOr[Double] = js.undefined
  
  var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[DynamicPassword] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var query_timeout: js.UndefOr[Boolean | Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var ssl: js.UndefOr[Boolean | ISSLConfig] = js.undefined
  
  var statement_timeout: js.UndefOr[Boolean | Double] = js.undefined
  
  var types: js.UndefOr[ITypeOverrides] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object IConnectionParameters {
  
  inline def apply[C /* <: IClient */](): IConnectionParameters[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionParameters[C]]
  }
  
  extension [Self <: IConnectionParameters[?], C /* <: IClient */](x: Self & IConnectionParameters[C]) {
    
    inline def setAllowExitOnIdle(value: Boolean): Self = StObject.set(x, "allowExitOnIdle", value.asInstanceOf[js.Any])
    
    inline def setAllowExitOnIdleUndefined: Self = StObject.set(x, "allowExitOnIdle", js.undefined)
    
    inline def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
    
    inline def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], C]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
    
    inline def setClient_encoding(value: String): Self = StObject.set(x, "client_encoding", value.asInstanceOf[js.Any])
    
    inline def setClient_encodingUndefined: Self = StObject.set(x, "client_encoding", js.undefined)
    
    inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    inline def setConnectionTimeoutMillis(value: Double): Self = StObject.set(x, "connectionTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutMillisUndefined: Self = StObject.set(x, "connectionTimeoutMillis", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFallback_application_name(value: String): Self = StObject.set(x, "fallback_application_name", value.asInstanceOf[js.Any])
    
    inline def setFallback_application_nameUndefined: Self = StObject.set(x, "fallback_application_name", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    inline def setIsDomainSocket(value: Boolean): Self = StObject.set(x, "isDomainSocket", value.asInstanceOf[js.Any])
    
    inline def setIsDomainSocketUndefined: Self = StObject.set(x, "isDomainSocket", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelayMillis(value: Double): Self = StObject.set(x, "keepAliveInitialDelayMillis", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelayMillisUndefined: Self = StObject.set(x, "keepAliveInitialDelayMillis", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setKeepalives(value: Double): Self = StObject.set(x, "keepalives", value.asInstanceOf[js.Any])
    
    inline def setKeepalivesUndefined: Self = StObject.set(x, "keepalives", js.undefined)
    
    inline def setKeepalives_idle(value: Double): Self = StObject.set(x, "keepalives_idle", value.asInstanceOf[js.Any])
    
    inline def setKeepalives_idleUndefined: Self = StObject.set(x, "keepalives_idle", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLifetimeSeconds(value: Double): Self = StObject.set(x, "maxLifetimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxLifetimeSecondsUndefined: Self = StObject.set(x, "maxLifetimeSeconds", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxUses(value: Double): Self = StObject.set(x, "maxUses", value.asInstanceOf[js.Any])
    
    inline def setMaxUsesUndefined: Self = StObject.set(x, "maxUses", js.undefined)
    
    inline def setParseInputDatesAsUTC(value: Boolean): Self = StObject.set(x, "parseInputDatesAsUTC", value.asInstanceOf[js.Any])
    
    inline def setParseInputDatesAsUTCUndefined: Self = StObject.set(x, "parseInputDatesAsUTC", js.undefined)
    
    inline def setPassword(value: DynamicPassword): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPromise(value: Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    inline def setQuery_timeout(value: Boolean | Double): Self = StObject.set(x, "query_timeout", value.asInstanceOf[js.Any])
    
    inline def setQuery_timeoutUndefined: Self = StObject.set(x, "query_timeout", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSsl(value: Boolean | ISSLConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setStatement_timeout(value: Boolean | Double): Self = StObject.set(x, "statement_timeout", value.asInstanceOf[js.Any])
    
    inline def setStatement_timeoutUndefined: Self = StObject.set(x, "statement_timeout", js.undefined)
    
    inline def setTypes(value: ITypeOverrides): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
