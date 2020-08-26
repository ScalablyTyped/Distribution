package typings.microgears.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaInformation extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var extra: js.Any = js.native
  var methodName: String = js.native
  var serviceName: String = js.native
  var serviceNameSpace: String = js.native
}

object MetaInformation {
  @scala.inline
  def apply(extra: js.Any, methodName: String, serviceName: String, serviceNameSpace: String): MetaInformation = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceNameSpace = serviceNameSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInformation]
  }
  @scala.inline
  implicit class MetaInformationOps[Self <: MetaInformation] (val x: Self) extends AnyVal {
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
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceNameSpace(value: String): Self = this.set("serviceNameSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

