package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObjectsReturnType extends js.Object {
  /**
    * Array with objects.
    */
  var objects: RemoteObject
}

object QueryObjectsReturnType {
  @scala.inline
  def apply(objects: RemoteObject): QueryObjectsReturnType = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryObjectsReturnType]
  }
}

