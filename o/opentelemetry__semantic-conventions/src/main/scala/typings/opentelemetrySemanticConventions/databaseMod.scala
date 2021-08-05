package typings.opentelemetrySemanticConventions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  object DatabaseAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The name of the keyspace being accessed. To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_CASSANDRA_KEYSPACE")
    @js.native
    def DB_CASSANDRA_KEYSPACE: String = js.native
    inline def DB_CASSANDRA_KEYSPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_CASSANDRA_KEYSPACE")(x.asInstanceOf[js.Any])
    
    /**
      * The connection string used to connect to the database.
      * It is recommended to remove embedded credentials.
      *
      * @remarks
      * Optional.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_CONNECTION_STRING")
    @js.native
    def DB_CONNECTION_STRING: String = js.native
    inline def DB_CONNECTION_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_CONNECTION_STRING")(x.asInstanceOf[js.Any])
    
    /**
      * The [HBase namespace](https://hbase.apache.org/book.html#_namespace) being accessed.
      * To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_HBASE_NAMESPACE")
    @js.native
    def DB_HBASE_NAMESPACE: String = js.native
    inline def DB_HBASE_NAMESPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_HBASE_NAMESPACE")(x.asInstanceOf[js.Any])
    
    /** Deprecated. Not in spec. */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_INSTANCE")
    @js.native
    def DB_INSTANCE: String = js.native
    inline def DB_INSTANCE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_INSTANCE")(x.asInstanceOf[js.Any])
    
    /**
      * The fully-qualified class name of the Java Database Connectivity (JDBC) driver used to connect,
      * e.g., "org.postgresql.Driver" or "com.microsoft.sqlserver.jdbc.SQLServerDriver".
      *
      * @remarks
      * Optional.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_JDBC_DRIVER_CLASSNAME")
    @js.native
    def DB_JDBC_DRIVER_CLASSNAME: String = js.native
    inline def DB_JDBC_DRIVER_CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_JDBC_DRIVER_CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * The collection being accessed within the database stated in db.name.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_MONGODB_COLLECTION")
    @js.native
    def DB_MONGODB_COLLECTION: String = js.native
    inline def DB_MONGODB_COLLECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_MONGODB_COLLECTION")(x.asInstanceOf[js.Any])
    
    /**
      * The instance name connecting to.
      * This name is used to determine the port of a named instance.
      *
      * @remarks
      * If setting a `db.mssql.instance_name`,
      * `net.peer.port` is no longer required (but still recommended if non-standard)
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_MSSSQL_INSTANCE_NAME")
    @js.native
    def DB_MSSSQL_INSTANCE_NAME: String = js.native
    inline def DB_MSSSQL_INSTANCE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_MSSSQL_INSTANCE_NAME")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_NAME")
    @js.native
    def DB_NAME: String = js.native
    inline def DB_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_NAME")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_OPERATION")
    @js.native
    def DB_OPERATION: String = js.native
    inline def DB_OPERATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_OPERATION")(x.asInstanceOf[js.Any])
    
    /**
      * The index of the database being accessed as used in the [SELECT command](https://redis.io/commands/select),
      * provided as an integer. To be used instead of the generic db.name attribute.
      *
      * @remarks
      * Required if other than the default database (0).
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_REDIS_DATABASE_INDEX")
    @js.native
    def DB_REDIS_DATABASE_INDEX: String = js.native
    inline def DB_REDIS_DATABASE_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_REDIS_DATABASE_INDEX")(x.asInstanceOf[js.Any])
    
    /**
      * The database statement being executed.
      * Note that the value may be sanitized to exclude sensitive information.
      * E.g., for db.system="other_sql", "SELECT * FROM wuser_table";
      * for db.system="redis", "SET mykey 'WuValue'".
      *
      * @remarks
      * Required if applicable.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_STATEMENT")
    @js.native
    def DB_STATEMENT: String = js.native
    inline def DB_STATEMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_STATEMENT")(x.asInstanceOf[js.Any])
    
    /**
      * An identifier for the database management system (DBMS) product being used.
      *
      * @remarks
      * Required.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_SYSTEM")
    @js.native
    def DB_SYSTEM: String = js.native
    inline def DB_SYSTEM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_SYSTEM")(x.asInstanceOf[js.Any])
    
    /** Deprecated. Not in spec. */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_TYPE")
    @js.native
    def DB_TYPE: String = js.native
    inline def DB_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_TYPE")(x.asInstanceOf[js.Any])
    
    /** Deprecated. Not in spec. */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_URL")
    @js.native
    def DB_URL: String = js.native
    inline def DB_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_URL")(x.asInstanceOf[js.Any])
    
    /**
      * Username for accessing the database, e.g., "readonly_user" or "reporting_user".
      *
      * @remarks
      * Optional.
      */
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", "DatabaseAttribute.DB_USER")
    @js.native
    def DB_USER: String = js.native
    inline def DB_USER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DB_USER")(x.asInstanceOf[js.Any])
  }
}
