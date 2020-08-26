package typings.pgEars.anon

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pgEars.pgEarsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pg.pg.ClientConfig & {  maxAttempts :number | undefined,   checkInterval :number | undefined} */
@js.native
trait ClientConfigmaxAttemptsnu extends js.Object {
  var application_name: js.UndefOr[String] = js.native
  // Interval between connection retries, in milliseconds.
  var checkInterval: js.UndefOr[Double] = js.native
  var connectionString: js.UndefOr[String] = js.native
  var database: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var idle_in_transaction_session_timeout: js.UndefOr[Double] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var query_timeout: js.UndefOr[Double] = js.native
  var ssl: js.UndefOr[Boolean | ConnectionOptions] = js.native
  var statement_timeout: js.UndefOr[`false` | Double] = js.native
  var stream: js.UndefOr[Duplex] = js.native
  var user: js.UndefOr[String] = js.native
}

object ClientConfigmaxAttemptsnu {
  @scala.inline
  def apply(): ClientConfigmaxAttemptsnu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfigmaxAttemptsnu]
  }
  @scala.inline
  implicit class ClientConfigmaxAttemptsnuOps[Self <: ClientConfigmaxAttemptsnu] (val x: Self) extends AnyVal {
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
    def deleteApplication_name: Self = this.set("application_name", js.undefined)
    @scala.inline
    def setCheckInterval(value: Double): Self = this.set("checkInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckInterval: Self = this.set("checkInterval", js.undefined)
    @scala.inline
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionString: Self = this.set("connectionString", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIdle_in_transaction_session_timeout(value: Double): Self = this.set("idle_in_transaction_session_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdle_in_transaction_session_timeout: Self = this.set("idle_in_transaction_session_timeout", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setKeepAliveInitialDelayMillis(value: Double): Self = this.set("keepAliveInitialDelayMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveInitialDelayMillis: Self = this.set("keepAliveInitialDelayMillis", js.undefined)
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setParseInputDatesAsUTC(value: Boolean): Self = this.set("parseInputDatesAsUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseInputDatesAsUTC: Self = this.set("parseInputDatesAsUTC", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQuery_timeout(value: Double): Self = this.set("query_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery_timeout: Self = this.set("query_timeout", js.undefined)
    @scala.inline
    def setSsl(value: Boolean | ConnectionOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setStatement_timeout(value: `false` | Double): Self = this.set("statement_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_timeout: Self = this.set("statement_timeout", js.undefined)
    @scala.inline
    def setStream(value: Duplex): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

