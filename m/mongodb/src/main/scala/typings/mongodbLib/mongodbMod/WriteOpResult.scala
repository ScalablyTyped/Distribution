package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOpResult extends js.Object {
  var connection: js.Any
  var ops: js.Array[_]
  var result: js.Any
}

object WriteOpResult {
  @scala.inline
  def apply(connection: js.Any, ops: js.Array[_], result: js.Any): WriteOpResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("ops")(ops)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[WriteOpResult]
  }
}

