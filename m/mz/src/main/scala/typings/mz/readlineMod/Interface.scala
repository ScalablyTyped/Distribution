package typings.mz.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/readline", "Interface")
@js.native
class Interface ()
  extends typings.node.readlineMod.Interface {
  def question(query: String): js.Promise[String] = js.native
}

