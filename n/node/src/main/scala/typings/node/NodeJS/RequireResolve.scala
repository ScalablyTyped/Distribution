package typings.node.NodeJS

import typings.node.Anon_Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireResolve extends js.Object {
  def apply(id: String): String = js.native
  def apply(id: String, options: Anon_Paths): String = js.native
  def paths(request: String): js.Array[String] | Null = js.native
}

