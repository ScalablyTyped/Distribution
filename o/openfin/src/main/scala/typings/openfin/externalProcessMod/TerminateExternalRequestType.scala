package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateExternalRequestType extends js.Object {
  var killTree: Boolean
  var timeout: Double
  var uuid: String
}

object TerminateExternalRequestType {
  @scala.inline
  def apply(killTree: Boolean, timeout: Double, uuid: String): TerminateExternalRequestType = {
    val __obj = js.Dynamic.literal(killTree = killTree.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateExternalRequestType]
  }
}

