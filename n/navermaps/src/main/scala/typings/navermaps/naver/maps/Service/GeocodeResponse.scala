package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeResponse extends js.Object {
  var result: Items = js.native
}

object GeocodeResponse {
  @scala.inline
  def apply(result: Items): GeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResponse]
  }
  @scala.inline
  implicit class GeocodeResponseOps[Self <: GeocodeResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: Items): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

