package typings.nextDashSeo.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Twitter extends js.Object {
  var cardType: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var site: js.UndefOr[String] = js.undefined
}

object Twitter {
  @scala.inline
  def apply(cardType: String = null, handle: String = null, site: String = null): Twitter = {
    val __obj = js.Dynamic.literal()
    if (cardType != null) __obj.updateDynamic("cardType")(cardType.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitter]
  }
}

