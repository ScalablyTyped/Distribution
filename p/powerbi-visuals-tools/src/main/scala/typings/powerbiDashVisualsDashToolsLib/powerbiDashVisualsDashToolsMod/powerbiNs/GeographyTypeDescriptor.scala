package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographyTypeDescriptor extends js.Object {
  val address: js.UndefOr[scala.Boolean] = js.undefined
  val city: js.UndefOr[scala.Boolean] = js.undefined
  val continent: js.UndefOr[scala.Boolean] = js.undefined
  val country: js.UndefOr[scala.Boolean] = js.undefined
  val county: js.UndefOr[scala.Boolean] = js.undefined
  val latitude: js.UndefOr[scala.Boolean] = js.undefined
  val longitude: js.UndefOr[scala.Boolean] = js.undefined
  val place: js.UndefOr[scala.Boolean] = js.undefined
  val postalCode: js.UndefOr[scala.Boolean] = js.undefined
  val region: js.UndefOr[scala.Boolean] = js.undefined
  val stateOrProvince: js.UndefOr[scala.Boolean] = js.undefined
}

object GeographyTypeDescriptor {
  @scala.inline
  def apply(
    address: js.UndefOr[scala.Boolean] = js.undefined,
    city: js.UndefOr[scala.Boolean] = js.undefined,
    continent: js.UndefOr[scala.Boolean] = js.undefined,
    country: js.UndefOr[scala.Boolean] = js.undefined,
    county: js.UndefOr[scala.Boolean] = js.undefined,
    latitude: js.UndefOr[scala.Boolean] = js.undefined,
    longitude: js.UndefOr[scala.Boolean] = js.undefined,
    place: js.UndefOr[scala.Boolean] = js.undefined,
    postalCode: js.UndefOr[scala.Boolean] = js.undefined,
    region: js.UndefOr[scala.Boolean] = js.undefined,
    stateOrProvince: js.UndefOr[scala.Boolean] = js.undefined
  ): GeographyTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(city)) __obj.updateDynamic("city")(city)
    if (!js.isUndefined(continent)) __obj.updateDynamic("continent")(continent)
    if (!js.isUndefined(country)) __obj.updateDynamic("country")(country)
    if (!js.isUndefined(county)) __obj.updateDynamic("county")(county)
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude)
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude)
    if (!js.isUndefined(place)) __obj.updateDynamic("place")(place)
    if (!js.isUndefined(postalCode)) __obj.updateDynamic("postalCode")(postalCode)
    if (!js.isUndefined(region)) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(stateOrProvince)) __obj.updateDynamic("stateOrProvince")(stateOrProvince)
    __obj.asInstanceOf[GeographyTypeDescriptor]
  }
}

