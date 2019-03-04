package typings
package microgearsLib.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaInformation extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var extra: js.Any
  var methodName: java.lang.String
  var serviceName: java.lang.String
  var serviceNameSpace: java.lang.String
}

object MetaInformation {
  @scala.inline
  def apply(
    extra: js.Any,
    methodName: java.lang.String,
    serviceName: java.lang.String,
    serviceNameSpace: java.lang.String,
    error: stdLib.Error = null
  ): MetaInformation = {
    val __obj = js.Dynamic.literal(extra = extra, methodName = methodName, serviceName = serviceName, serviceNameSpace = serviceNameSpace)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MetaInformation]
  }
}

