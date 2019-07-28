package typings.morphdom.morphdomMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("morphdom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(fromNode: Node, toNode: Node | String): Unit = js.native
  def apply(fromNode: Node, toNode: Node | String, options: MorphDomOptions): Unit = js.native
}

