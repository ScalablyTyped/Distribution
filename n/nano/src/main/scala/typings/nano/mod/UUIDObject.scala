package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUIDObject extends js.Object {
  var uuids: js.Array[String] = js.native
}

object UUIDObject {
  @scala.inline
  def apply(uuids: js.Array[String]): UUIDObject = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDObject]
  }
  @scala.inline
  implicit class UUIDObjectOps[Self <: UUIDObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUuidsVarargs(value: String*): Self = this.set("uuids", js.Array(value :_*))
    @scala.inline
    def setUuids(value: js.Array[String]): Self = this.set("uuids", value.asInstanceOf[js.Any])
  }
  
}

