package typings.naudiodon.anon

import typings.naudiodon.mod.HostAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultHostAPI extends js.Object {
  var HostAPIs: js.Array[HostAPI] = js.native
  var defaultHostAPI: Double = js.native
}

object DefaultHostAPI {
  @scala.inline
  def apply(HostAPIs: js.Array[HostAPI], defaultHostAPI: Double): DefaultHostAPI = {
    val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHostAPI]
  }
  @scala.inline
  implicit class DefaultHostAPIOps[Self <: DefaultHostAPI] (val x: Self) extends AnyVal {
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
    def setHostAPIsVarargs(value: HostAPI*): Self = this.set("HostAPIs", js.Array(value :_*))
    @scala.inline
    def setHostAPIs(value: js.Array[HostAPI]): Self = this.set("HostAPIs", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultHostAPI(value: Double): Self = this.set("defaultHostAPI", value.asInstanceOf[js.Any])
  }
  
}

