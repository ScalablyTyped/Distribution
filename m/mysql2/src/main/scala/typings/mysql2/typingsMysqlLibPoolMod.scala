package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.mysql2Booleans.`true`
import typings.mysql2.mysql2Strings.connection
import typings.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions
import typings.mysql2.typingsMysqlLibProtocolPacketsFieldPacketMod.FieldPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsOkPacketMod.OkPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsResultSetHeaderMod.ResultSetHeader
import typings.mysql2.typingsMysqlLibProtocolPacketsRowDataPacketMod.RowDataPacket
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryError
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryOptions
import typings.node.NodeJS.ErrnoException
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibPoolMod {
  
  @JSImport("mysql2/typings/mysql/lib/Pool", JSImport.Namespace)
  @js.native
  open class ^ () extends Pool
  
  @js.native
  trait Pool extends EventEmitter {
    
    var config: PoolOptions = js.native
    
    def end(): Unit = js.native
    def end(callback: js.Function2[/* err */ ErrnoException | Null, /* repeated */ Any, Any]): Unit = js.native
    
    def getConnection(
      callback: js.Function2[
          /* err */ ErrnoException, 
          /* connection */ typings.mysql2.typingsMysqlLibPoolConnectionMod.^, 
          Any
        ]
    ): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(
      event: connection,
      listener: js.Function1[/* connection */ typings.mysql2.typingsMysqlLibPoolConnectionMod.^, Any]
    ): this.type = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          Any
        ]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
  }
  
  trait PoolOptions
    extends StObject
       with ConnectionOptions {
    
    /**
      * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
      * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
      */
    var acquireTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of connections to create at once. (Default: 10)
      */
    var connectionLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable keep-alive on the socket.  It's disabled by default, but the
      * user can enable it and supply an initial delay.
      */
    var enableKeepAlive: js.UndefOr[`true`] = js.undefined
    
    /**
      * If keep-alive is enabled users can supply an initial delay.
      */
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
      * is no limit to the number of queued connection requests. (Default: 0)
      */
    var queueLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
      * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
      * (Default: true)
      */
    var waitForConnections: js.UndefOr[Boolean] = js.undefined
  }
  object PoolOptions {
    
    inline def apply(): PoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoolOptions] (val x: Self) extends AnyVal {
      
      inline def setAcquireTimeout(value: Double): Self = StObject.set(x, "acquireTimeout", value.asInstanceOf[js.Any])
      
      inline def setAcquireTimeoutUndefined: Self = StObject.set(x, "acquireTimeout", js.undefined)
      
      inline def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
      
      inline def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
      
      inline def setEnableKeepAlive(value: `true`): Self = StObject.set(x, "enableKeepAlive", value.asInstanceOf[js.Any])
      
      inline def setEnableKeepAliveUndefined: Self = StObject.set(x, "enableKeepAlive", js.undefined)
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      inline def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
      
      inline def setWaitForConnections(value: Boolean): Self = StObject.set(x, "waitForConnections", value.asInstanceOf[js.Any])
      
      inline def setWaitForConnectionsUndefined: Self = StObject.set(x, "waitForConnections", js.undefined)
    }
  }
}
