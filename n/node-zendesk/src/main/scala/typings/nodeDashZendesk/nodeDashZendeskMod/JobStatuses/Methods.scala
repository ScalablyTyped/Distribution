package typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def show(jobStatusId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[_, _]): js.Any
}

object Methods {
  @scala.inline
  def apply(
    show: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    watch: (ZendeskID, Double, Double, ZendeskCallback[_, _]) => js.Any
  ): Methods = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction2(show), watch = js.Any.fromFunction4(watch))
  
    __obj.asInstanceOf[Methods]
  }
}

