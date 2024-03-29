package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.mysql2Strings.end
import typings.mysql2.mysql2Strings.error
import typings.mysql2.mysql2Strings.fields
import typings.mysql2.mysql2Strings.result
import typings.mysql2.typingsMysqlLibProtocolPacketsFieldPacketMod.FieldPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsOkPacketMod.OkPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsResultSetHeaderMod.ResultSetHeader
import typings.mysql2.typingsMysqlLibProtocolPacketsRowDataPacketMod.RowDataPacket
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryError
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.StreamOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibProtocolSequencesPrepareMod {
  
  @JSImport("mysql2/typings/mysql/lib/protocol/sequences/Prepare", JSImport.Namespace)
  @js.native
  open class ^ () extends Prepare
  
  @JSImport("mysql2/typings/mysql/lib/protocol/sequences/Prepare", "PrepareStatementInfo")
  @js.native
  open class PrepareStatementInfo () extends StObject {
    
    def close(): Unit = js.native
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](paramaters: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      paramaters: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](paramaters: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      paramaters: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](paramaters: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      paramaters: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
  }
  
  @js.native
  trait Prepare
    extends typings.mysql2.typingsMysqlLibProtocolSequencesSequenceMod.^ {
    
    /**
    	 * Determines the packet class to use given the first byte of the packet.
    	 *
    	 * @param firstByte The first byte of the packet
    	 * @param parser The packet parser
    	 */
    def determinePacket(firstByte: Double, parser: Any): Any = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Any]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ QueryError, Any]): this.type = js.native
    @JSName("on")
    def on_fields(event: fields, listener: js.Function2[/* fields */ FieldPacket, /* index */ Double, Any]): this.type = js.native
    @JSName("on")
    def on_result(
      event: result,
      listener: js.Function2[/* result */ RowDataPacket | OkPacket, /* index */ Double, Any]
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
    def stream(): Readable = js.native
    def stream(options: StreamOptions): Readable = js.native
  }
}
