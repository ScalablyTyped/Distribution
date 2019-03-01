package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pointer extends js.Object {
  var __type: java.lang.String
  var className: java.lang.String
  var objectId: java.lang.String
}

object Pointer {
  @scala.inline
  def apply(__type: java.lang.String, className: java.lang.String, objectId: java.lang.String): Pointer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[Pointer]
  }
}

