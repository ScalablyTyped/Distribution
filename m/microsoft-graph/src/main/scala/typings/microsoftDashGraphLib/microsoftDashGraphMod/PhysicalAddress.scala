package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalAddress extends js.Object {
  // The city.
  var city: js.UndefOr[java.lang.String] = js.undefined
  // The country or region. It's a free-format string value, for example, 'United States'.
  var countryOrRegion: js.UndefOr[java.lang.String] = js.undefined
  // The postal code.
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  // The state.
  var state: js.UndefOr[java.lang.String] = js.undefined
  // The street.
  var street: js.UndefOr[java.lang.String] = js.undefined
}

object PhysicalAddress {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    countryOrRegion: java.lang.String = null,
    postalCode: java.lang.String = null,
    state: java.lang.String = null,
    street: java.lang.String = null
  ): PhysicalAddress = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (countryOrRegion != null) __obj.updateDynamic("countryOrRegion")(countryOrRegion)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (state != null) __obj.updateDynamic("state")(state)
    if (street != null) __obj.updateDynamic("street")(street)
    __obj.asInstanceOf[PhysicalAddress]
  }
}

