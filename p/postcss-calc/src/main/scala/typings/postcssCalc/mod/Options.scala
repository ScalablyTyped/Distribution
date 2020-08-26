package typings.postcssCalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var mediaQueries: js.UndefOr[Boolean] = js.native
  var precision: js.UndefOr[Double] = js.native
  var preserve: js.UndefOr[Boolean] = js.native
  var selectors: js.UndefOr[Boolean] = js.native
  var warnWhenCannotResolve: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMediaQueries(value: Boolean): Self = this.set("mediaQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaQueries: Self = this.set("mediaQueries", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    @scala.inline
    def setSelectors(value: Boolean): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    @scala.inline
    def setWarnWhenCannotResolve(value: Boolean): Self = this.set("warnWhenCannotResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnWhenCannotResolve: Self = this.set("warnWhenCannotResolve", js.undefined)
  }
  
}

