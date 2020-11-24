package typings.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDefaults extends js.Object {
  
  var application_name: String = js.native
  
  // binary result mode
  var binary: Boolean = js.native
  
  // max milliseconds a client can go unused before it is removed from the pool and destroyed;
  //
  // Made unavailable in v10.5.0, due to the following:
  //  - https://github.com/brianc/node-postgres/issues/2139
  //  - https://github.com/vitaly-t/pg-promise/issues/703
  //
  // idleTimeoutMillis: number
  var client_encoding: String = js.native
  
  // connection string for overriding defaults
  var connectionString: String = js.native
  
  // name of database to connect
  var database: String = js.native
  
  var fallback_application_name: String = js.native
  
  // database host. defaults to localhost
  var host: String = js.native
  
  var keepalives: Double = js.native
  
  var keepalives_idle: Double = js.native
  
  // Connection pool options - see https://github.com/brianc/node-pg-pool
  // number of connections to use in connection pool
  // 0 will disable connection pooling
  var max: Double = js.native
  
  var parseInputDatesAsUTC: Boolean = js.native
  
  // database user's password
  var password: DynamicPassword = js.native
  
  // database port
  var port: Double = js.native
  
  // max milliseconds to wait for query to complete (client side)
  var query_timeout: Boolean | Double = js.native
  
  // number of rows to return at a time from a prepared statement's
  // portal. 0 will return all rows at once
  var rows: Double = js.native
  
  var ssl: Boolean | ISSLConfig = js.native
  
  // max milliseconds any query using this connection will execute for before timing out in error.
  // false=unlimited
  var statement_timeout: Boolean | Double = js.native
  
  // database user's name
  var user: String = js.native
}
object IDefaults {
  
  @scala.inline
  def apply(
    application_name: String,
    binary: Boolean,
    client_encoding: String,
    connectionString: String,
    database: String,
    fallback_application_name: String,
    host: String,
    keepalives: Double,
    keepalives_idle: Double,
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
    val __obj = js.Dynamic.literal(application_name = application_name.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], client_encoding = client_encoding.asInstanceOf[js.Any], connectionString = connectionString.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], fallback_application_name = fallback_application_name.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], keepalives = keepalives.asInstanceOf[js.Any], keepalives_idle = keepalives_idle.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], parseInputDatesAsUTC = parseInputDatesAsUTC.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query_timeout = query_timeout.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], statement_timeout = statement_timeout.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
  
  @scala.inline
  implicit class IDefaultsOps[Self <: IDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication_name(value: String): Self = this.set("application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_encoding(value: String): Self = this.set("client_encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_application_name(value: String): Self = this.set("fallback_application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepalives(value: Double): Self = this.set("keepalives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepalives_idle(value: Double): Self = this.set("keepalives_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseInputDatesAsUTC(value: Boolean): Self = this.set("parseInputDatesAsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordFunction0(value: () => js.Promise[String] | String): Self = this.set("password", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPassword(value: DynamicPassword): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_timeout(value: Boolean | Double): Self = this.set("query_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsl(value: Boolean | ISSLConfig): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_timeout(value: Boolean | Double): Self = this.set("statement_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
