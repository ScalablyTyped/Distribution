package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudErrorParameters extends js.Object {
  var code: String = js.native
  var details: js.UndefOr[js.Array[CloudError]] = js.native
  var message: String = js.native
  var target: js.UndefOr[String] = js.native
}

object CloudErrorParameters {
  @scala.inline
  def apply(code: String, message: String): CloudErrorParameters = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudErrorParameters]
  }
  @scala.inline
  implicit class CloudErrorParametersOps[Self <: CloudErrorParameters] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailsVarargs(value: CloudError*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[CloudError]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

