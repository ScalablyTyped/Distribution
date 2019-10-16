package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "cachedDataVersionTag")
@js.native
object cachedDataVersionTag extends js.Object {
  /**
    * Returns an integer representing a "version tag" derived from the V8 version, command line flags and detected CPU features.
    * This is useful for determining whether a vm.Script cachedData buffer is compatible with this instance of V8.
    */
  def apply(): Double = js.native
}

