package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inspector", "url")
@js.native
object url extends js.Object {
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    */
  def apply(): js.UndefOr[String] = js.native
}

