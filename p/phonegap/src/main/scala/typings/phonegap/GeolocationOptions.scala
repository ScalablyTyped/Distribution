package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object GeolocationOptions {
  @scala.inline
  def apply(): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationOptions]
  }
  @scala.inline
  implicit class GeolocationOptionsOps[Self <: GeolocationOptions] (val x: Self) extends AnyVal {
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
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

