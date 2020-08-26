package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.here
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HereOptions extends js.Object {
  var appCode: String = js.native
  var appId: String = js.native
  var country: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var politicalView: js.UndefOr[String] = js.native
  var production: js.UndefOr[Boolean] = js.native
  var provider: here = js.native
  var state: js.UndefOr[String] = js.native
}

object HereOptions {
  @scala.inline
  def apply(appCode: String, appId: String, provider: here): HereOptions = {
    val __obj = js.Dynamic.literal(appCode = appCode.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereOptions]
  }
  @scala.inline
  implicit class HereOptionsOps[Self <: HereOptions] (val x: Self) extends AnyVal {
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
    def setAppCode(value: String): Self = this.set("appCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: here): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setPoliticalView(value: String): Self = this.set("politicalView", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoliticalView: Self = this.set("politicalView", js.undefined)
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

