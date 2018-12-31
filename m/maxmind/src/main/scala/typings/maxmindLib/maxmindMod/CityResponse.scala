package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityResponse extends CountryResponse {
  val city: js.UndefOr[CityRecord] = js.undefined
  val location: js.UndefOr[LocationRecord] = js.undefined
  val postal: js.UndefOr[PostalRecord] = js.undefined
  val subdivisions: js.UndefOr[js.Array[SubdivisionsRecord]] = js.undefined
}

