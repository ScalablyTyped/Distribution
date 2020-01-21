package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryResponse extends Response {
  val continent: js.UndefOr[ContinentRecord] = js.undefined
  val country: js.UndefOr[CountryRecord] = js.undefined
  val registered_country: js.UndefOr[RegisteredCountryRecord] = js.undefined
  val represented_country: js.UndefOr[RepresentedCountryRecord] = js.undefined
  val traits: js.UndefOr[TraitsRecord] = js.undefined
}

object CountryResponse {
  @scala.inline
  def apply(
    continent: ContinentRecord = null,
    country: CountryRecord = null,
    registered_country: RegisteredCountryRecord = null,
    represented_country: RepresentedCountryRecord = null,
    traits: TraitsRecord = null
  ): CountryResponse = {
    val __obj = js.Dynamic.literal()
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (registered_country != null) __obj.updateDynamic("registered_country")(registered_country.asInstanceOf[js.Any])
    if (represented_country != null) __obj.updateDynamic("represented_country")(represented_country.asInstanceOf[js.Any])
    if (traits != null) __obj.updateDynamic("traits")(traits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryResponse]
  }
}

