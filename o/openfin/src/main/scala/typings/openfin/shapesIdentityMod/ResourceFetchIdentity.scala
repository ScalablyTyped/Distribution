package typings.openfin.shapesIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceFetchIdentity extends Identity {
  var resourceFetch: js.UndefOr[Boolean] = js.native
}

object ResourceFetchIdentity {
  @scala.inline
  def apply(uuid: String): ResourceFetchIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFetchIdentity]
  }
  @scala.inline
  implicit class ResourceFetchIdentityOps[Self <: ResourceFetchIdentity] (val x: Self) extends AnyVal {
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
    def setResourceFetch(value: Boolean): Self = this.set("resourceFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceFetch: Self = this.set("resourceFetch", js.undefined)
  }
  
}

