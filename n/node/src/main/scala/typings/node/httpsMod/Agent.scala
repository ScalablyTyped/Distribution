package typings.node.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Agent")
@js.native
class Agent ()
  extends typings.node.httpMod.Agent {
  def this(options: AgentOptions) = this()
  var options: AgentOptions = js.native
}

