package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSessionRequestOptions extends js.Object {
  var endStream: js.UndefOr[Boolean] = js.native
  var exclusive: js.UndefOr[Boolean] = js.native
  var parent: js.UndefOr[Double] = js.native
  var waitForTrailers: js.UndefOr[Boolean] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object ClientSessionRequestOptions {
  @scala.inline
  def apply(): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
  @scala.inline
  implicit class ClientSessionRequestOptionsOps[Self <: ClientSessionRequestOptions] (val x: Self) extends AnyVal {
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
    def setEndStream(value: Boolean): Self = this.set("endStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndStream: Self = this.set("endStream", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setParent(value: Double): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setWaitForTrailers(value: Boolean): Self = this.set("waitForTrailers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForTrailers: Self = this.set("waitForTrailers", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

