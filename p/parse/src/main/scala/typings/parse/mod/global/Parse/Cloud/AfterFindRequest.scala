package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterFindRequest extends TriggerRequest {
  var objects: js.Array[Object[Attributes]] = js.native
}

object AfterFindRequest {
  @scala.inline
  def apply(
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object[Attributes],
    objects: js.Array[Object[Attributes]],
    triggerName: String
  ): AfterFindRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterFindRequest]
  }
  @scala.inline
  implicit class AfterFindRequestOps[Self <: AfterFindRequest] (val x: Self) extends AnyVal {
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
    def setObjectsVarargs(value: Object[Attributes]*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[Object[Attributes]]): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
  
}

