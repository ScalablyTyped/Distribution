package typings.opentelemetrySemanticConventions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/semantic-conventions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ExceptionEventName: /* "exception" */ String = js.native
  
  @js.native
  object DatabaseAttribute extends js.Object {
    
    /**
      * The name of the keyspace being accessed. To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required.
      */
    var DB_CASSANDRA_KEYSPACE: String = js.native
    
    /**
      * The connection string used to connect to the database.
      * It is recommended to remove embedded credentials.
      *
      * @remarks
      * Optional.
      */
    var DB_CONNECTION_STRING: String = js.native
    
    /**
      * The [HBase namespace](https://hbase.apache.org/book.html#_namespace) being accessed.
      * To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required.
      */
    var DB_HBASE_NAMESPACE: String = js.native
    
    /** Deprecated. Not in spec. */
    var DB_INSTANCE: String = js.native
    
    /**
      * The fully-qualified class name of the Java Database Connectivity (JDBC) driver used to connect,
      * e.g., "org.postgresql.Driver" or "com.microsoft.sqlserver.jdbc.SQLServerDriver".
      *
      * @remarks
      * Optional.
      */
    var DB_JDBC_DRIVER_CLASSNAME: String = js.native
    
    /**
      * The collection being accessed within the database stated in db.name.
      *
      * @remarks
      * Required.
      */
    var DB_MONGODB_COLLECTION: String = js.native
    
    /**
      * The instance name connecting to.
      * This name is used to determine the port of a named instance.
      *
      * @remarks
      * If setting a `db.mssql.instance_name`,
      * `net.peer.port` is no longer required (but still recommended if non-standard)
      */
    var DB_MSSSQL_INSTANCE_NAME: String = js.native
    
    /**
      * If no [tech-specific attribute](https://github.com/open-telemetry/opentelemetry-specification/blob/master/specification/trace/semantic_conventions/database.md#call-level-attributes-for-specific-technologies)
      * is defined in the list below,
      * this attribute is used to report the name of the database being accessed.
      * For commands that switch the database,this should be set to the
      * target database (even if the command fails).
      *
      * @remarks
      * Required if applicable and no more specific attribute is defined.
      */
    var DB_NAME: String = js.native
    
    /**
      * The name of the operation being executed,
      * e.g. the MongoDB command name such as findAndModify.
      * While it would semantically make sense to set this,
      * e.g., to an SQL keyword like SELECT or INSERT,
      * it is not recommended to attempt any client-side parsing of
      * db.statement just to get this property (the back end can do that if required).
      *
      * @remarks
      * Required if db.statement is not applicable.
      */
    var DB_OPERATION: String = js.native
    
    /**
      * The index of the database being accessed as used in the [SELECT command](https://redis.io/commands/select),
      * provided as an integer. To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required if other than the default database (0).
      */
    var DB_REDIS_DATABASE_INDEX: String = js.native
    
    /**
      * The database statement being executed.
      * Note that the value may be sanitized to exclude sensitive information.
      * E.g., for db.system="other_sql", "SELECT * FROM wuser_table";
      * for db.system="redis", "SET mykey 'WuValue'".
      *
      * @remarks
      * Required if applicable.
      */
    var DB_STATEMENT: String = js.native
    
    /**
      * An identifier for the database management system (DBMS) product being used.
      *
      * @remarks
      * Required.
      */
    var DB_SYSTEM: String = js.native
    
    /** Deprecated. Not in spec. */
    var DB_TYPE: String = js.native
    
    /** Deprecated. Not in spec. */
    var DB_URL: String = js.native
    
    /**
      * Username for accessing the database, e.g., "readonly_user" or "reporting_user".
      *
      * @remarks
      * Optional.
      */
    var DB_USER: String = js.native
  }
  
  @js.native
  object ExceptionAttribute extends js.Object {
    
    var MESSAGE: String = js.native
    
    var STACKTRACE: String = js.native
    
    var TYPE: String = js.native
  }
  
  @js.native
  object GeneralAttribute extends js.Object {
    
    var INPROC: String = js.native
    
    var IP_TCP: String = js.native
    
    var IP_UDP: String = js.native
    
    var NET_HOST_IP: String = js.native
    
    var NET_HOST_NAME: String = js.native
    
    var NET_HOST_PORT: String = js.native
    
    var NET_PEER_ADDRESS: String = js.native
    
    var NET_PEER_HOSTNAME: String = js.native
    
    var NET_PEER_IP: String = js.native
    
    var NET_PEER_IPV4: String = js.native
    
    var NET_PEER_IPV6: String = js.native
    
    var NET_PEER_NAME: String = js.native
    
    var NET_PEER_PORT: String = js.native
    
    var NET_PEER_SERVICE: String = js.native
    
    var NET_TRANSPORT: String = js.native
  }
  
  @js.native
  object HttpAttribute extends js.Object {
    
    var HTTP_CLIENT_IP: String = js.native
    
    var HTTP_ERROR_MESSAGE: String = js.native
    
    var HTTP_ERROR_NAME: String = js.native
    
    var HTTP_FLAVOR: String = js.native
    
    var HTTP_HOST: String = js.native
    
    var HTTP_METHOD: String = js.native
    
    var HTTP_RESPONSE_CONTENT_LENGTH: String = js.native
    
    var HTTP_ROUTE: String = js.native
    
    var HTTP_SCHEME: String = js.native
    
    var HTTP_SERVER_NAME: String = js.native
    
    var HTTP_STATUS_CODE: String = js.native
    
    var HTTP_STATUS_TEXT: String = js.native
    
    var HTTP_TARGET: String = js.native
    
    var HTTP_URL: String = js.native
    
    var HTTP_USER_AGENT: String = js.native
  }
  
  @js.native
  object OperatingSystem extends js.Object {
    
    /**
      * Human readable (not intended to be parsed) OS version information.
      * E.g., "Microsoft Windows [Version 10.0.18363.778]"
      *
      * @remarks
      * Required if applicable.
      */
    var DESCRIPTION: String = js.native
    
    /**
      * The operating system type.
      * This should be set to one of {@link OperatingSystemValues}
      * E.g., "WINDOWS"
      *
      * @remarks
      * Required.
      */
    var TYPE: String = js.native
  }
  
  @js.native
  object OperatingSystemValues extends js.Object {
    
    var AIX: String = js.native
    
    var DARWIN: String = js.native
    
    var DRAGONFLYBSD: String = js.native
    
    var FREEBSD: String = js.native
    
    var HPUX: String = js.native
    
    var LINUX: String = js.native
    
    var NETBSD: String = js.native
    
    var OPENBSD: String = js.native
    
    var SOLARIS: String = js.native
    
    var WINDOWS: String = js.native
    
    var ZOS: String = js.native
  }
  
  @js.native
  object RpcAttribute extends js.Object {
    
    var GRPC_ERROR_MESSAGE: String = js.native
    
    var GRPC_ERROR_NAME: String = js.native
    
    var GRPC_KIND: String = js.native
    
    var GRPC_METHOD: String = js.native
    
    var GRPC_STATUS_CODE: String = js.native
    
    var RPC_SERVICE: String = js.native
  }
}
