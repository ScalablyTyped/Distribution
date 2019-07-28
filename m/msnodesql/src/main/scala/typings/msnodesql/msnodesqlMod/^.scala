package typings.msnodesql.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msnodesql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(connectionString: String): Connection = js.native
  def open(connectionString: String, callback: OpenCallback): Connection = js.native
  def query(connectionString: String, query: String): StreamEvents = js.native
  def query(connectionString: String, query: String, callback: QueryCallback[_]): StreamEvents = js.native
  def query(connectionString: String, query: String, params: js.Array[_]): StreamEvents = js.native
  def query(connectionString: String, query: String, params: js.Array[_], callback: QueryCallback[_]): StreamEvents = js.native
  def queryRaw(connectionString: String, query: String): StreamEvents = js.native
  def queryRaw(connectionString: String, query: String, callback: QueryRawCallback): StreamEvents = js.native
  def queryRaw(connectionString: String, query: String, params: js.Array[_]): StreamEvents = js.native
  def queryRaw(connectionString: String, query: String, params: js.Array[_], callback: QueryRawCallback): StreamEvents = js.native
  @JSName("query")
  def query_T[T](connectionString: String, query: String, callback: QueryCallback[T]): StreamEvents = js.native
  @JSName("query")
  def query_T[T](connectionString: String, query: String, params: js.Array[_], callback: QueryCallback[T]): StreamEvents = js.native
}

