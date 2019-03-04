package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRecord extends js.Object {
  val accuracy_radius: scala.Double
  val average_income: js.UndefOr[scala.Double] = js.undefined
  val latitude: scala.Double
  val longitude: scala.Double
  val metro_code: js.UndefOr[scala.Double] = js.undefined
  val population_density: js.UndefOr[scala.Double] = js.undefined
  val time_zone: js.UndefOr[java.lang.String] = js.undefined
}

object LocationRecord {
  @scala.inline
  def apply(
    accuracy_radius: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    average_income: scala.Int | scala.Double = null,
    metro_code: scala.Int | scala.Double = null,
    population_density: scala.Int | scala.Double = null,
    time_zone: java.lang.String = null
  ): LocationRecord = {
    val __obj = js.Dynamic.literal(accuracy_radius = accuracy_radius, latitude = latitude, longitude = longitude)
    if (average_income != null) __obj.updateDynamic("average_income")(average_income.asInstanceOf[js.Any])
    if (metro_code != null) __obj.updateDynamic("metro_code")(metro_code.asInstanceOf[js.Any])
    if (population_density != null) __obj.updateDynamic("population_density")(population_density.asInstanceOf[js.Any])
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone)
    __obj.asInstanceOf[LocationRecord]
  }
}

