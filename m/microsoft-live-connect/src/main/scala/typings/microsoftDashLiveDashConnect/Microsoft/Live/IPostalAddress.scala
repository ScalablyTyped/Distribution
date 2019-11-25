package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about one postal address.
  */
trait IPostalAddress extends js.Object {
  /**
    * The city of the address, or null if one is not specified.
    */
  var city: String
  /**
    * The postal code of the address, or null if one is not specified.
    */
  var postal_code: String
  /**
    * The region of the address, or null if one is not specified.
    */
  var region: String
  /**
    * The state of the address, or null if one is not specified.
    */
  var state: String
  /**
    * The street address, or null if one is not specified.
    */
  var street: String
  /**
    * The second line of the street address, or null if one is not
    * specified.
    */
  var street_2: String
}

object IPostalAddress {
  @scala.inline
  def apply(city: String, postal_code: String, region: String, state: String, street: String, street_2: String): IPostalAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], street_2 = street_2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPostalAddress]
  }
}

