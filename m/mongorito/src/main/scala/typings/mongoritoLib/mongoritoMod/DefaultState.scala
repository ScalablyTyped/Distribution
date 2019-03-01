package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultState extends js.Object {
  var fields: js.Object
  var unset: js.Array[java.lang.String]
}

object DefaultState {
  @scala.inline
  def apply(fields: js.Object, unset: js.Array[java.lang.String]): DefaultState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("unset")(unset)
    __obj.asInstanceOf[DefaultState]
  }
}

