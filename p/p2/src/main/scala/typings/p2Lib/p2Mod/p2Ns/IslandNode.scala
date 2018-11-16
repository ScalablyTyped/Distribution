package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IslandNode extends js.Object {
  var body: Body
  var equations: js.Array[Equation]
  var neighbors: js.Array[IslandNode]
  var visited: scala.Boolean
  def reset(): scala.Unit
}

