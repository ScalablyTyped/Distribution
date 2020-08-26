package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorNotification[T] extends js.Object {
  var method: String = js.native
  var params: T = js.native
}

object InspectorNotification {
  @scala.inline
  def apply[T](method: String, params: T): InspectorNotification[T] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorNotification[T]]
  }
  @scala.inline
  implicit class InspectorNotificationOps[Self <: InspectorNotification[_], T] (val x: Self with InspectorNotification[T]) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

