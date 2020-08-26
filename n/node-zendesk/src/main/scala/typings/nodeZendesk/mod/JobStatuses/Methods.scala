package typings.nodeZendesk.mod.JobStatuses

import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def show(jobStatusId: ZendeskID): js.Promise[ResponsePayload] = js.native
  def show(jobStatusId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double): js.Promise[_] = js.native
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
}

