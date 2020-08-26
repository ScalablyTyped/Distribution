package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRecord extends js.Object {
  val accuracy_radius: Double = js.native
  val average_income: js.UndefOr[Double] = js.native
  val latitude: Double = js.native
  val longitude: Double = js.native
  val metro_code: js.UndefOr[Double] = js.native
  val population_density: js.UndefOr[Double] = js.native
  val time_zone: js.UndefOr[String] = js.native
}

object LocationRecord {
  @scala.inline
  def apply(accuracy_radius: Double, latitude: Double, longitude: Double): LocationRecord = {
    val __obj = js.Dynamic.literal(accuracy_radius = accuracy_radius.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRecord]
  }
  @scala.inline
  implicit class LocationRecordOps[Self <: LocationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy_radius(value: Double): Self = this.set("accuracy_radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAverage_income(value: Double): Self = this.set("average_income", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage_income: Self = this.set("average_income", js.undefined)
    @scala.inline
    def setMetro_code(value: Double): Self = this.set("metro_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetro_code: Self = this.set("metro_code", js.undefined)
    @scala.inline
    def setPopulation_density(value: Double): Self = this.set("population_density", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulation_density: Self = this.set("population_density", js.undefined)
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime_zone: Self = this.set("time_zone", js.undefined)
  }
  
}

