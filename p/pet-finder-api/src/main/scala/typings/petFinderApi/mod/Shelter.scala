package typings.petFinderApi.mod

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
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Shelter]
  }
}

