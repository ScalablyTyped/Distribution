package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsListEndpoint extends js.Object {
  /**
    * The integer ID of the last organization that you've seen.
    */
  var since: js.UndefOr[Double] = js.native
}

object OrgsListEndpoint {
  @scala.inline
  def apply(): OrgsListEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgsListEndpoint]
  }
  @scala.inline
  implicit class OrgsListEndpointOps[Self <: OrgsListEndpoint] (val x: Self) extends AnyVal {
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
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
  
}

