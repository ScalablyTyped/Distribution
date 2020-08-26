package typings.nodeForge.mod.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeOptions extends js.Object {
  var maxline: js.UndefOr[Double] = js.native
}

object EncodeOptions {
  @scala.inline
  def apply(): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeOptions]
  }
  @scala.inline
  implicit class EncodeOptionsOps[Self <: EncodeOptions] (val x: Self) extends AnyVal {
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
    def setMaxline(value: Double): Self = this.set("maxline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxline: Self = this.set("maxline", js.undefined)
  }
  
}

