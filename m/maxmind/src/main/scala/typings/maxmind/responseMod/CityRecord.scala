package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CityRecord extends js.Object {
  val confidence: js.UndefOr[Double] = js.native
  val geoname_id: Double = js.native
  val names: Names = js.native
}

object CityRecord {
  @scala.inline
  def apply(geoname_id: Double, names: Names): CityRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityRecord]
  }
  @scala.inline
  implicit class CityRecordOps[Self <: CityRecord] (val x: Self) extends AnyVal {
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
    def setGeoname_id(value: Double): Self = this.set("geoname_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNames(value: Names): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
  }
  
}

