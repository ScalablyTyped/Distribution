package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// See:
// 1) https://github.com/brianc/node-postgres/blob/master/packages/pg/lib/defaults.js
// 2) https://github.com/brianc/node-pg-pool
@js.native
trait IConnectionParameters[C /* <: IClient */] extends StObject {
  
  var Client: js.UndefOr[Instantiable1[/* config */ String | IConnectionParameters[IClient], C]] = js.native
  
  var Promise: js.UndefOr[js.Any] = js.native
  
  var application_name: js.UndefOr[String] = js.native
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var client_encoding: js.UndefOr[String] = js.native
  
  var connectionString: js.UndefOr[String] = js.native
  
  var connectionTimeoutMillis: js.UndefOr[Double] = js.native
  
  var database: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var fallback_application_name: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  
  var isDomainSocket: js.UndefOr[Boolean] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.native
  
  var keepalives: js.UndefOr[Double] = js.native
  
  var keepalives_idle: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxUses: js.UndefOr[Double] = js.native
  
  var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[DynamicPassword] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var query_timeout: js.UndefOr[Boolean | Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var ssl: js.UndefOr[Boolean | ISSLConfig] = js.native
  
  var statement_timeout: js.UndefOr[Boolean | Double] = js.native
  
  var types: js.UndefOr[ITypeOverrides] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object IConnectionParameters {
  
  @scala.inline
  def apply[C /* <: IClient */](): IConnectionParameters[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionParameters[C]]
  }
  
  @scala.inline
  implicit class IConnectionParametersMutableBuilder[Self <: IConnectionParameters[_], C /* <: IClient */] (val x: Self with IConnectionParameters[C]) extends AnyVal {
    
    @scala.inline
    def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], C]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
    
    @scala.inline
    def setClient_encoding(value: String): Self = StObject.set(x, "client_encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_encodingUndefined: Self = StObject.set(x, "client_encoding", js.undefined)
    
    @scala.inline
    def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
    
    @scala.inline
    def setConnectionTimeoutMillis(value: Double): Self = StObject.set(x, "connectionTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeoutMillisUndefined: Self = StObject.set(x, "connectionTimeoutMillis", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFallback_application_name(value: String): Self = StObject.set(x, "fallback_application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_application_nameUndefined: Self = StObject.set(x, "fallback_application_name", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setIsDomainSocket(value: Boolean): Self = StObject.set(x, "isDomainSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDomainSocketUndefined: Self = StObject.set(x, "isDomainSocket", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveInitialDelayMillis(value: Double): Self = StObject.set(x, "keepAliveInitialDelayMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveInitialDelayMillisUndefined: Self = StObject.set(x, "keepAliveInitialDelayMillis", js.undefined)
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setKeepalives(value: Double): Self = StObject.set(x, "keepalives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepalivesUndefined: Self = StObject.set(x, "keepalives", js.undefined)
    
    @scala.inline
    def setKeepalives_idle(value: Double): Self = StObject.set(x, "keepalives_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepalives_idleUndefined: Self = StObject.set(x, "keepalives_idle", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxUses(value: Double): Self = StObject.set(x, "maxUses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUsesUndefined: Self = StObject.set(x, "maxUses", js.undefined)
    
    @scala.inline
    def setParseInputDatesAsUTC(value: Boolean): Self = StObject.set(x, "parseInputDatesAsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseInputDatesAsUTCUndefined: Self = StObject.set(x, "parseInputDatesAsUTC", js.undefined)
    
    @scala.inline
    def setPassword(value: DynamicPassword): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    @scala.inline
    def setQuery_timeout(value: Boolean | Double): Self = StObject.set(x, "query_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_timeoutUndefined: Self = StObject.set(x, "query_timeout", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean | ISSLConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setStatement_timeout(value: Boolean | Double): Self = StObject.set(x, "statement_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_timeoutUndefined: Self = StObject.set(x, "statement_timeout", js.undefined)
    
    @scala.inline
    def setTypes(value: ITypeOverrides): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
