package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScryptOptions extends js.Object {
  var N: js.UndefOr[Double] = js.native
  var maxmem: js.UndefOr[Double] = js.native
  var p: js.UndefOr[Double] = js.native
  var r: js.UndefOr[Double] = js.native
}

object ScryptOptions {
  @scala.inline
  def apply(): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScryptOptions]
  }
  @scala.inline
  implicit class ScryptOptionsOps[Self <: ScryptOptions] (val x: Self) extends AnyVal {
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
    def setN(value: Double): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    @scala.inline
    def setMaxmem(value: Double): Self = this.set("maxmem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxmem: Self = this.set("maxmem", js.undefined)
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
  }
  
}

