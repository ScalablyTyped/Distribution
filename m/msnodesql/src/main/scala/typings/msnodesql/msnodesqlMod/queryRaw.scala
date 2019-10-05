package typings.msnodesql.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msnodesql", "queryRaw")
@js.native
object queryRaw extends js.Object {
  def apply(connectionString: String, query: String): StreamEvents = js.native
  def apply(connectionString: String, query: String, callback: QueryRawCallback): StreamEvents = js.native
  def apply(connectionString: String, query: String, params: js.Array[_]): StreamEvents = js.native
  def apply(connectionString: String, query: String, params: js.Array[_], callback: QueryRawCallback): StreamEvents = js.native
}

