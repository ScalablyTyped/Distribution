package typings.onfleetNodeOnfleet.destinationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop { string } [apartment] - The suite or apartment number, or any additional relevant information.
  * @prop { string } city - The name of the municipality.
  * @prop { string } country - The name of the country.
  * @prop { string } [name] - A name associated with this address, for example, "Transamerica Pyramid".
  * @prop { string } number - The number component of this address, it may also contain letters.
  * @prop { string } [postalCode] - The postal or zip code.
  * @prop { string } [state] - The name of the state, province or jurisdiction.
  * @prop { string } street - The name of the street.
  * @prop { string } [unparsed] - A complete address specified in a single, unparsed string where the various elements are separated by commas.
  * * If present, all other address properties will be ignored (with the exception of name and apartment).
  * * In some countries, you may skip most address details (like city or state) if you provide a valid postalCode:
  *  for example, 325 Front Street W., M5V 3B5, CA will be geocoded correctly.
  */
trait DestinationAddress extends js.Object {
  var apartment: js.UndefOr[String] = js.undefined
  var city: String
  var country: String
  var name: js.UndefOr[String] = js.undefined
  var number: String
  var postalCode: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var street: String
  var unparsed: js.UndefOr[String] = js.undefined
}

object DestinationAddress {
  @scala.inline
  def apply(
    city: String,
    country: String,
    number: String,
    street: String,
    apartment: String = null,
    name: String = null,
    postalCode: String = null,
    state: String = null,
    unparsed: String = null
  ): DestinationAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    if (apartment != null) __obj.updateDynamic("apartment")(apartment.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (unparsed != null) __obj.updateDynamic("unparsed")(unparsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationAddress]
  }
}

