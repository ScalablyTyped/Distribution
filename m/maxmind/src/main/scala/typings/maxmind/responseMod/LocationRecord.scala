package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRecord extends js.Object {
  val accuracy_radius: Double
  val average_income: js.UndefOr[Double] = js.undefined
  val latitude: Double
  val longitude: Double
  val metro_code: js.UndefOr[Double] = js.undefined
  val population_density: js.UndefOr[Double] = js.undefined
  val time_zone: js.UndefOr[String] = js.undefined
}

object LocationRecord {
  @scala.inline
  def apply(
    accuracy_radius: Double,
    latitude: Double,
    longitude: Double,
    average_income: js.UndefOr[Double] = js.undefined,
    metro_code: js.UndefOr[Double] = js.undefined,
    population_density: js.UndefOr[Double] = js.undefined,
    time_zone: String = null
  ): LocationRecord = {
    val __obj = js.Dynamic.literal(accuracy_radius = accuracy_radius.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(average_income)) __obj.updateDynamic("average_income")(average_income.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metro_code)) __obj.updateDynamic("metro_code")(metro_code.get.asInstanceOf[js.Any])
    if (!js.isUndefined(population_density)) __obj.updateDynamic("population_density")(population_density.get.asInstanceOf[js.Any])
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRecord]
  }
}

