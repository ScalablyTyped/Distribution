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

/**
  * Connection options of Postgres.
  */
trait BaseOptions[T /* <: Record[String, PostgresType[Any]] */] extends StObject {
  
  var backoff: Boolean | (js.Function1[/* attemptNum */ Double, Double])
  
  /**
    * Connect timeout in seconds
    * @default process.env['PGCONNECT_TIMEOUT']
    */
  var connect_timeout: Double
  
  /** Connection parameters */
  var connection: PartialConnectionParamete
  
  /**
    * Name of database to connect to
    * @default process.env['PGDATABASE'] || options.user
    */
  var database: String
  
  /** Is called with (connection; query; parameters) */
  var debug: Boolean | (js.Function4[
    /* connection */ Double, 
    /* query */ String, 
    /* parameters */ js.Array[Any], 
    /* paramTypes */ js.Array[Any], 
    Unit
  ])
  
  /**
    * Automatically fetches types on connect
    * @default true
    */
  var fetch_types: Boolean
  
  /** Postgres ip address[s] or domain name[s] */
  var host: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Idle connection timeout in seconds
    * @default process.env['PGIDLE_TIMEOUT']
    */
  var idle_timeout: js.UndefOr[Double] = js.undefined
  
  var keep_alive: Double | Null
  
  /**
    * Max number of connections
    * @default 10
    */
  var max: Double
  
  var max_lifetime: Double | Null
  
  def onclose(connId: Double): Unit
  
  /**
    * Called when a notice is received
    * @default console.log
    */
  def onnotice(notice: Notice): Unit
  
  /** (key; value) when a server param change */
  def onparameter(key: String, value: Any): Unit
  
  /** unix socket path (usually '/tmp') */
  var path: js.UndefOr[String] = js.undefined
  
  /** Postgres server[s] port[s] */
  var port: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Enables prepare mode.
    * @default true
    */
  var prepare: Boolean
  
  /**
    * Publications to subscribe to (only relevant when calling `sql.subscribe()`)
    * @default 'alltables'
    */
  var publications: String
  
  /**
    * How to deal with ssl (can be a tls.connect option object)
    * @default false
    */
  var ssl: require | allow | prefer | `verify-full` | Boolean | js.Object
  
  /**
    * Use 'read-write' with multiple hosts to ensure only connecting to primary
    * @default process.env['PGTARGETSESSIONATTRS']
    */
  var target_session_attrs: js.UndefOr[`read-write` | `read-only` | primary | standby | `prefer-standby`] = js.undefined
  
  /** Transform hooks */
  var transform: typings.postgres.anon.Column
  
  /** Array of custom types; see more in the README */
  var types: T
  
  /**
    * Username of database user
    * @default process.env['PGUSERNAME'] || process.env['PGUSER'] || require('os').userInfo().username
    */
  var user: String
}
object BaseOptions {
  
  inline def apply[T /* <: Record[String, PostgresType[Any]] */](
    backoff: Boolean | (js.Function1[/* attemptNum */ Double, Double]),
    connect_timeout: Double,
    connection: PartialConnectionParamete,
    database: String,
    debug: Boolean | (js.Function4[
      /* connection */ Double, 
      /* query */ String, 
      /* parameters */ js.Array[Any], 
      /* paramTypes */ js.Array[Any], 
      Unit
    ]),
    fetch_types: Boolean,
    max: Double,
    onclose: Double => Unit,
    onnotice: Notice => Unit,
    onparameter: (String, Any) => Unit,
    prepare: Boolean,
    publications: String,
    ssl: require | allow | prefer | `verify-full` | Boolean | js.Object,
    transform: typings.postgres.anon.Column,
    types: T,
    user: String
  ): BaseOptions[T] = {
    val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], connect_timeout = connect_timeout.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], fetch_types = fetch_types.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], onclose = js.Any.fromFunction1(onclose), onnotice = js.Any.fromFunction1(onnotice), onparameter = js.Any.fromFunction2(onparameter), prepare = prepare.asInstanceOf[js.Any], publications = publications.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], keep_alive = null, max_lifetime = null)
    __obj.asInstanceOf[BaseOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseOptions[?], T /* <: Record[String, PostgresType[Any]] */] (val x: Self & BaseOptions[T]) extends AnyVal {
    
    inline def setBackoff(value: Boolean | (js.Function1[/* attemptNum */ Double, Double])): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
    
    inline def setBackoffFunction1(value: /* attemptNum */ Double => Double): Self = StObject.set(x, "backoff", js.Any.fromFunction1(value))
    
    inline def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: PartialConnectionParamete): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
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
    
    inline def setFetch_types(value: Boolean): Self = StObject.set(x, "fetch_types", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String | js.Array[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostVarargs(value: String*): Self = StObject.set(x, "host", js.Array(value*))
    
    inline def setIdle_timeout(value: Double): Self = StObject.set(x, "idle_timeout", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeoutUndefined: Self = StObject.set(x, "idle_timeout", js.undefined)
    
    inline def setKeep_alive(value: Double): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveNull: Self = StObject.set(x, "keep_alive", null)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMax_lifetime(value: Double): Self = StObject.set(x, "max_lifetime", value.asInstanceOf[js.Any])
    
    inline def setMax_lifetimeNull: Self = StObject.set(x, "max_lifetime", null)
    
    inline def setOnclose(value: Double => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    inline def setOnnotice(value: Notice => Unit): Self = StObject.set(x, "onnotice", js.Any.fromFunction1(value))
    
    inline def setOnparameter(value: (String, Any) => Unit): Self = StObject.set(x, "onparameter", js.Any.fromFunction2(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double | js.Array[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPortVarargs(value: Double*): Self = StObject.set(x, "port", js.Array(value*))
    
    inline def setPrepare(value: Boolean): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
    
    inline def setPublications(value: String): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: require | allow | prefer | `verify-full` | Boolean | js.Object): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setTarget_session_attrs(value: `read-write` | `read-only` | primary | standby | `prefer-standby`): Self = StObject.set(x, "target_session_attrs", value.asInstanceOf[js.Any])
    
    inline def setTarget_session_attrsUndefined: Self = StObject.set(x, "target_session_attrs", js.undefined)
    
    inline def setTransform(value: typings.postgres.anon.Column): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: T): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
