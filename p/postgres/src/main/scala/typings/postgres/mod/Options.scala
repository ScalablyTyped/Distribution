package typings.postgres.mod

import typings.postgres.anon.PartialConnectionParamete
import typings.postgres.postgresStrings.`prefer-standby`
import typings.postgres.postgresStrings.`read-only`
import typings.postgres.postgresStrings.`read-write`
import typings.postgres.postgresStrings.`verify-full`
import typings.postgres.postgresStrings.allow
import typings.postgres.postgresStrings.prefer
import typings.postgres.postgresStrings.primary
import typings.postgres.postgresStrings.require
import typings.postgres.postgresStrings.standby
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<postgres.postgres.BaseOptions<T>> */
trait Options[T /* <: Record[String, PostgresType[Any]] */] extends StObject {
  
  var backoff: js.UndefOr[Boolean | (js.Function1[/* attemptNum */ Double, Double])] = js.undefined
  
  var connect_timeout: js.UndefOr[Double] = js.undefined
  
  var connection: js.UndefOr[PartialConnectionParamete] = js.undefined
  
  var database: js.UndefOr[String] = js.undefined
  
  /** Name of database to connect to (an alias for `database`) */
  var db: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[
    Boolean | (js.Function4[
      /* connection */ Double, 
      /* query */ String, 
      /* parameters */ js.Array[Any], 
      /* paramTypes */ js.Array[Any], 
      Unit
    ])
  ] = js.undefined
  
  var fetch_types: js.UndefOr[Boolean] = js.undefined
  
  /** @inheritdoc */
  var host: js.UndefOr[String] = js.undefined
  
  /** Postgres ip address or domain name (an alias for `host`) */
  var hostname: js.UndefOr[String] = js.undefined
  
  var idle_timeout: js.UndefOr[Double] = js.undefined
  
  var keep_alive: js.UndefOr[Double | Null] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var max_lifetime: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Disable prepared mode
    * @deprecated use "prepare" option instead
    */
  var no_prepare: js.UndefOr[Boolean] = js.undefined
  
  var onclose: js.UndefOr[js.Function1[/* connId */ Double, Unit]] = js.undefined
  
  var onnotice: js.UndefOr[js.Function1[/* notice */ Notice, Unit]] = js.undefined
  
  var onparameter: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]] = js.undefined
  
  /** Password of database user (an alias for `password`) */
  var pass: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
  
  /**
    * Password of database user
    * @default process.env['PGPASSWORD']
    */
  var password: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
  
  /** @inheritdoc */
  var path: js.UndefOr[String] = js.undefined
  
  /** @inheritdoc */
  var port: js.UndefOr[Double] = js.undefined
  
  var prepare: js.UndefOr[Boolean] = js.undefined
  
  var publications: js.UndefOr[String] = js.undefined
  
  var ssl: js.UndefOr[require | allow | prefer | `verify-full` | Boolean | js.Object] = js.undefined
  
  var target_session_attrs: js.UndefOr[`read-write` | `read-only` | primary | standby | `prefer-standby`] = js.undefined
  
  /**
    * Idle connection timeout in seconds
    * @deprecated use "idle_timeout" option instead
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  var transform: js.UndefOr[typings.postgres.anon.Column] = js.undefined
  
  var types: js.UndefOr[T] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  /** Username of database user (an alias for `user`) */
  var username: js.UndefOr[String] = js.undefined
}
object Options {
  
  inline def apply[T /* <: Record[String, PostgresType[Any]] */](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options[?], T /* <: Record[String, PostgresType[Any]] */] (val x: Self & Options[T]) extends AnyVal {
    
    inline def setBackoff(value: Boolean | (js.Function1[/* attemptNum */ Double, Double])): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
    
    inline def setBackoffFunction1(value: /* attemptNum */ Double => Double): Self = StObject.set(x, "backoff", js.Any.fromFunction1(value))
    
    inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
    
    inline def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
    
    inline def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
    
    inline def setConnection(value: PartialConnectionParamete): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    inline def setDebug(
      value: Boolean | (js.Function4[
          /* connection */ Double, 
          /* query */ String, 
          /* parameters */ js.Array[Any], 
          /* paramTypes */ js.Array[Any], 
          Unit
        ])
    ): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugFunction4(
      value: (/* connection */ Double, /* query */ String, /* parameters */ js.Array[Any], /* paramTypes */ js.Array[Any]) => Unit
    ): Self = StObject.set(x, "debug", js.Any.fromFunction4(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setFetch_types(value: Boolean): Self = StObject.set(x, "fetch_types", value.asInstanceOf[js.Any])
    
    inline def setFetch_typesUndefined: Self = StObject.set(x, "fetch_types", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIdle_timeout(value: Double): Self = StObject.set(x, "idle_timeout", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeoutUndefined: Self = StObject.set(x, "idle_timeout", js.undefined)
    
    inline def setKeep_alive(value: Double): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveNull: Self = StObject.set(x, "keep_alive", null)
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMax_lifetime(value: Double): Self = StObject.set(x, "max_lifetime", value.asInstanceOf[js.Any])
    
    inline def setMax_lifetimeNull: Self = StObject.set(x, "max_lifetime", null)
    
    inline def setMax_lifetimeUndefined: Self = StObject.set(x, "max_lifetime", js.undefined)
    
    inline def setNo_prepare(value: Boolean): Self = StObject.set(x, "no_prepare", value.asInstanceOf[js.Any])
    
    inline def setNo_prepareUndefined: Self = StObject.set(x, "no_prepare", js.undefined)
    
    inline def setOnclose(value: /* connId */ Double => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setOnnotice(value: /* notice */ Notice => Unit): Self = StObject.set(x, "onnotice", js.Any.fromFunction1(value))
    
    inline def setOnnoticeUndefined: Self = StObject.set(x, "onnotice", js.undefined)
    
    inline def setOnparameter(value: (/* key */ String, /* value */ Any) => Unit): Self = StObject.set(x, "onparameter", js.Any.fromFunction2(value))
    
    inline def setOnparameterUndefined: Self = StObject.set(x, "onparameter", js.undefined)
    
    inline def setPass(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "pass", js.Any.fromFunction0(value))
    
    inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    inline def setPassword(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPrepare(value: Boolean): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setPublications(value: String): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    inline def setPublicationsUndefined: Self = StObject.set(x, "publications", js.undefined)
    
    inline def setSsl(value: require | allow | prefer | `verify-full` | Boolean | js.Object): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setTarget_session_attrs(value: `read-write` | `read-only` | primary | standby | `prefer-standby`): Self = StObject.set(x, "target_session_attrs", value.asInstanceOf[js.Any])
    
    inline def setTarget_session_attrsUndefined: Self = StObject.set(x, "target_session_attrs", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform(value: typings.postgres.anon.Column): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTypes(value: T): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
