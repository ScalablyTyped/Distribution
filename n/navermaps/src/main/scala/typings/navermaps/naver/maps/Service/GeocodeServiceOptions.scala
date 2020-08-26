package typings.navermaps.naver.maps.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeServiceOptions extends ServiceOptions {
  var address: js.UndefOr[String] = js.native
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(): GeocodeServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
  @scala.inline
  implicit class GeocodeServiceOptionsOps[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
  }
  
}

