package typings.mysql2.connectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.queryMod.QueryError
import typings.mysql2.queryMod.QueryOptions
import typings.mysql2.resultSetHeaderMod.ResultSetHeader
import typings.mysql2.rowDataPacketMod.RowDataPacket
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends EventEmitter {
  
  def beginTransaction(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
  
  def changeUser(options: ConnectionOptions): Unit = js.native
  def changeUser(options: ConnectionOptions, callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
  
  def commit(): Unit = js.native
  def commit(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
  
  var config: ConnectionOptions = js.native
  
  def connect(): Unit = js.native
  def connect(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def end(): Unit = js.native
  def end(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
  def end(options: js.Any): Unit = js.native
  def end(options: js.Any, callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
  
  def escape(value: js.Any): String = js.native
  
  def escapeId(value: String): String = js.native
  def escapeId(values: js.Array[String]): String = js.native
  
  def format(sql: String): String = js.native
  def format(sql: String, values: js.Any): String = js.native
  def format(sql: String, values: js.Array[_]): String = js.native
  def format(sql: String, values: StringDictionary[js.Any]): String = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  
  def pause(): Unit = js.native
  
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
  
  def resume(): Unit = js.native
  
  def rollback(callback: js.Function0[Unit]): Unit = js.native
  
  var threadId: Double = js.native
}
