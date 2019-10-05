package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "relative")
@js.native
object relative extends js.Object {
  /**
    * Solve the relative path from {from} to {to}.
    * At times we have two absolute paths, and we need to derive the relative path from one to the other. This is actually the reverse transform of path.resolve.
    */
  def apply(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}

