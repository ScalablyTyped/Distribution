package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsStarEndpoint extends js.Object {
  var gist_id: String = js.native
}

object GistsStarEndpoint {
  @scala.inline
  def apply(gist_id: String): GistsStarEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsStarEndpoint]
  }
  @scala.inline
  implicit class GistsStarEndpointOps[Self <: GistsStarEndpoint] (val x: Self) extends AnyVal {
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
    def setGist_id(value: String): Self = this.set("gist_id", value.asInstanceOf[js.Any])
  }
  
}

