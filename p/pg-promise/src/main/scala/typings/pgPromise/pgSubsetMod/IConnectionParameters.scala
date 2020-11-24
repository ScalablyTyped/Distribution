package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// See:
// 1) https://github.com/brianc/node-postgres/blob/master/packages/pg/lib/defaults.js
// 2) https://github.com/brianc/node-pg-pool
@js.native
trait IConnectionParameters[C /* <: IClient */] extends js.Object {
  
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
  implicit class IConnectionParametersOps[Self <: IConnectionParameters[_], C /* <: IClient */] (val x: Self with IConnectionParameters[C]) extends AnyVal {
    
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
    def setClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], C]): Self = this.set("Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("Client", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Any): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setApplication_name(value: String): Self = this.set("application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication_name: Self = this.set("application_name", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setClient_encoding(value: String): Self = this.set("client_encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_encoding: Self = this.set("client_encoding", js.undefined)
    
    @scala.inline
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionString: Self = this.set("connectionString", js.undefined)
    
    @scala.inline
    def setConnectionTimeoutMillis(value: Double): Self = this.set("connectionTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeoutMillis: Self = this.set("connectionTimeoutMillis", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFallback_application_name(value: String): Self = this.set("fallback_application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback_application_name: Self = this.set("fallback_application_name", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = this.set("idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeoutMillis: Self = this.set("idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setIsDomainSocket(value: Boolean): Self = this.set("isDomainSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDomainSocket: Self = this.set("isDomainSocket", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveInitialDelayMillis(value: Double): Self = this.set("keepAliveInitialDelayMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveInitialDelayMillis: Self = this.set("keepAliveInitialDelayMillis", js.undefined)
    
    @scala.inline
    def setKeepalives(value: Double): Self = this.set("keepalives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalives: Self = this.set("keepalives", js.undefined)
    
    @scala.inline
    def setKeepalives_idle(value: Double): Self = this.set("keepalives_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalives_idle: Self = this.set("keepalives_idle", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxUses(value: Double): Self = this.set("maxUses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUses: Self = this.set("maxUses", js.undefined)
    
    @scala.inline
    def setParseInputDatesAsUTC(value: Boolean): Self = this.set("parseInputDatesAsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseInputDatesAsUTC: Self = this.set("parseInputDatesAsUTC", js.undefined)
    
    @scala.inline
    def setPasswordFunction0(value: () => js.Promise[String] | String): Self = this.set("password", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPassword(value: DynamicPassword): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setQuery_timeout(value: Boolean | Double): Self = this.set("query_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_timeout: Self = this.set("query_timeout", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean | ISSLConfig): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setStatement_timeout(value: Boolean | Double): Self = this.set("statement_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement_timeout: Self = this.set("statement_timeout", js.undefined)
    
    @scala.inline
    def setTypes(value: ITypeOverrides): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
