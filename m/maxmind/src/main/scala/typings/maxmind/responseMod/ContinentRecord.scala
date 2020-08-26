package typings.maxmind.responseMod

import typings.maxmind.maxmindStrings.AF
import typings.maxmind.maxmindStrings.AN
import typings.maxmind.maxmindStrings.AS
import typings.maxmind.maxmindStrings.EU
import typings.maxmind.maxmindStrings.NA
import typings.maxmind.maxmindStrings.OC
import typings.maxmind.maxmindStrings.SA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinentRecord extends js.Object {
  val code: AF | AN | AS | EU | NA | OC | SA = js.native
  val geoname_id: Double = js.native
  val names: Names = js.native
}

object ContinentRecord {
  @scala.inline
  def apply(code: AF | AN | AS | EU | NA | OC | SA, geoname_id: Double, names: Names): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinentRecord]
  }
  @scala.inline
  implicit class ContinentRecordOps[Self <: ContinentRecord] (val x: Self) extends AnyVal {
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
    def setCode(value: AF | AN | AS | EU | NA | OC | SA): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeoname_id(value: Double): Self = this.set("geoname_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNames(value: Names): Self = this.set("names", value.asInstanceOf[js.Any])
  }
  
}

