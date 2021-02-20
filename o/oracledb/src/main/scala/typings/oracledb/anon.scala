package typings.oracledb

import typings.node.Buffer
import typings.oracledb.mod.DBCredentials
import typings.oracledb.mod.DBObjectClass
import typings.oracledb.mod.DBObjectIN
import typings.oracledb.mod.SubscriptionTables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AssignmentMethod extends StObject {
    
    /**
      * Method used to assign keys to objects that are inserted into the collection.
      *
      * @default UUID
      */
    var assignmentMethod: js.UndefOr[String] = js.native
    
    /**
      * Maximum length of the key column in bytes. This component applies only to keys of type VARCHAR2.
      *
      * @default 255
      */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**
      * Name of the column that stores the document key.
      *
      * @default ID
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Name of the database sequence that generates keys for documents that are inserted into a collection if
      * the key assignment method is SEQUENCE.
      *
      * If you specify the key assignment method as SEQUENCE then you must also specify the name of that sequence.
      * If the specified sequence does not exist then SODA creates it.
      */
    var sequenceName: js.UndefOr[String] = js.native
    
    /**
      * SQL data type of the column that stores the document key.
      *
      * @default VARCHAR2
      */
    var sqlType: js.UndefOr[String] = js.native
  }
  object AssignmentMethod {
    
    @scala.inline
    def apply(): AssignmentMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignmentMethod]
    }
    
    @scala.inline
    implicit class AssignmentMethodMutableBuilder[Self <: AssignmentMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignmentMethod(value: String): Self = StObject.set(x, "assignmentMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentMethodUndefined: Self = StObject.set(x, "assignmentMethod", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSequenceName(value: String): Self = StObject.set(x, "sequenceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNameUndefined: Self = StObject.set(x, "sequenceName", js.undefined)
      
      @scala.inline
      def setSqlType(value: String): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlTypeUndefined: Self = StObject.set(x, "sqlType", js.undefined)
    }
  }
  
  @js.native
  trait Cache extends StObject {
    
    /**
      * SecureFiles LOB cache setting.
      *
      * @default true
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /**
      * SecureFiles LOB compression setting.
      *
      * @default NONE
      */
    var compress: js.UndefOr[String] = js.native
    
    /**
      * SecureFiles LOB encryption setting.
      *
      * Before you create a collection that uses SecureFiles LOB encryption you must set up an encryption wallet.
      *
      * @default NONE
      */
    var encrypt: js.UndefOr[String] = js.native
    
    /**
      * Maximum length of the content column in bytes. This component applies only to content of type VARCHAR2.
      *
      * @default 4000
      */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**
      * Name of the column that stores the database content.
      *
      * @default JSON_DOCUMENT
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * SQL data type of the column that stores the document content.
      *
      * @default BLOB
      */
    var sqlType: js.UndefOr[String] = js.native
    
    /**
      * Syntax to which JavaScript Object Notation (JSON) content must conform—strict or lax.
      *
      * @default STANDARD
      */
    var validation: js.UndefOr[String] = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(): Cache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCompress(value: String): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setEncrypt(value: String): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSqlType(value: String): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlTypeUndefined: Self = StObject.set(x, "sqlType", js.undefined)
      
      @scala.inline
      def setValidation(value: String): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    }
  }
  
  @js.native
  trait ConnectString extends DBCredentials {
    
    var connectString: String = js.native
    
    var externalAuth: js.UndefOr[Boolean] = js.native
    
    var password: String = js.native
    
    var user: String = js.native
  }
  object ConnectString {
    
    @scala.inline
    def apply(connectString: String, password: String, user: String): ConnectString = {
      val __obj = js.Dynamic.literal(connectString = connectString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectString]
    }
    
    @scala.inline
    implicit class ConnectStringMutableBuilder[Self <: ConnectString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectString(value: String): Self = StObject.set(x, "connectString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalAuth(value: Boolean): Self = StObject.set(x, "externalAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalAuthUndefined: Self = StObject.set(x, "externalAuth", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectionString extends DBCredentials {
    
    var connectionString: String = js.native
    
    var externalAuth: js.UndefOr[Boolean] = js.native
    
    var password: String = js.native
    
    var user: String = js.native
  }
  object ConnectionString {
    
    @scala.inline
    def apply(connectionString: String, password: String, user: String): ConnectionString = {
      val __obj = js.Dynamic.literal(connectionString = connectionString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionString]
    }
    
    @scala.inline
    implicit class ConnectionStringMutableBuilder[Self <: ConnectionString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalAuth(value: Boolean): Self = StObject.set(x, "externalAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalAuthUndefined: Self = StObject.set(x, "externalAuth", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Correlation[T] extends StObject {
    
    /** Correlation that was used during enqueue. */
    var correlation: String = js.native
    
    /** Number of seconds the message was delayed before it could be dequeued. */
    var delay: Double = js.native
    
    /** Name of the exception queue defined when the message was enqueued. */
    var exceptionQueue: String = js.native
    
    /** Number of seconds until expiration defined when the message was enqueued. */
    var expiration: Double = js.native
    
    /** Contains the payload of the message, with type depending on the value of queue.payloadType.
      * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
      */
    var payload: String | Buffer | DBObjectIN[T] = js.native
    
    /** Priority of the message when it was enqueued. */
    var priority: Double = js.native
  }
  object Correlation {
    
    @scala.inline
    def apply[T](
      correlation: String,
      delay: Double,
      exceptionQueue: String,
      expiration: Double,
      payload: String | Buffer | DBObjectIN[T],
      priority: Double
    ): Correlation[T] = {
      val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], exceptionQueue = exceptionQueue.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[Correlation[T]]
    }
    
    @scala.inline
    implicit class CorrelationMutableBuilder[Self <: Correlation[_], T] (val x: Self with Correlation[T]) extends AnyVal {
      
      @scala.inline
      def setCorrelation(value: String): Self = StObject.set(x, "correlation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionQueue(value: String): Self = StObject.set(x, "exceptionQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: String | Buffer | DBObjectIN[T]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    /**
      * Name of the index on the last-modified column.
      *
      * The value of this component is the name of a nonunique index on the last-modified time-stamp column.
      * The index is created if a name is specified. This index can improve the performance of read and write
      * operations that are driven by last-modified time stamps.
      *
      * Only SODA for REST provides such an operation (operation GET collection with time-stamp parameters since
      * and until). Other implementations do not use this component, since they do not provide any read or write
      * operations that are driven by last-modified time stamps. Even for SODA for REST, it is typically better
      * not to set this component if you are sure that your application does not use any read or write operations
      * that are driven by time stamps, because creating and maintaining an index carries a cost.
      */
    var index: js.UndefOr[String] = js.native
    
    /**
      * Name of the column that stores the last-modified time stamp of the document.
      *
      * @default LAST_MODIFIED
      */
    var name: js.UndefOr[String] = js.native
  }
  object Index {
    
    @scala.inline
    def apply(): Index = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Method extends StObject {
    
    /**
      * Method used to compute version values for objects when they are inserted into a collection or replaced.
      *
      * @default SHA256
      */
    var method: js.UndefOr[String] = js.native
    
    /**
      * Name of the column that stores the document version.
      *
      * @default VERSION
      */
    var name: js.UndefOr[String] = js.native
  }
  object Method {
    
    @scala.inline
    def apply(): Method = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    /**
      * Name of the column that stores the media type of the document. A media type column is needed if
      * the collection is to be heterogeneous, that is, it can store documents other than
      * JavaScript Object Notation (JSON).
      */
    var name: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Operation extends StObject {
    
    /** One of the CQN_OPCODE_* constants. */
    var operation: Double = js.native
    
    /** ROWID of the row that was affected. */
    var rowid: String = js.native
  }
  object Operation {
    
    @scala.inline
    def apply(operation: Double, rowid: String): Operation = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], rowid = rowid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperation(value: Double): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowid(value: String): Self = StObject.set(x, "rowid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tables extends StObject {
    
    /** Array of objects specifying the queries which were affected by the Query Change notification. */
    var tables: SubscriptionTables = js.native
  }
  object Tables {
    
    @scala.inline
    def apply(tables: SubscriptionTables): Tables = {
      val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tables]
    }
    
    @scala.inline
    implicit class TablesMutableBuilder[Self <: Tables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTables(value: SubscriptionTables): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: Double = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: Double): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeClass[T] extends StObject {
    
    /** One of the DB_TYPE constants. */
    var `type`: Double = js.native
    
    /** Set if the value of type is a DBObject. */
    var typeClass: js.UndefOr[DBObjectClass[T]] = js.native
    
    /** Type, such as 'VARCHAR2' or 'NUMBER'. */
    var typeName: String = js.native
  }
  object TypeClass {
    
    @scala.inline
    def apply[T](`type`: Double, typeName: String): TypeClass[T] = {
      val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeClass[T]]
    }
    
    @scala.inline
    implicit class TypeClassMutableBuilder[Self <: TypeClass[_], T] (val x: Self with TypeClass[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeClass(value: DBObjectClass[T]): Self = StObject.set(x, "typeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeClassUndefined: Self = StObject.set(x, "typeClass", js.undefined)
      
      @scala.inline
      def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    }
  }
}
