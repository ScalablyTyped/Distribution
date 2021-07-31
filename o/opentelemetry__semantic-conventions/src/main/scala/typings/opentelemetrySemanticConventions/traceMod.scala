package typings.opentelemetrySemanticConventions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  object DatabaseAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The name of the keyspace being accessed. To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_CASSANDRA_KEYSPACE")
    @js.native
    def DB_CASSANDRA_KEYSPACE: String = js.native
    @scala.inline
    def DB_CASSANDRA_KEYSPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_CASSANDRA_KEYSPACE")(x.asInstanceOf[js.Any])
    
    /**
      * The connection string used to connect to the database.
      * It is recommended to remove embedded credentials.
      *
      * @remarks
      * Optional.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_CONNECTION_STRING")
    @js.native
    def DB_CONNECTION_STRING: String = js.native
    @scala.inline
    def DB_CONNECTION_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_CONNECTION_STRING")(x.asInstanceOf[js.Any])
    
    /**
      * The [HBase namespace](https://hbase.apache.org/book.html#_namespace) being accessed.
      * To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_HBASE_NAMESPACE")
    @js.native
    def DB_HBASE_NAMESPACE: String = js.native
    @scala.inline
    def DB_HBASE_NAMESPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_HBASE_NAMESPACE")(x.asInstanceOf[js.Any])
    
    /** Deprecated. Not in spec. */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_INSTANCE")
    @js.native
    def DB_INSTANCE: String = js.native
    @scala.inline
    def DB_INSTANCE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_INSTANCE")(x.asInstanceOf[js.Any])
    
    /**
      * The fully-qualified class name of the Java Database Connectivity (JDBC) driver used to connect,
      * e.g., "org.postgresql.Driver" or "com.microsoft.sqlserver.jdbc.SQLServerDriver".
      *
      * @remarks
      * Optional.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_JDBC_DRIVER_CLASSNAME")
    @js.native
    def DB_JDBC_DRIVER_CLASSNAME: String = js.native
    @scala.inline
    def DB_JDBC_DRIVER_CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_JDBC_DRIVER_CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * The collection being accessed within the database stated in db.name.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_MONGODB_COLLECTION")
    @js.native
    def DB_MONGODB_COLLECTION: String = js.native
    @scala.inline
    def DB_MONGODB_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_MONGODB_COLLECTION")(x.asInstanceOf[js.Any])
    
    /**
      * The instance name connecting to.
      * This name is used to determine the port of a named instance.
      *
      * @remarks
      * If setting a `db.mssql.instance_name`,
      * `net.peer.port` is no longer required (but still recommended if non-standard)
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_MSSSQL_INSTANCE_NAME")
    @js.native
    def DB_MSSSQL_INSTANCE_NAME: String = js.native
    @scala.inline
    def DB_MSSSQL_INSTANCE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_MSSSQL_INSTANCE_NAME")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_NAME")
    @js.native
    def DB_NAME: String = js.native
    @scala.inline
    def DB_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_NAME")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_OPERATION")
    @js.native
    def DB_OPERATION: String = js.native
    @scala.inline
    def DB_OPERATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_OPERATION")(x.asInstanceOf[js.Any])
    
    /**
      * The index of the database being accessed as used in the [SELECT command](https://redis.io/commands/select),
      * provided as an integer. To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required if other than the default database (0).
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_REDIS_DATABASE_INDEX")
    @js.native
    def DB_REDIS_DATABASE_INDEX: String = js.native
    @scala.inline
    def DB_REDIS_DATABASE_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_REDIS_DATABASE_INDEX")(x.asInstanceOf[js.Any])
    
    /**
      * The database statement being executed.
      * Note that the value may be sanitized to exclude sensitive information.
      * E.g., for db.system="other_sql", "SELECT * FROM wuser_table";
      * for db.system="redis", "SET mykey 'WuValue'".
      *
      * @remarks
      * Required if applicable.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_STATEMENT")
    @js.native
    def DB_STATEMENT: String = js.native
    @scala.inline
    def DB_STATEMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_STATEMENT")(x.asInstanceOf[js.Any])
    
    /**
      * An identifier for the database management system (DBMS) product being used.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_SYSTEM")
    @js.native
    def DB_SYSTEM: String = js.native
    @scala.inline
    def DB_SYSTEM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_SYSTEM")(x.asInstanceOf[js.Any])
    
    /** Deprecated. Not in spec. */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_TYPE")
    @js.native
    def DB_TYPE: String = js.native
    @scala.inline
    def DB_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_TYPE")(x.asInstanceOf[js.Any])
    
    /** Deprecated. Not in spec. */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_URL")
    @js.native
    def DB_URL: String = js.native
    @scala.inline
    def DB_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_URL")(x.asInstanceOf[js.Any])
    
    /**
      * Username for accessing the database, e.g., "readonly_user" or "reporting_user".
      *
      * @remarks
      * Optional.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "DatabaseAttribute.DB_USER")
    @js.native
    def DB_USER: String = js.native
    @scala.inline
    def DB_USER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_USER")(x.asInstanceOf[js.Any])
  }
  
  object ExceptionAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "ExceptionAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "ExceptionAttribute.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    @scala.inline
    def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "ExceptionAttribute.STACKTRACE")
    @js.native
    def STACKTRACE: String = js.native
    @scala.inline
    def STACKTRACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STACKTRACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "ExceptionAttribute.TYPE")
    @js.native
    def TYPE: String = js.native
    @scala.inline
    def TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "ExceptionEventName")
  @js.native
  val ExceptionEventName: /* "exception" */ String = js.native
  
  object GeneralAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.INPROC")
    @js.native
    def INPROC: String = js.native
    @scala.inline
    def INPROC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPROC")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.IP_TCP")
    @js.native
    def IP_TCP: String = js.native
    @scala.inline
    def IP_TCP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IP_TCP")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.IP_UDP")
    @js.native
    def IP_UDP: String = js.native
    @scala.inline
    def IP_UDP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IP_UDP")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_HOST_IP")
    @js.native
    def NET_HOST_IP: String = js.native
    @scala.inline
    def NET_HOST_IP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_HOST_IP")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_HOST_NAME")
    @js.native
    def NET_HOST_NAME: String = js.native
    @scala.inline
    def NET_HOST_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_HOST_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_HOST_PORT")
    @js.native
    def NET_HOST_PORT: String = js.native
    @scala.inline
    def NET_HOST_PORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_HOST_PORT")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_ADDRESS")
    @js.native
    def NET_PEER_ADDRESS: String = js.native
    @scala.inline
    def NET_PEER_ADDRESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_ADDRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_HOSTNAME")
    @js.native
    def NET_PEER_HOSTNAME: String = js.native
    @scala.inline
    def NET_PEER_HOSTNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_HOSTNAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_IP")
    @js.native
    def NET_PEER_IP: String = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_IPV4")
    @js.native
    def NET_PEER_IPV4: String = js.native
    @scala.inline
    def NET_PEER_IPV4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_IPV4")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_IPV6")
    @js.native
    def NET_PEER_IPV6: String = js.native
    @scala.inline
    def NET_PEER_IPV6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_IPV6")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NET_PEER_IP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_IP")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_NAME")
    @js.native
    def NET_PEER_NAME: String = js.native
    @scala.inline
    def NET_PEER_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_PORT")
    @js.native
    def NET_PEER_PORT: String = js.native
    @scala.inline
    def NET_PEER_PORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_PORT")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_PEER_SERVICE")
    @js.native
    def NET_PEER_SERVICE: String = js.native
    @scala.inline
    def NET_PEER_SERVICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_PEER_SERVICE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "GeneralAttribute.NET_TRANSPORT")
    @js.native
    def NET_TRANSPORT: String = js.native
    @scala.inline
    def NET_TRANSPORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NET_TRANSPORT")(x.asInstanceOf[js.Any])
  }
  
  object HttpAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_CLIENT_IP")
    @js.native
    def HTTP_CLIENT_IP: String = js.native
    @scala.inline
    def HTTP_CLIENT_IP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_CLIENT_IP")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_ERROR_MESSAGE")
    @js.native
    def HTTP_ERROR_MESSAGE: String = js.native
    @scala.inline
    def HTTP_ERROR_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_ERROR_NAME")
    @js.native
    def HTTP_ERROR_NAME: String = js.native
    @scala.inline
    def HTTP_ERROR_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_ERROR_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_FLAVOR")
    @js.native
    def HTTP_FLAVOR: String = js.native
    @scala.inline
    def HTTP_FLAVOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_FLAVOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_HOST")
    @js.native
    def HTTP_HOST: String = js.native
    @scala.inline
    def HTTP_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_HOST")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_METHOD")
    @js.native
    def HTTP_METHOD: String = js.native
    @scala.inline
    def HTTP_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_RESPONSE_CONTENT_LENGTH")
    @js.native
    def HTTP_RESPONSE_CONTENT_LENGTH: String = js.native
    @scala.inline
    def HTTP_RESPONSE_CONTENT_LENGTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_RESPONSE_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_ROUTE")
    @js.native
    def HTTP_ROUTE: String = js.native
    @scala.inline
    def HTTP_ROUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_ROUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_SCHEME")
    @js.native
    def HTTP_SCHEME: String = js.native
    @scala.inline
    def HTTP_SCHEME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_SCHEME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_SERVER_NAME")
    @js.native
    def HTTP_SERVER_NAME: String = js.native
    @scala.inline
    def HTTP_SERVER_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_SERVER_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_STATUS_CODE")
    @js.native
    def HTTP_STATUS_CODE: String = js.native
    @scala.inline
    def HTTP_STATUS_CODE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_STATUS_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_STATUS_TEXT")
    @js.native
    def HTTP_STATUS_TEXT: String = js.native
    @scala.inline
    def HTTP_STATUS_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_STATUS_TEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_TARGET")
    @js.native
    def HTTP_TARGET: String = js.native
    @scala.inline
    def HTTP_TARGET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_TARGET")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_URL")
    @js.native
    def HTTP_URL: String = js.native
    @scala.inline
    def HTTP_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "HttpAttribute.HTTP_USER_AGENT")
    @js.native
    def HTTP_USER_AGENT: String = js.native
    @scala.inline
    def HTTP_USER_AGENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_USER_AGENT")(x.asInstanceOf[js.Any])
  }
  
  object OperatingSystem {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Human readable (not intended to be parsed) OS version information.
      * E.g., "Microsoft Windows [Version 10.0.18363.778]"
      *
      * @remarks
      * Required if applicable.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystem.DESCRIPTION")
    @js.native
    def DESCRIPTION: String = js.native
    @scala.inline
    def DESCRIPTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESCRIPTION")(x.asInstanceOf[js.Any])
    
    /**
      * The operating system type.
      * This should be set to one of {@link OperatingSystemValues}
      * E.g., "WINDOWS"
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystem.TYPE")
    @js.native
    def TYPE: String = js.native
    @scala.inline
    def TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
  }
  
  object OperatingSystemValues {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.AIX")
    @js.native
    def AIX: String = js.native
    @scala.inline
    def AIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AIX")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.DARWIN")
    @js.native
    def DARWIN: String = js.native
    @scala.inline
    def DARWIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARWIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.DRAGONFLYBSD")
    @js.native
    def DRAGONFLYBSD: String = js.native
    @scala.inline
    def DRAGONFLYBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAGONFLYBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.FREEBSD")
    @js.native
    def FREEBSD: String = js.native
    @scala.inline
    def FREEBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FREEBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.HPUX")
    @js.native
    def HPUX: String = js.native
    @scala.inline
    def HPUX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HPUX")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.LINUX")
    @js.native
    def LINUX: String = js.native
    @scala.inline
    def LINUX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.NETBSD")
    @js.native
    def NETBSD: String = js.native
    @scala.inline
    def NETBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.OPENBSD")
    @js.native
    def OPENBSD: String = js.native
    @scala.inline
    def OPENBSD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENBSD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.SOLARIS")
    @js.native
    def SOLARIS: String = js.native
    @scala.inline
    def SOLARIS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOLARIS")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.WINDOWS")
    @js.native
    def WINDOWS: String = js.native
    @scala.inline
    def WINDOWS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "OperatingSystemValues.ZOS")
    @js.native
    def ZOS: String = js.native
    @scala.inline
    def ZOS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZOS")(x.asInstanceOf[js.Any])
  }
  
  object RpcAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute.GRPC_ERROR_MESSAGE")
    @js.native
    def GRPC_ERROR_MESSAGE: String = js.native
    @scala.inline
    def GRPC_ERROR_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRPC_ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute.GRPC_ERROR_NAME")
    @js.native
    def GRPC_ERROR_NAME: String = js.native
    @scala.inline
    def GRPC_ERROR_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRPC_ERROR_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute.GRPC_KIND")
    @js.native
    def GRPC_KIND: String = js.native
    @scala.inline
    def GRPC_KIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRPC_KIND")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute.GRPC_METHOD")
    @js.native
    def GRPC_METHOD: String = js.native
    @scala.inline
    def GRPC_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRPC_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute.GRPC_STATUS_CODE")
    @js.native
    def GRPC_STATUS_CODE: String = js.native
    @scala.inline
    def GRPC_STATUS_CODE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRPC_STATUS_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace", "RpcAttribute.RPC_SERVICE")
    @js.native
    def RPC_SERVICE: String = js.native
    @scala.inline
    def RPC_SERVICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RPC_SERVICE")(x.asInstanceOf[js.Any])
  }
}
