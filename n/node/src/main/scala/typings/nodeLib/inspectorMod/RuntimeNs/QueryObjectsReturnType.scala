package typings
package nodeLib.inspectorMod.RuntimeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[QueryObjectsReturnType]
  }
}

