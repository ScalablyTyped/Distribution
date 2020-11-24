package typings.mysql2.queryMod

import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.mysql2Strings.end
import typings.mysql2.mysql2Strings.error
import typings.mysql2.mysql2Strings.fields
import typings.mysql2.mysql2Strings.result
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.rowDataPacketMod.RowDataPacket
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends EventEmitter {
  
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
