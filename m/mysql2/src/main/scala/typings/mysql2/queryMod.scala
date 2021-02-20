package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.mysql2Strings.end
import typings.mysql2.mysql2Strings.error
import typings.mysql2.mysql2Strings.fields
import typings.mysql2.mysql2Strings.result
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.rowDataPacketMod.RowDataPacket
import typings.node.NodeJS.ErrnoException
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("mysql2/typings/mysql/lib/protocol/sequences/Query", JSImport.Namespace)
  @js.native
  class ^ () extends Query
  
  @js.native
  trait Query
    extends typings.mysql2.sequenceMod.^ {
    
    /**
      * Determines the packet class to use given the first byte of the packet.
      *
      * @param firstByte The first byte of the packet
      * @param parser The packet parser
      */
    def determinePacket(firstByte: Double, parser: js.Any): js.Any = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[_]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ QueryError, _]): this.type = js.native
    @JSName("on")
    def on_fields(event: fields, listener: js.Function2[/* fields */ FieldPacket, /* index */ Double, _]): this.type = js.native
    @JSName("on")
    def on_result(
      event: result,
      listener: js.Function2[/* result */ RowDataPacket | OkPacket, /* index */ Double, _]
    ): this.type = js.native
    
    /**
      * The SQL for a constructed query
      */
    var sql: String = js.native
    
    /**
      * Emits a query packet to start the query
      */
    def start(): Unit = js.native
    
    /**
      * Creates a Readable stream with the given options
      *
      * @param options The options for the stream.
      */
    def stream(options: StreamOptions): Readable = js.native
  }
  
  @js.native
  trait QueryError extends ErrnoException {
    
    /**
      * Either a MySQL server error (e.g. 'ER_ACCESS_DENIED_ERROR'),
      * a node.js error (e.g. 'ECONNREFUSED') or an internal error
      * (e.g. 'PROTOCOL_CONNECTION_LOST').
      */
    @JSName("code")
    var code_QueryError: String = js.native
    
    /**
      * Boolean, indicating if this error is terminal to the connection object.
      */
    var fatal: Boolean = js.native
    
    /**
      * The field count
      */
    var fieldCount: js.UndefOr[Double] = js.native
    
    /**
      * The sql state
      */
    var sqlState: js.UndefOr[String] = js.native
    
    /**
      * The sql state marker
      */
    var sqlStateMarker: js.UndefOr[String] = js.native
  }
  object QueryError {
    
    @scala.inline
    def apply(code: String, fatal: Boolean, message: String, name: String): QueryError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryError]
    }
    
    @scala.inline
    implicit class QueryErrorMutableBuilder[Self <: QueryError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCountUndefined: Self = StObject.set(x, "fieldCount", js.undefined)
      
      @scala.inline
      def setSqlState(value: String): Self = StObject.set(x, "sqlState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlStateMarker(value: String): Self = StObject.set(x, "sqlStateMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlStateMarkerUndefined: Self = StObject.set(x, "sqlStateMarker", js.undefined)
      
      @scala.inline
      def setSqlStateUndefined: Self = StObject.set(x, "sqlState", js.undefined)
    }
  }
  
  @js.native
  trait QueryOptions extends StObject {
    
    /**
      * Either a boolean or string. If true, tables will be nested objects. If string (e.g. '_'), tables will be
      * nested as tableName_fieldName
      */
    var nestTables: js.UndefOr[js.Any] = js.native
    
    /**
      * The SQL for the query
      */
    var sql: String = js.native
    
    /**
      * Every operation takes an optional inactivity timeout option. This allows you to specify appropriate timeouts for
      * operations. It is important to note that these timeouts are not part of the MySQL protocol, and rather timeout
      * operations through the client. This means that when a timeout is reached, the connection it occurred on will be
      * destroyed and no further operations can be performed.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
      * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
      *
      * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
      *
      * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
      *
      * field.string()
      * field.buffer()
      * field.geometry()
      *
      * are aliases for
      *
      * parser.parseLengthCodedString()
      * parser.parseLengthCodedBuffer()
      * parser.parseGeometryValue()
      *
      * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
      */
    var typeCast: js.UndefOr[js.Any] = js.native
    
    /**
      * The values for the query
      */
    var values: js.UndefOr[js.Any | js.Array[_] | StringDictionary[js.Any]] = js.native
  }
  object QueryOptions {
    
    @scala.inline
    def apply(sql: String): QueryOptions = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNestTables(value: js.Any): Self = StObject.set(x, "nestTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestTablesUndefined: Self = StObject.set(x, "nestTables", js.undefined)
      
      @scala.inline
      def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTypeCast(value: js.Any): Self = StObject.set(x, "typeCast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCastUndefined: Self = StObject.set(x, "typeCast", js.undefined)
      
      @scala.inline
      def setValues(value: js.Any | js.Array[_] | StringDictionary[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StreamOptions extends StObject {
    
    /**
      * Sets the max buffer size in objects of a stream
      */
    var highWaterMark: js.UndefOr[Double] = js.native
    
    /**
      * The object mode of the stream (Default: true)
      */
    var objectMode: js.UndefOr[js.Any] = js.native
  }
  object StreamOptions {
    
    @scala.inline
    def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectMode(value: js.Any): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
}
