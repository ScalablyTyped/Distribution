package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceActionId extends js.Object {
  def request(): js.Promise[ExportResponse]
}

object GetResourceActionId {
  @scala.inline
  def apply(request: () => js.Promise[ExportResponse]): GetResourceActionId = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction0(request))
  
    __obj.asInstanceOf[GetResourceActionId]
  }
}

