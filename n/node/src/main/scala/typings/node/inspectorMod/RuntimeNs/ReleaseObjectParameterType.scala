package typings.node.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseObjectParameterType extends js.Object {
  /**
    * Identifier of the object to release.
    */
  var objectId: RemoteObjectId
}

object ReleaseObjectParameterType {
  @scala.inline
  def apply(objectId: RemoteObjectId): ReleaseObjectParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId)
  
    __obj.asInstanceOf[ReleaseObjectParameterType]
  }
}

