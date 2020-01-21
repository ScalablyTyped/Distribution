package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildError extends js.Object {
  var details: String
  var message: String
  var severity: String
}

object IBuildError {
  @scala.inline
  def apply(details: String, message: String, severity: String): IBuildError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBuildError]
  }
}

