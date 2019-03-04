package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObjectsParameterType extends js.Object {
  /**
    * Symbolic group name that can be used to release the results.
    */
  var objectGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId
}

object QueryObjectsParameterType {
  @scala.inline
  def apply(prototypeObjectId: RemoteObjectId, objectGroup: java.lang.String = null): QueryObjectsParameterType = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId)
    if (objectGroup != null) __obj.updateDynamic("objectGroup")(objectGroup)
    __obj.asInstanceOf[QueryObjectsParameterType]
  }
}

