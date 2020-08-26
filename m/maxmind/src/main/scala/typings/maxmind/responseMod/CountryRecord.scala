package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryRecord extends RegisteredCountryRecord {
  val confidence: js.UndefOr[Double] = js.native
}

object CountryRecord {
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names): CountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryRecord]
  }
  @scala.inline
  implicit class CountryRecordOps[Self <: CountryRecord] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
  }
  
}

