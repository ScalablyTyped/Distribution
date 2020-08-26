package typings.openfin.shapesPlatformMod

import typings.openfin.shapesIdentityMod.Identity
import typings.openfin.viewViewMod.ViewCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateViewPayload extends js.Object {
  var opts: ViewCreationOptions = js.native
  var target: Identity = js.native
}

object CreateViewPayload {
  @scala.inline
  def apply(opts: ViewCreationOptions, target: Identity): CreateViewPayload = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateViewPayload]
  }
  @scala.inline
  implicit class CreateViewPayloadOps[Self <: CreateViewPayload] (val x: Self) extends AnyVal {
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
    def setOpts(value: ViewCreationOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Identity): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

