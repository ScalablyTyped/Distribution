package typings.msnodesql.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msnodesql", "open")
@js.native
object open extends js.Object {
  def apply(connectionString: String): Connection = js.native
  def apply(connectionString: String, callback: OpenCallback): Connection = js.native
}

