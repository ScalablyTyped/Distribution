package typings.petDashFinderDashApi.petDashFinderDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shelter extends js.Object {
  var address1: String
  var address2: String
  var city: String
  var country: String
  var email: String
  var fax: String
  var id: String
  var latitude: Double
  var longitude: Double
  var name: String
  var phone: String
  var state: String
  var zip: String
}

object Shelter {
  @scala.inline
  def apply(
    address1: String,
    address2: String,
    city: String,
    country: String,
    email: String,
    fax: String,
    id: String,
    latitude: Double,
    longitude: Double,
    name: String,
    phone: String,
    state: String,
    zip: String
  ): Shelter = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, city = city, country = country, email = email, fax = fax, id = id, latitude = latitude, longitude = longitude, name = name, phone = phone, state = state, zip = zip)
  
    __obj.asInstanceOf[Shelter]
  }
}

