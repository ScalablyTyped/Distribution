package typings.petDashFinderDashApi.petDashFinderDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var address1: String
  var address2: String
  var city: String
  var email: String
  var fax: String
  var phone: String
  var state: String
  var zip: String
}

object Contact {
  @scala.inline
  def apply(
    address1: String,
    address2: String,
    city: String,
    email: String,
    fax: String,
    phone: String,
    state: String,
    zip: String
  ): Contact = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, city = city, email = email, fax = fax, phone = phone, state = state, zip = zip)
  
    __obj.asInstanceOf[Contact]
  }
}

