package typings.pgEars

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pgEars.pgEarsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined pg.pg.ClientConfig & {  maxAttempts :number | undefined,   checkInterval :number | undefined} */
  @js.native
  trait ClientConfigmaxAttemptsnu extends StObject {
    
    var application_name: js.UndefOr[String] = js.native
    
    // Interval between connection retries, in milliseconds.
    var checkInterval: js.UndefOr[Double] = js.native
    
    var connectionString: js.UndefOr[String] = js.native
    
    var connectionTimeoutMillis: js.UndefOr[Double] = js.native
    
    var database: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var idle_in_transaction_session_timeout: js.UndefOr[Double] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.native
    
    var maxAttempts: js.UndefOr[Double] = js.native
    
    var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.native
    
    var password: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
    
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
    implicit class ClientConfigmaxAttemptsnuMutableBuilder[Self <: ClientConfigmaxAttemptsnu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
      
      @scala.inline
      def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
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
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIdle_in_transaction_session_timeout(value: Double): Self = StObject.set(x, "idle_in_transaction_session_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdle_in_transaction_session_timeoutUndefined: Self = StObject.set(x, "idle_in_transaction_session_timeout", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelayMillis(value: Double): Self = StObject.set(x, "keepAliveInitialDelayMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelayMillisUndefined: Self = StObject.set(x, "keepAliveInitialDelayMillis", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setParseInputDatesAsUTC(value: Boolean): Self = StObject.set(x, "parseInputDatesAsUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseInputDatesAsUTCUndefined: Self = StObject.set(x, "parseInputDatesAsUTC", js.undefined)
      
      @scala.inline
      def setPassword(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQuery_timeout(value: Double): Self = StObject.set(x, "query_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery_timeoutUndefined: Self = StObject.set(x, "query_timeout", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean | ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setStatement_timeout(value: `false` | Double): Self = StObject.set(x, "statement_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_timeoutUndefined: Self = StObject.set(x, "statement_timeout", js.undefined)
      
      @scala.inline
      def setStream(value: Duplex): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
