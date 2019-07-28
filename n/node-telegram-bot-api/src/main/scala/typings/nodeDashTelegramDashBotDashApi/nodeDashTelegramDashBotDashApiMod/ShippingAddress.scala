package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  var city: String
  var country_code: String
  var post_code: String
  var state: String
  var street_line1: String
  var street_line2: String
}

object ShippingAddress {
  @scala.inline
  def apply(
    city: String,
    country_code: String,
    post_code: String,
    state: String,
    street_line1: String,
    street_line2: String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(city = city, country_code = country_code, post_code = post_code, state = state, street_line1 = street_line1, street_line2 = street_line2)
  
    __obj.asInstanceOf[ShippingAddress]
  }
}

