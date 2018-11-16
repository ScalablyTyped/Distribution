package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  @JSName("EofPacket")
  var EofPacket_Original: packetCallback = js.native
  @JSName("ErrorPacket")
  var ErrorPacket_Original: packetCallback = js.native
  @JSName("FieldPacket")
  var FieldPacket_Original: packetCallback = js.native
  @JSName("OkPacket")
  var OkPacket_Original: packetCallback = js.native
  @JSName("ResultSetHeaderPacket")
  var ResultSetHeaderPacket_Original: packetCallback = js.native
  /**
       * Default false
       */
  var nestedTables: scala.Boolean = js.native
  /**
       * Template query
       */
  var sql: java.lang.String = js.native
  /**
       * Default true
       */
  var typeCast: js.UndefOr[TypeCast] = js.native
  /**
       * Values for template query
       */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.native
  def EofPacket(packet: js.Any): scala.Unit = js.native
  def ErrorPacket(packet: js.Any): scala.Unit = js.native
  def FieldPacket(packet: js.Any): scala.Unit = js.native
  def OkPacket(packet: js.Any): scala.Unit = js.native
  def ResultSetHeaderPacket(packet: js.Any): scala.Unit = js.native
  def RowDataPacket(packet: js.Any, parser: js.Any, connection: Connection): scala.Unit = js.native
  /**
       * Determines the packet class to use given the first byte of the packet.
       *
       * @param byte The first byte of the packet
       * @param parser The packet parser
       */
  def determinePacket(byte: scala.Double, parser: js.Any): js.Any = js.native
  def on(ev: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): Query = js.native
  @JSName("on")
  def on_end(ev: mysqlLib.mysqlLibStrings.end, callback: js.Function0[scala.Unit]): Query = js.native
  @JSName("on")
  def on_error(ev: mysqlLib.mysqlLibStrings.error, callback: js.Function1[/* err */ MysqlError, scala.Unit]): Query = js.native
  @JSName("on")
  def on_fields(
    ev: mysqlLib.mysqlLibStrings.fields,
    callback: js.Function2[/* fields */ js.Array[FieldInfo], /* index */ scala.Double, scala.Unit]
  ): Query = js.native
  @JSName("on")
  def on_packet(ev: mysqlLib.mysqlLibStrings.packet, callback: js.Function1[/* packet */ js.Any, scala.Unit]): Query = js.native
  @JSName("on")
  def on_result(
    ev: mysqlLib.mysqlLibStrings.result,
    callback: js.Function2[/* row */ js.Any, /* index */ scala.Double, scala.Unit]
  ): Query = js.native
  /**
       * Emits a query packet to start the query
       */
  def start(): scala.Unit = js.native
  /**
       * Creates a Readable stream with the given options
       *
       * @param options The options for the stream. (see readable-stream package)
       */
  def stream(): nodeLib.streamMod.Readable = js.native
  /**
       * Creates a Readable stream with the given options
       *
       * @param options The options for the stream. (see readable-stream package)
       */
  def stream(options: nodeLib.streamMod.internalNs.ReadableOptions): nodeLib.streamMod.Readable = js.native
}

