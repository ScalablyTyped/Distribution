package typings.msnodesql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  def beginTransaction(): js.Any = js.native
  def beginTransaction(callback: ErrorCallback): js.Any = js.native
  
  def close(): js.Any = js.native
  def close(callback: ErrorCallback): js.Any = js.native
  def close(immediately: Boolean): js.Any = js.native
  def close(immediately: Boolean, callback: ErrorCallback): js.Any = js.native
  
  def commit(): js.Any = js.native
  def commit(callback: ErrorCallback): js.Any = js.native
  
  def query(query: String): StreamEvents = js.native
  def query(query: String, callback: QueryCallback[_]): StreamEvents = js.native
  def query(query: String, params: js.Array[_]): StreamEvents = js.native
  def query(query: String, params: js.Array[_], callback: QueryCallback[_]): StreamEvents = js.native
  
  def queryRaw(query: String): StreamEvents = js.native
  def queryRaw(query: String, callback: QueryRawCallback): StreamEvents = js.native
  def queryRaw(query: String, params: js.Array[_]): StreamEvents = js.native
  def queryRaw(query: String, params: js.Array[_], callback: QueryRawCallback): StreamEvents = js.native
  
  @JSName("query")
  def query_T[T](query: String, callback: QueryCallback[T]): StreamEvents = js.native
  @JSName("query")
  def query_T[T](query: String, params: js.Array[_], callback: QueryCallback[T]): StreamEvents = js.native
  
  def rollback(): js.Any = js.native
  def rollback(callback: ErrorCallback): js.Any = js.native
}
