package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandNode")
@js.native
class IslandNode protected () extends js.Object {
  def this(body: Body) = this()
  var body: Body = js.native
  var equations: js.Array[Equation] = js.native
  var neighbors: js.Array[IslandNode] = js.native
  var visited: Boolean = js.native
  def reset(): Unit = js.native
}

