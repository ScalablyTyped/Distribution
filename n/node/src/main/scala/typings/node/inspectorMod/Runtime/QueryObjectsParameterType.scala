package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObjectsParameterType extends js.Object {
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId
}

object QueryObjectsParameterType {
  @scala.inline
  def apply(prototypeObjectId: RemoteObjectId): QueryObjectsParameterType = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryObjectsParameterType]
  }
}

