package typings
package msnodesqlLib.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msnodesql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(connectionString: java.lang.String): msnodesqlLib.msnodesqlMod.Connection = js.native
  def open(connectionString: java.lang.String, callback: msnodesqlLib.msnodesqlMod.OpenCallback): msnodesqlLib.msnodesqlMod.Connection = js.native
  def query(connectionString: java.lang.String, query: java.lang.String): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def query(
    connectionString: java.lang.String,
    query: java.lang.String,
    callback: msnodesqlLib.msnodesqlMod.QueryCallback[_]
  ): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def query(connectionString: java.lang.String, query: java.lang.String, params: js.Array[_]): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def query(
    connectionString: java.lang.String,
    query: java.lang.String,
    params: js.Array[_],
    callback: msnodesqlLib.msnodesqlMod.QueryCallback[_]
  ): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def queryRaw(connectionString: java.lang.String, query: java.lang.String): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def queryRaw(
    connectionString: java.lang.String,
    query: java.lang.String,
    callback: msnodesqlLib.msnodesqlMod.QueryRawCallback
  ): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def queryRaw(connectionString: java.lang.String, query: java.lang.String, params: js.Array[_]): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  def queryRaw(
    connectionString: java.lang.String,
    query: java.lang.String,
    params: js.Array[_],
    callback: msnodesqlLib.msnodesqlMod.QueryRawCallback
  ): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  @JSName("query")
  def query_T[T](
    connectionString: java.lang.String,
    query: java.lang.String,
    callback: msnodesqlLib.msnodesqlMod.QueryCallback[T]
  ): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
  @JSName("query")
  def query_T[T](
    connectionString: java.lang.String,
    query: java.lang.String,
    params: js.Array[_],
    callback: msnodesqlLib.msnodesqlMod.QueryCallback[T]
  ): msnodesqlLib.msnodesqlMod.StreamEvents = js.native
}

