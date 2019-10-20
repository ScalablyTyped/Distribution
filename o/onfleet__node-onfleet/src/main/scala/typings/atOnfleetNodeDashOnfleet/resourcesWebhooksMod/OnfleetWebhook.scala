package typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`0`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`10`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`12`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`13`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`14`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`1`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`2`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`3`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`4`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`5`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`6`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`7`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`8`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetWebhook extends js.Object {
  var threshold: js.UndefOr[Double] = js.undefined
  var trigger: js.UndefOr[`0`] with js.UndefOr[`1`] with js.UndefOr[`2`] with js.UndefOr[`3`] with js.UndefOr[`4`] with js.UndefOr[`5`] with js.UndefOr[`6`] with js.UndefOr[`7`] with js.UndefOr[`8`] with js.UndefOr[`9`] with js.UndefOr[`10`] with js.UndefOr[`12`] with js.UndefOr[`13`] with js.UndefOr[`14`]
  var url: String
}

object OnfleetWebhook {
  @scala.inline
  def apply(
    trigger: js.UndefOr[`0`] with js.UndefOr[`1`] with js.UndefOr[`2`] with js.UndefOr[`3`] with js.UndefOr[`4`] with js.UndefOr[`5`] with js.UndefOr[`6`] with js.UndefOr[`7`] with js.UndefOr[`8`] with js.UndefOr[`9`] with js.UndefOr[`10`] with js.UndefOr[`12`] with js.UndefOr[`13`] with js.UndefOr[`14`],
    url: String,
    threshold: Int | Double = null
  ): OnfleetWebhook = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], url = url)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetWebhook]
  }
}

