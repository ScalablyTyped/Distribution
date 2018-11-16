package typings
package msnodesqlLib.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msnodesql", JSImport.Namespace)
@js.native
object msnodesqlModMembers extends js.Object {
  def open(connectionString: java.lang.String): Connection = js.native
  def open(connectionString: java.lang.String, callback: OpenCallback): Connection = js.native
  def query(connectionString: java.lang.String, query: java.lang.String): StreamEvents = js.native
  def query(connectionString: java.lang.String, query: java.lang.String, callback: QueryCallback[_]): StreamEvents = js.native
  def query(connectionString: java.lang.String, query: java.lang.String, params: js.Array[_]): StreamEvents = js.native
  def query(
    connectionString: java.lang.String,
    query: java.lang.String,
    params: js.Array[_],
    callback: QueryCallback[_]
  ): StreamEvents = js.native
  def queryRaw(connectionString: java.lang.String, query: java.lang.String): StreamEvents = js.native
  def queryRaw(connectionString: java.lang.String, query: java.lang.String, callback: QueryRawCallback): StreamEvents = js.native
  def queryRaw(connectionString: java.lang.String, query: java.lang.String, params: js.Array[_]): StreamEvents = js.native
  def queryRaw(
    connectionString: java.lang.String,
    query: java.lang.String,
    params: js.Array[_],
    callback: QueryRawCallback
  ): StreamEvents = js.native
  @JSName("query")
  def query_T[T](connectionString: java.lang.String, query: java.lang.String, callback: QueryCallback[T]): StreamEvents = js.native
  @JSName("query")
  def query_T[T](
    connectionString: java.lang.String,
    query: java.lang.String,
    params: js.Array[_],
    callback: QueryCallback[T]
  ): StreamEvents = js.native
}

