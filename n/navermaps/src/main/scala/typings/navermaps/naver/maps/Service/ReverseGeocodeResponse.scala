package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseGeocodeResponse extends js.Object {
  var result: Total = js.native
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(result: Total): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
  @scala.inline
  implicit class ReverseGeocodeResponseOps[Self <: ReverseGeocodeResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: Total): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

