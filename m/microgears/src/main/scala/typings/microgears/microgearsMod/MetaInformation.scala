package typings.microgears.microgearsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInformation extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var extra: js.Any
  var methodName: String
  var serviceName: String
  var serviceNameSpace: String
}

object MetaInformation {
  @scala.inline
  def apply(
    extra: js.Any,
    methodName: String,
    serviceName: String,
    serviceNameSpace: String,
    error: Error = null
  ): MetaInformation = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceNameSpace = serviceNameSpace.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInformation]
  }
}

