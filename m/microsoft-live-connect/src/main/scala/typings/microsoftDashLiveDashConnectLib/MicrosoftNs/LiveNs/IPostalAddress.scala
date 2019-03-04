package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var city: java.lang.String
  /**
    * The postal code of the address, or null if one is not specified.
    */
  var postal_code: java.lang.String
  /**
    * The region of the address, or null if one is not specified.
    */
  var region: java.lang.String
  /**
    * The state of the address, or null if one is not specified.
    */
  var state: java.lang.String
  /**
    * The street address, or null if one is not specified.
    */
  var street: java.lang.String
  /**
    * The second line of the street address, or null if one is not
    * specified.
    */
  var street_2: java.lang.String
}

object IPostalAddress {
  @scala.inline
  def apply(
    city: java.lang.String,
    postal_code: java.lang.String,
    region: java.lang.String,
    state: java.lang.String,
    street: java.lang.String,
    street_2: java.lang.String
  ): IPostalAddress = {
    val __obj = js.Dynamic.literal(city = city, postal_code = postal_code, region = region, state = state, street = street, street_2 = street_2)
  
    __obj.asInstanceOf[IPostalAddress]
  }
}

