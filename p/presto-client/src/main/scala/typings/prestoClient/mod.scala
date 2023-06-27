package typings.prestoClient

import typings.prestoClient.anon.Ca
import typings.prestoClient.anon.Parse
import typings.prestoClient.anon.Password
import typings.prestoClient.prestoClientStrings.CANCELED
import typings.prestoClient.prestoClientStrings.FAILED
import typings.prestoClient.prestoClientStrings.FINISHED
import typings.prestoClient.prestoClientStrings.PLANNING
import typings.prestoClient.prestoClientStrings.QUEUED
import typings.prestoClient.prestoClientStrings.RUNNING
import typings.prestoClient.prestoClientStrings.STARTING
import typings.prestoClient.prestoClientStrings.`interval day to second`
import typings.prestoClient.prestoClientStrings.`interval year to month`
import typings.prestoClient.prestoClientStrings.`time with time zone`
import typings.prestoClient.prestoClientStrings.`timestamp with time zone`
import typings.prestoClient.prestoClientStrings.array
import typings.prestoClient.prestoClientStrings.bigint
import typings.prestoClient.prestoClientStrings.boolean
import typings.prestoClient.prestoClientStrings.char
import typings.prestoClient.prestoClientStrings.date
import typings.prestoClient.prestoClientStrings.decimal
import typings.prestoClient.prestoClientStrings.double
import typings.prestoClient.prestoClientStrings.hyperloglog
import typings.prestoClient.prestoClientStrings.integer
import typings.prestoClient.prestoClientStrings.ipaddress
import typings.prestoClient.prestoClientStrings.ipprefix
import typings.prestoClient.prestoClientStrings.json
import typings.prestoClient.prestoClientStrings.khyperloglog
import typings.prestoClient.prestoClientStrings.map
import typings.prestoClient.prestoClientStrings.p4hyperloglog
import typings.prestoClient.prestoClientStrings.qdigest
import typings.prestoClient.prestoClientStrings.real
import typings.prestoClient.prestoClientStrings.row
import typings.prestoClient.prestoClientStrings.smallint
import typings.prestoClient.prestoClientStrings.tdigest
import typings.prestoClient.prestoClientStrings.time
import typings.prestoClient.prestoClientStrings.timestamp
import typings.prestoClient.prestoClientStrings.tinyint
import typings.prestoClient.prestoClientStrings.uuid
import typings.prestoClient.prestoClientStrings.varbinary
import typings.prestoClient.prestoClientStrings.varchar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("presto-client", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(options: ClientOptions) = this()
    
    /**
      * This is an API to execute queries. (Using "/v1/statement" HTTP RPC.).
      * Execute query on Presto cluster, and fetch results.
      */
    def execute(options: QueryOptions): Unit = js.native
    
    /**
      * Stop query immediately.
      */
    def kill(query_id: String, callback: js.Function1[/* error */ PrestoRequestError | Null, Unit]): Unit = js.native
    
    def nodes(callback: js.Function2[/* error */ PrestoRequestError | Null, /* data */ js.Array[Any], Unit]): Unit = js.native
    /**
      * Get node list of presto cluster and return it.
      */
    def nodes(
      opts: Null,
      callback: js.Function2[/* error */ PrestoRequestError | Null, /* data */ js.Array[Any], Unit]
    ): Unit = js.native
    def nodes(
      opts: Record[String, scala.Nothing],
      callback: js.Function2[/* error */ PrestoRequestError | Null, /* data */ js.Array[Any], Unit]
    ): Unit = js.native
    
    /**
      * Get query current status.
      */
    def query(
      query_id: String,
      callback: js.Function2[/* error */ PrestoRequestError | Null, /* data */ Any, Unit]
    ): Unit = js.native
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * Pass in a user and password to enable Authorization Basic headers on all
      * requests
      */
    var basic_auth: js.UndefOr[Password] = js.undefined
    
    /**
      * Default catalog name
      */
    var catalog: js.UndefOr[String] = js.undefined
    
    /**
      * Interval milliseconds of each RPC to check query status
      * @default 800
      */
    var checkInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets HTTP `Authorization` header with the provided string.
      */
    var custom_auth: js.UndefOr[String] = js.undefined
    
    /**
      * Enable more verbose callback for Presto query states. When set to true,
      * this flag modifies the condition of the state change callback to return
      * data every checkInterval(default: 800ms). Modify checkInterval if you
      * wish to change the frequency. The purpose of this variable is to enable
      * verbose update capability in state callbacks. This is such that
      * "percentage complete" and "processed rows" may be extracted despite the
      * state still remaining in a particular state eg. "RUNNING".
      * @default false
      */
    var enableVerboseStateCallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change headers set. Added for compatibility with Trino. Available
      * options: presto, trino.
      * @default "presto"
      */
    var engine: js.UndefOr[String] = js.undefined
    
    /**
      * Presto coordinator hostname or address
      * @default "localhost"
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Custom json parser if required
      */
    var jsonParser: js.UndefOr[Parse] = js.undefined
    
    /**
      * Presto coordinator port
      * @default 8080
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Default schema name
      */
    var schema: js.UndefOr[String] = js.undefined
    
    /**
      * Source of query
      * @default "nodejs-client"
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * Setting a Hash object enables SSL and verify server certificate with options
      */
    var ssl: js.UndefOr[Ca] = js.undefined
    
    /**
      * Username of query
      * @default process.env.USER
      */
    var user: js.UndefOr[String] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setBasic_auth(value: Password): Self = StObject.set(x, "basic_auth", value.asInstanceOf[js.Any])
      
      inline def setBasic_authUndefined: Self = StObject.set(x, "basic_auth", js.undefined)
      
      inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
      
      inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
      
      inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      inline def setCustom_auth(value: String): Self = StObject.set(x, "custom_auth", value.asInstanceOf[js.Any])
      
      inline def setCustom_authUndefined: Self = StObject.set(x, "custom_auth", js.undefined)
      
      inline def setEnableVerboseStateCallback(value: Boolean): Self = StObject.set(x, "enableVerboseStateCallback", value.asInstanceOf[js.Any])
      
      inline def setEnableVerboseStateCallbackUndefined: Self = StObject.set(x, "enableVerboseStateCallback", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setJsonParser(value: Parse): Self = StObject.set(x, "jsonParser", value.asInstanceOf[js.Any])
      
      inline def setJsonParserUndefined: Self = StObject.set(x, "jsonParser", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSsl(value: Ca): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    var name: String
    
    var `type`: boolean | tinyint | smallint | integer | bigint | real | double | decimal | varchar | char | varbinary | json | date | time | (`time with time zone`) | timestamp | (`timestamp with time zone`) | (`interval year to month`) | (`interval day to second`) | array | map | row | ipaddress | uuid | ipprefix | hyperloglog | p4hyperloglog | khyperloglog | qdigest | tdigest | String
  }
  object Column {
    
    inline def apply(
      name: String,
      `type`: boolean | tinyint | smallint | integer | bigint | real | double | decimal | varchar | char | varbinary | json | date | time | (`time with time zone`) | timestamp | (`timestamp with time zone`) | (`interval year to month`) | (`interval day to second`) | array | map | row | ipaddress | uuid | ipprefix | hyperloglog | p4hyperloglog | khyperloglog | qdigest | tdigest | String
    ): Column = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: boolean | tinyint | smallint | integer | bigint | real | double | decimal | varchar | char | varbinary | json | date | time | (`time with time zone`) | timestamp | (`timestamp with time zone`) | (`interval year to month`) | (`interval day to second`) | array | map | row | ipaddress | uuid | ipprefix | hyperloglog | p4hyperloglog | khyperloglog | qdigest | tdigest | String
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorLocation extends StObject {
    
    var columnNumber: Double
    
    var lineNumber: Double
  }
  object ErrorLocation {
    
    inline def apply(columnNumber: Double, lineNumber: Double): ErrorLocation = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorLocation] (val x: Self) extends AnyVal {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailureInfo extends StObject {
    
    var cause: js.UndefOr[FailureInfo] = js.undefined
    
    var errorLocation: js.UndefOr[ErrorLocation] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var stack: js.Array[String]
    
    var suppressed: js.Array[FailureInfo]
    
    var `type`: String
  }
  object FailureInfo {
    
    inline def apply(stack: js.Array[String], suppressed: js.Array[FailureInfo], `type`: String): FailureInfo = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any], suppressed = suppressed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailureInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FailureInfo] (val x: Self) extends AnyVal {
      
      inline def setCause(value: FailureInfo): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setErrorLocation(value: ErrorLocation): Self = StObject.set(x, "errorLocation", value.asInstanceOf[js.Any])
      
      inline def setErrorLocationUndefined: Self = StObject.set(x, "errorLocation", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setSuppressed(value: js.Array[FailureInfo]): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
      
      inline def setSuppressedVarargs(value: FailureInfo*): Self = StObject.set(x, "suppressed", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prestoClient.mod.PrestoRequestError
    - typings.prestoClient.mod.PrestoQueryError
  */
  trait PrestoError extends StObject
  object PrestoError {
    
    inline def PrestoQueryError(message: String): typings.prestoClient.mod.PrestoQueryError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prestoClient.mod.PrestoQueryError]
    }
    
    inline def PrestoRequestError(message: String): typings.prestoClient.mod.PrestoRequestError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prestoClient.mod.PrestoRequestError]
    }
  }
  
  trait PrestoQueryError
    extends StObject
       with PrestoError {
    
    // This property is meant to be named `retriable`, but is serialized incorrectly as `boolean`
    // see https://github.com/prestodb/presto/pull/19741
    var boolean: js.UndefOr[Boolean] = js.undefined
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var errorLocation: js.UndefOr[ErrorLocation] = js.undefined
    
    var errorName: js.UndefOr[String] = js.undefined
    
    var errorType: js.UndefOr[String] = js.undefined
    
    var failureInfo: js.UndefOr[FailureInfo] = js.undefined
    
    var message: String
    
    var sqlState: js.UndefOr[String] = js.undefined
  }
  object PrestoQueryError {
    
    inline def apply(message: String): PrestoQueryError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrestoQueryError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrestoQueryError] (val x: Self) extends AnyVal {
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorLocation(value: ErrorLocation): Self = StObject.set(x, "errorLocation", value.asInstanceOf[js.Any])
      
      inline def setErrorLocationUndefined: Self = StObject.set(x, "errorLocation", js.undefined)
      
      inline def setErrorName(value: String): Self = StObject.set(x, "errorName", value.asInstanceOf[js.Any])
      
      inline def setErrorNameUndefined: Self = StObject.set(x, "errorName", js.undefined)
      
      inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      inline def setFailureInfo(value: FailureInfo): Self = StObject.set(x, "failureInfo", value.asInstanceOf[js.Any])
      
      inline def setFailureInfoUndefined: Self = StObject.set(x, "failureInfo", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSqlState(value: String): Self = StObject.set(x, "sqlState", value.asInstanceOf[js.Any])
      
      inline def setSqlStateUndefined: Self = StObject.set(x, "sqlState", js.undefined)
    }
  }
  
  trait PrestoRequestError
    extends StObject
       with PrestoError {
    
    var code: js.UndefOr[Double] = js.undefined
    
    // https://github.com/tagomoris/presto-client-node/blob/42a7ca05220a8b6476c68dbecb1a510ed1be5139/lib/presto-client/index.js#L268
    var data: js.UndefOr[Any] = js.undefined
    
    // This will be set in the case of recasting an error
    var error: js.UndefOr[PrestoQueryError] = js.undefined
    
    var message: String
  }
  object PrestoRequestError {
    
    inline def apply(message: String): PrestoRequestError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrestoRequestError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrestoRequestError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: PrestoQueryError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryOptions extends StObject {
    
    /**
      * Callback for query completion (both of success and fail). One of
      * `callback` or `success` must be specified.
      */
    var callback: js.UndefOr[js.Function2[/* error */ PrestoError | Null, /* stats */ RuntimeStats, Unit]] = js.undefined
    
    /**
      * Client stops fetch of query results if this callback returns `true`
      */
    var cancel: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var catalog: js.UndefOr[String] = js.undefined
    
    /**
      * Called once when columns and its types are found in results
      */
    var columns: js.UndefOr[js.Function2[/* error */ Null, /* data */ js.Array[Column], Unit]] = js.undefined
    
    /**
      * Called per fetch of query results (may be called 2 or more)
      */
    var data: js.UndefOr[
        js.Function4[
          /* error */ Null, 
          /* data */ js.Array[js.Array[Any]], 
          /* columns */ js.Array[Column], 
          /* stats */ RuntimeStats, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback for errors of query execution
      */
    var error: js.UndefOr[js.Function1[/* error */ PrestoError, Unit]] = js.undefined
    
    /**
      * Aditional headers to be included in the request
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Fetch query info (execution statistics) for success callback, or not
      * @default false
      */
    var info: js.UndefOr[Boolean] = js.undefined
    
    var prepares: js.UndefOr[js.Array[String]] = js.undefined
    
    var query: String
    
    var schema: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * Called when query stats changed
      */
    var state: js.UndefOr[
        js.Function3[/* error */ Null, /* query_id */ String, /* stats */ RuntimeStats, Unit]
      ] = js.undefined
    
    /**
      * Called once when all results are fetched
      */
    var success: js.UndefOr[js.Function3[/* error */ Null, /* stats */ RuntimeStats, /* info */ Any, Unit]] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(query: String): QueryOptions = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (/* error */ PrestoError | Null, /* stats */ RuntimeStats) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCancel(value: () => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
      
      inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
      
      inline def setColumns(value: (/* error */ Null, /* data */ js.Array[Column]) => Unit): Self = StObject.set(x, "columns", js.Any.fromFunction2(value))
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setData(
        value: (/* error */ Null, /* data */ js.Array[js.Array[Any]], /* columns */ js.Array[Column], /* stats */ RuntimeStats) => Unit
      ): Self = StObject.set(x, "data", js.Any.fromFunction4(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: /* error */ PrestoError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setPrepares(value: js.Array[String]): Self = StObject.set(x, "prepares", value.asInstanceOf[js.Any])
      
      inline def setPreparesUndefined: Self = StObject.set(x, "prepares", js.undefined)
      
      inline def setPreparesVarargs(value: String*): Self = StObject.set(x, "prepares", js.Array(value*))
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setState(value: (/* error */ Null, /* query_id */ String, /* stats */ RuntimeStats) => Unit): Self = StObject.set(x, "state", js.Any.fromFunction3(value))
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSuccess(value: (/* error */ Null, /* stats */ RuntimeStats, /* info */ Any) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait RuntimeStats extends StObject {
    
    var completedSplits: Double
    
    var cpuTimeMillis: Double
    
    var nodes: Double
    
    var processedBytes: Double
    
    var processedRows: Double
    
    var queuedSplits: Double
    
    var runningSplits: Double
    
    var scheduled: Boolean
    
    var state: QUEUED | PLANNING | STARTING | RUNNING | FINISHED | CANCELED | FAILED
    
    var totalSplits: Double
    
    var userTimeMillis: Double
    
    var wallTimeMillis: Double
  }
  object RuntimeStats {
    
    inline def apply(
      completedSplits: Double,
      cpuTimeMillis: Double,
      nodes: Double,
      processedBytes: Double,
      processedRows: Double,
      queuedSplits: Double,
      runningSplits: Double,
      scheduled: Boolean,
      state: QUEUED | PLANNING | STARTING | RUNNING | FINISHED | CANCELED | FAILED,
      totalSplits: Double,
      userTimeMillis: Double,
      wallTimeMillis: Double
    ): RuntimeStats = {
      val __obj = js.Dynamic.literal(completedSplits = completedSplits.asInstanceOf[js.Any], cpuTimeMillis = cpuTimeMillis.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], processedBytes = processedBytes.asInstanceOf[js.Any], processedRows = processedRows.asInstanceOf[js.Any], queuedSplits = queuedSplits.asInstanceOf[js.Any], runningSplits = runningSplits.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalSplits = totalSplits.asInstanceOf[js.Any], userTimeMillis = userTimeMillis.asInstanceOf[js.Any], wallTimeMillis = wallTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeStats] (val x: Self) extends AnyVal {
      
      inline def setCompletedSplits(value: Double): Self = StObject.set(x, "completedSplits", value.asInstanceOf[js.Any])
      
      inline def setCpuTimeMillis(value: Double): Self = StObject.set(x, "cpuTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setProcessedBytes(value: Double): Self = StObject.set(x, "processedBytes", value.asInstanceOf[js.Any])
      
      inline def setProcessedRows(value: Double): Self = StObject.set(x, "processedRows", value.asInstanceOf[js.Any])
      
      inline def setQueuedSplits(value: Double): Self = StObject.set(x, "queuedSplits", value.asInstanceOf[js.Any])
      
      inline def setRunningSplits(value: Double): Self = StObject.set(x, "runningSplits", value.asInstanceOf[js.Any])
      
      inline def setScheduled(value: Boolean): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      inline def setState(value: QUEUED | PLANNING | STARTING | RUNNING | FINISHED | CANCELED | FAILED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTotalSplits(value: Double): Self = StObject.set(x, "totalSplits", value.asInstanceOf[js.Any])
      
      inline def setUserTimeMillis(value: Double): Self = StObject.set(x, "userTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setWallTimeMillis(value: Double): Self = StObject.set(x, "wallTimeMillis", value.asInstanceOf[js.Any])
    }
  }
}
