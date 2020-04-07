package typings.onfleetNodeOnfleet.webhooksMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebhookResult extends WebhookResult {
  var isEnabled: Boolean
}

object GetWebhookResult {
  @scala.inline
  def apply(
    count: Double,
    id: String,
    isEnabled: Boolean,
    trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
    url: String
  ): GetWebhookResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWebhookResult]
  }
}

