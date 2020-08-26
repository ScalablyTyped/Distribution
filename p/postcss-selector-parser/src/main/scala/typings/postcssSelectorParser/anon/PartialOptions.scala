package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Options> */
@js.native
trait PartialOptions extends js.Object {
  var lossless: js.UndefOr[Boolean] = js.native
  var updateSelector: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setLossless(value: Boolean): Self = this.set("lossless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLossless: Self = this.set("lossless", js.undefined)
    @scala.inline
    def setUpdateSelector(value: Boolean): Self = this.set("updateSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSelector: Self = this.set("updateSelector", js.undefined)
  }
  
}

