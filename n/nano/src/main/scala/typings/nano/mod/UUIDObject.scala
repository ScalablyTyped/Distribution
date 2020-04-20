package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDObject extends js.Object {
  var uuids: js.Array[String]
}

object UUIDObject {
  @scala.inline
  def apply(uuids: js.Array[String]): UUIDObject = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDObject]
  }
}

