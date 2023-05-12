package typings.pgPromise.typescriptPgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDefaults extends StObject {
  
  var application_name: String
  
  // binary result mode
  var binary: Boolean
  
  // max milliseconds a client can go unused before it is removed from the pool and destroyed;
  //
  // Made unavailable in v10.5.0, due to the following:
  //  - https://github.com/brianc/node-postgres/issues/2139
  //  - https://github.com/vitaly-t/pg-promise/issues/703
  //
  // idleTimeoutMillis: number
  var client_encoding: String
  
  // connection string for overriding defaults
  var connectionString: String
  
  // name of database to connect
  var database: String
  
  var fallback_application_name: String
  
  // database host. defaults to localhost
  var host: String
  
  // Terminate any session with an open transaction that has been idle for longer than
  // the specified duration in milliseconds; false = unlimited
  var idle_in_transaction_session_timeout: Boolean | Double
  
  var keepalives: Double
  
  var keepalives_idle: Double
  
  // Abort any statement that waits longer than the specified duration in milliseconds
  // while attempting to acquire a lock; false = unlimited
  var lock_timeout: Boolean | Double
  
  // Connection pool options - see https://github.com/brianc/node-pg-pool
  // number of connections to use in connection pool
  // 0 will disable connection pooling
  var max: Double
  
  var parseInputDatesAsUTC: Boolean
  
  // database user's password
  var password: DynamicPassword
  
  // database port
  var port: Double
  
  // max milliseconds to wait for query to complete (client side)
  var query_timeout: Boolean | Double
  
  // number of rows to return at a time from a prepared statement's
  // portal. 0 will return all rows at once
  var rows: Double
  
  var ssl: Boolean | ISSLConfig
  
  // Max milliseconds any query using this connection will execute for before timing out in error.
  // false = unlimited
  var statement_timeout: Boolean | Double
  
  // database user's name
  var user: String
}
object IDefaults {
  
  inline def apply(
    application_name: String,
    binary: Boolean,
    client_encoding: String,
    connectionString: String,
    database: String,
    fallback_application_name: String,
    host: String,
    idle_in_transaction_session_timeout: Boolean | Double,
    keepalives: Double,
    keepalives_idle: Double,
    lock_timeout: Boolean | Double,
    max: Double,
    parseInputDatesAsUTC: Boolean,
    password: DynamicPassword,
    port: Double,
    query_timeout: Boolean | Double,
    rows: Double,
    ssl: Boolean | ISSLConfig,
    statement_timeout: Boolean | Double,
    user: String
  ): IDefaults = {
    val __obj = js.Dynamic.literal(application_name = application_name.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], client_encoding = client_encoding.asInstanceOf[js.Any], connectionString = connectionString.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], fallback_application_name = fallback_application_name.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], idle_in_transaction_session_timeout = idle_in_transaction_session_timeout.asInstanceOf[js.Any], keepalives = keepalives.asInstanceOf[js.Any], keepalives_idle = keepalives_idle.asInstanceOf[js.Any], lock_timeout = lock_timeout.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], parseInputDatesAsUTC = parseInputDatesAsUTC.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query_timeout = query_timeout.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], statement_timeout = statement_timeout.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDefaults] (val x: Self) extends AnyVal {
    
    inline def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setClient_encoding(value: String): Self = StObject.set(x, "client_encoding", value.asInstanceOf[js.Any])
    
    inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setFallback_application_name(value: String): Self = StObject.set(x, "fallback_application_name", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIdle_in_transaction_session_timeout(value: Boolean | Double): Self = StObject.set(x, "idle_in_transaction_session_timeout", value.asInstanceOf[js.Any])
    
    inline def setKeepalives(value: Double): Self = StObject.set(x, "keepalives", value.asInstanceOf[js.Any])
    
    inline def setKeepalives_idle(value: Double): Self = StObject.set(x, "keepalives_idle", value.asInstanceOf[js.Any])
    
    inline def setLock_timeout(value: Boolean | Double): Self = StObject.set(x, "lock_timeout", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setParseInputDatesAsUTC(value: Boolean): Self = StObject.set(x, "parseInputDatesAsUTC", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: DynamicPassword): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setQuery_timeout(value: Boolean | Double): Self = StObject.set(x, "query_timeout", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: Boolean | ISSLConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setStatement_timeout(value: Boolean | Double): Self = StObject.set(x, "statement_timeout", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
