package typings
package nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def show(
    jobStatusId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def watch(
    jobStatusId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    interval: scala.Double,
    maxAttempts: scala.Double,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
}

object Methods {
  @scala.inline
  def apply(
    show: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    watch: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, scala.Double, scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any
  ): Methods = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction2(show), watch = js.Any.fromFunction4(watch))
  
    __obj.asInstanceOf[Methods]
  }
}

