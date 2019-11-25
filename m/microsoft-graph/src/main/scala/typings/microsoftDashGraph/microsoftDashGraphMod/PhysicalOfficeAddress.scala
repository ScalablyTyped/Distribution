package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalOfficeAddress extends js.Object {
  // The city.
  var city: js.UndefOr[String] = js.undefined
  // The country or region. It's a free-format string value, for example, 'United States'.
  var countryOrRegion: js.UndefOr[String] = js.undefined
  // Office location such as building and office number for an organizational contact.
  var officeLocation: js.UndefOr[String] = js.undefined
  // The postal code.
  var postalCode: js.UndefOr[String] = js.undefined
  // The state.
  var state: js.UndefOr[String] = js.undefined
  // The street.
  var street: js.UndefOr[String] = js.undefined
}

object PhysicalOfficeAddress {
  @scala.inline
  def apply(
    city: String = null,
    countryOrRegion: String = null,
    officeLocation: String = null,
    postalCode: String = null,
    state: String = null,
    street: String = null
  ): PhysicalOfficeAddress = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (countryOrRegion != null) __obj.updateDynamic("countryOrRegion")(countryOrRegion.asInstanceOf[js.Any])
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (street != null) __obj.updateDynamic("street")(street.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalOfficeAddress]
  }
}

