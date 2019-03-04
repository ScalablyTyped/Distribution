package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildError extends js.Object {
  var details: java.lang.String
  var message: java.lang.String
  var severity: java.lang.String
}

object IBuildError {
  @scala.inline
  def apply(details: java.lang.String, message: java.lang.String, severity: java.lang.String): IBuildError = {
    val __obj = js.Dynamic.literal(details = details, message = message, severity = severity)
  
    __obj.asInstanceOf[IBuildError]
  }
}

