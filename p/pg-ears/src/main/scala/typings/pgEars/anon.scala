package typings.pgEars

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.mod.CustomTypesConfig
import typings.pgEars.pgEarsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined pg.pg.ClientConfig & {  maxAttempts :number | undefined,   checkInterval :number | undefined} */
  trait ClientConfigmaxAttemptsnu extends StObject {
    
    var application_name: js.UndefOr[String] = js.undefined
    
    // Interval between connection retries, in milliseconds.
    var checkInterval: js.UndefOr[Double] = js.undefined
    
    var connectionString: js.UndefOr[String] = js.undefined
    
    var connectionTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var database: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var idle_in_transaction_session_timeout: js.UndefOr[Double] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[String] = js.undefined
    
    var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined
    
    var password: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var query_timeout: js.UndefOr[Double] = js.undefined
    
    var ssl: js.UndefOr[Boolean | ConnectionOptions] = js.undefined
    
    var statement_timeout: js.UndefOr[`false` | Double] = js.undefined
    
    var stream: js.UndefOr[Duplex] = js.undefined
    
    var types: js.UndefOr[CustomTypesConfig] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object ClientConfigmaxAttemptsnu {
    
    inline def apply(): ClientConfigmaxAttemptsnu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConfigmaxAttemptsnu]
    }
    
    extension [Self <: ClientConfigmaxAttemptsnu](x: Self) {
      
      inline def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
      
      inline def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
      
      inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
      
      inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
      
      inline def setConnectionTimeoutMillis(value: Double): Self = StObject.set(x, "connectionTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutMillisUndefined: Self = StObject.set(x, "connectionTimeoutMillis", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIdle_in_transaction_session_timeout(value: Double): Self = StObject.set(x, "idle_in_transaction_session_timeout", value.asInstanceOf[js.Any])
      
      inline def setIdle_in_transaction_session_timeoutUndefined: Self = StObject.set(x, "idle_in_transaction_session_timeout", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayMillis(value: Double): Self = StObject.set(x, "keepAliveInitialDelayMillis", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayMillisUndefined: Self = StObject.set(x, "keepAliveInitialDelayMillis", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParseInputDatesAsUTC(value: Boolean): Self = StObject.set(x, "parseInputDatesAsUTC", value.asInstanceOf[js.Any])
      
      inline def setParseInputDatesAsUTCUndefined: Self = StObject.set(x, "parseInputDatesAsUTC", js.undefined)
      
      inline def setPassword(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery_timeout(value: Double): Self = StObject.set(x, "query_timeout", value.asInstanceOf[js.Any])
      
      inline def setQuery_timeoutUndefined: Self = StObject.set(x, "query_timeout", js.undefined)
      
      inline def setSsl(value: Boolean | ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setStatement_timeout(value: `false` | Double): Self = StObject.set(x, "statement_timeout", value.asInstanceOf[js.Any])
      
      inline def setStatement_timeoutUndefined: Self = StObject.set(x, "statement_timeout", js.undefined)
      
      inline def setStream(value: Duplex): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTypes(value: CustomTypesConfig): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
