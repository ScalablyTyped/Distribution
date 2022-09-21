package typings.mysql.mod

import typings.mysql.mysqlStrings.end
import typings.mysql.mysqlStrings.error
import typings.mysql.mysqlStrings.fields
import typings.mysql.mysqlStrings.packet
import typings.mysql.mysqlStrings.result
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def EofPacket(packet: Any): Unit = js.native
  @JSName("EofPacket")
  var EofPacket_Original: packetCallback = js.native
  
  def ErrorPacket(packet: Any): Unit = js.native
  @JSName("ErrorPacket")
  var ErrorPacket_Original: packetCallback = js.native
  
  def FieldPacket(packet: Any): Unit = js.native
  @JSName("FieldPacket")
  var FieldPacket_Original: packetCallback = js.native
  
  def OkPacket(packet: Any): Unit = js.native
  @JSName("OkPacket")
  var OkPacket_Original: packetCallback = js.native
  
  def ResultSetHeaderPacket(packet: Any): Unit = js.native
  @JSName("ResultSetHeaderPacket")
  var ResultSetHeaderPacket_Original: packetCallback = js.native
  
  def RowDataPacket(packet: Any, parser: Any, connection: Connection): Unit = js.native
  
  /**
    * Determines the packet class to use given the first byte of the packet.
    *
    * @param byte The first byte of the packet
    * @param parser The packet parser
    */
  def determinePacket(byte: Double, parser: Any): Any = js.native
  
  /**
    * Default false
    */
  var nestedTables: Boolean = js.native
  
  def on(ev: String, callback: js.Function1[/* repeated */ Any, Unit]): Query = js.native
  @JSName("on")
  def on_end(ev: end, callback: js.Function0[Unit]): Query = js.native
  @JSName("on")
  def on_error(ev: error, callback: js.Function1[/* err */ MysqlError, Unit]): Query = js.native
  @JSName("on")
  def on_fields(ev: fields, callback: js.Function2[/* fields */ js.Array[FieldInfo], /* index */ Double, Unit]): Query = js.native
  @JSName("on")
  def on_packet(ev: packet, callback: js.Function1[/* packet */ Any, Unit]): Query = js.native
  @JSName("on")
  def on_result(ev: result, callback: js.Function2[/* row */ Any, /* index */ Double, Unit]): Query = js.native
  
  /**
    * Template query
    */
  var sql: String = js.native
  
  /**
    * Emits a query packet to start the query
    */
  def start(): Unit = js.native
  
  /**
    * Creates a Readable stream with the given options
    *
    * @param options The options for the stream. (see readable-stream package)
    */
  def stream(): Readable = js.native
  def stream(options: ReadableOptions): Readable = js.native
  
  /**
    * Default true
    */
  var typeCast: js.UndefOr[TypeCast] = js.native
  
  /**
    * Values for template query
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
