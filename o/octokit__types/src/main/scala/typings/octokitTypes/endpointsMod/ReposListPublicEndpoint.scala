package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListPublicEndpoint extends js.Object {
  /**
    * The integer ID of the last repository that you've seen.
    */
  var since: js.UndefOr[Double] = js.native
}

object ReposListPublicEndpoint {
  @scala.inline
  def apply(): ReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposListPublicEndpoint]
  }
  @scala.inline
  implicit class ReposListPublicEndpointOps[Self <: ReposListPublicEndpoint] (val x: Self) extends AnyVal {
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

