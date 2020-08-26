package typings.nodeGeocoder.mod

import typings.nodeGeocoder.anon.Confidence
import typings.nodeGeocoder.anon.Level1long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var administrativeLevels: js.UndefOr[Level1long] = js.native
  var building: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var countryCode: js.UndefOr[String] = js.native
  var county: js.UndefOr[String] = js.native
  var district: js.UndefOr[String] = js.native
  var extra: js.UndefOr[Confidence] = js.native
  var formattedAddress: js.UndefOr[String] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var provider: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var stateCode: js.UndefOr[String] = js.native
  var streetName: js.UndefOr[String] = js.native
  var streetNumber: js.UndefOr[String] = js.native
  var zipcode: js.UndefOr[String] = js.native
}

object Entry {
  @scala.inline
  def apply(): Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setAdministrativeLevels(value: Level1long): Self = this.set("administrativeLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrativeLevels: Self = this.set("administrativeLevels", js.undefined)
    @scala.inline
    def setBuilding(value: String): Self = this.set("building", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilding: Self = this.set("building", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setCounty(value: String): Self = this.set("county", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounty: Self = this.set("county", js.undefined)
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistrict: Self = this.set("district", js.undefined)
    @scala.inline
    def setExtra(value: Confidence): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedAddress: Self = this.set("formattedAddress", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateCode(value: String): Self = this.set("stateCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateCode: Self = this.set("stateCode", js.undefined)
    @scala.inline
    def setStreetName(value: String): Self = this.set("streetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetName: Self = this.set("streetName", js.undefined)
    @scala.inline
    def setStreetNumber(value: String): Self = this.set("streetNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetNumber: Self = this.set("streetNumber", js.undefined)
    @scala.inline
    def setZipcode(value: String): Self = this.set("zipcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipcode: Self = this.set("zipcode", js.undefined)
  }
  
}

