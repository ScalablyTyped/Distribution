package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Twitter extends js.Object {
  var cardType: js.UndefOr[java.lang.String] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var site: js.UndefOr[java.lang.String] = js.undefined
}

object Twitter {
  @scala.inline
  def apply(cardType: java.lang.String = null, handle: java.lang.String = null, site: java.lang.String = null): Twitter = {
    val __obj = js.Dynamic.literal()
    if (cardType != null) __obj.updateDynamic("cardType")(cardType)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[Twitter]
  }
}

