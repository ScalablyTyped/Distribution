package typings.atOnfleetNodeDashOnfleet

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`0`
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends WebhookTriggerType {
  var triggerId: `0`
  var triggerName: TaskStarted
}

object Anon_0 {
  @scala.inline
  def apply(triggerId: `0`, triggerName: TaskStarted): Anon_0 = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0]
  }
}

