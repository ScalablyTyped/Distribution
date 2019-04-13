package typings
package petDashFinderDashApiLib.petDashFinderDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shelter extends js.Object {
  var address1: java.lang.String
  var address2: java.lang.String
  var city: java.lang.String
  var country: java.lang.String
  var email: java.lang.String
  var fax: java.lang.String
  var id: java.lang.String
  var latitude: scala.Double
  var longitude: scala.Double
  var name: java.lang.String
  var phone: java.lang.String
  var state: java.lang.String
  var zip: java.lang.String
}

object Shelter {
  @scala.inline
  def apply(
    address1: java.lang.String,
    address2: java.lang.String,
    city: java.lang.String,
    country: java.lang.String,
    email: java.lang.String,
    fax: java.lang.String,
    id: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    name: java.lang.String,
    phone: java.lang.String,
    state: java.lang.String,
    zip: java.lang.String
  ): Shelter = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, city = city, country = country, email = email, fax = fax, id = id, latitude = latitude, longitude = longitude, name = name, phone = phone, state = state, zip = zip)
  
    __obj.asInstanceOf[Shelter]
  }
}

