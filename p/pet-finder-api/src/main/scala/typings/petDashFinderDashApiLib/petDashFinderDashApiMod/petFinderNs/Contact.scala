package typings
package petDashFinderDashApiLib.petDashFinderDashApiMod.petFinderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var address1: java.lang.String
  var address2: java.lang.String
  var city: java.lang.String
  var email: java.lang.String
  var fax: java.lang.String
  var phone: java.lang.String
  var state: java.lang.String
  var zip: java.lang.String
}

object Contact {
  @scala.inline
  def apply(
    address1: java.lang.String,
    address2: java.lang.String,
    city: java.lang.String,
    email: java.lang.String,
    fax: java.lang.String,
    phone: java.lang.String,
    state: java.lang.String,
    zip: java.lang.String
  ): Contact = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, city = city, email = email, fax = fax, phone = phone, state = state, zip = zip)
  
    __obj.asInstanceOf[Contact]
  }
}

