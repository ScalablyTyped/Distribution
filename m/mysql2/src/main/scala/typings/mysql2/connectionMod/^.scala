package typings.mysql2.connectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.queryMod.QueryError
import typings.mysql2.resultSetHeaderMod.ResultSetHeader
import typings.mysql2.rowDataPacketMod.RowDataPacket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mysql2/typings/mysql/lib/Connection", JSImport.Namespace)
@js.native
class ^ () extends Connection
@JSImport("mysql2/typings/mysql/lib/Connection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Array[_],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): typings.mysql2.queryMod.^ = js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: StringDictionary[js.Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
}
