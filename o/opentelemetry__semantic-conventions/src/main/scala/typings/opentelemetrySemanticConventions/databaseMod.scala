package typings.opentelemetrySemanticConventions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/semantic-conventions/build/src/trace/database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  
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
}
