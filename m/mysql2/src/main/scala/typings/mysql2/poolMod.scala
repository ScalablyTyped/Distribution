package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.connectionMod.ConnectionOptions
import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.mysql2Booleans.`true`
import typings.mysql2.mysql2Strings.connection
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.queryMod.QueryError
import typings.mysql2.queryMod.QueryOptions
import typings.mysql2.resultSetHeaderMod.ResultSetHeader
import typings.mysql2.rowDataPacketMod.RowDataPacket
import typings.node.NodeJS.ErrnoException
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolMod {
  
  @JSImport("mysql2/typings/mysql/lib/Pool", JSImport.Namespace)
  @js.native
  class ^ () extends Pool
  
  @js.native
  trait Pool extends EventEmitter {
    
    var config: PoolOptions = js.native
    
    def end(): Unit = js.native
    def end(callback: js.Function2[/* err */ ErrnoException | Null, /* repeated */ js.Any, _]): Unit = js.native
    
    def getConnection(
      callback: js.Function2[/* err */ ErrnoException, /* connection */ typings.mysql2.poolConnectionMod.^, _]
    ): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* connection */ typings.mysql2.poolConnectionMod.^, _]): this.type = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          _
        ]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
  }
  
  @js.native
  trait PoolOptions extends ConnectionOptions {
    
    /**
      * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
      * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
      */
    var acquireTimeout: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of connections to create at once. (Default: 10)
      */
    var connectionLimit: js.UndefOr[Double] = js.native
    
    /**
      * Enable keep-alive on the socket.  It's disabled by default, but the
      * user can enable it and supply an initial delay.
      */
    var enableKeepAlive: js.UndefOr[`true`] = js.native
    
    /**
      * If keep-alive is enabled users can supply an initial delay.
      */
    var keepAliveInitialDelay: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
      * is no limit to the number of queued connection requests. (Default: 0)
      */
    var queueLimit: js.UndefOr[Double] = js.native
    
    /**
      * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
      * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
      * (Default: true)
      */
    var waitForConnections: js.UndefOr[Boolean] = js.native
  }
  object PoolOptions {
    
    @scala.inline
    def apply(): PoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolOptions]
    }
    
    @scala.inline
    implicit class PoolOptionsMutableBuilder[Self <: PoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcquireTimeout(value: Double): Self = StObject.set(x, "acquireTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcquireTimeoutUndefined: Self = StObject.set(x, "acquireTimeout", js.undefined)
      
      @scala.inline
      def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
      
      @scala.inline
      def setEnableKeepAlive(value: `true`): Self = StObject.set(x, "enableKeepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeepAliveUndefined: Self = StObject.set(x, "enableKeepAlive", js.undefined)
      
      @scala.inline
      def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      @scala.inline
      def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
      
      @scala.inline
      def setWaitForConnections(value: Boolean): Self = StObject.set(x, "waitForConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForConnectionsUndefined: Self = StObject.set(x, "waitForConnections", js.undefined)
    }
  }
}
