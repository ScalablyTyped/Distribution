package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseObjectGroupParameterType extends js.Object {
  /**
    * Symbolic object group name.
    */
  var objectGroup: String
}

object ReleaseObjectGroupParameterType {
  @scala.inline
  def apply(objectGroup: String): ReleaseObjectGroupParameterType = {
    val __obj = js.Dynamic.literal(objectGroup = objectGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseObjectGroupParameterType]
  }
}

