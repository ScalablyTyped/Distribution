package typings.parcelEnv.ParcelModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptOptions extends js.Object {
  /**
    * Indicates that apply() is automatically called by check function
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
    */
  var ignoreUnaccepted: js.UndefOr[Boolean] = js.native
}

object AcceptOptions {
  @scala.inline
  def apply(): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptOptions]
  }
  @scala.inline
  implicit class AcceptOptionsOps[Self <: AcceptOptions] (val x: Self) extends AnyVal {
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
    def setAutoApply(value: Boolean): Self = this.set("autoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApply: Self = this.set("autoApply", js.undefined)
    @scala.inline
    def setIgnoreUnaccepted(value: Boolean): Self = this.set("ignoreUnaccepted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnaccepted: Self = this.set("ignoreUnaccepted", js.undefined)
  }
  
}

