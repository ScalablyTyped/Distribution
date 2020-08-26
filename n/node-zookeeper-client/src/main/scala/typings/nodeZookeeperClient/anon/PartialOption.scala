package typings.nodeZookeeperClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-zookeeper-client.node-zookeeper-client.Option> */
@js.native
trait PartialOption extends js.Object {
  var retries: js.UndefOr[Double] = js.native
  var sessionTimeout: js.UndefOr[Double] = js.native
  var spinDelay: js.UndefOr[Double] = js.native
}

object PartialOption {
  @scala.inline
  def apply(): PartialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOption]
  }
  @scala.inline
  implicit class PartialOptionOps[Self <: PartialOption] (val x: Self) extends AnyVal {
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
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    @scala.inline
    def setSpinDelay(value: Double): Self = this.set("spinDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinDelay: Self = this.set("spinDelay", js.undefined)
  }
  
}

