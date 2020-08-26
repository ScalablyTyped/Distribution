package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Preserve whitespace when true. Default: false;
    */
  var lossless: Boolean = js.native
  /**
    * When true and a postcss.Rule is passed, set the result of
    * processing back onto the rule when done. Default: false.
    */
  var updateSelector: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(lossless: Boolean, updateSelector: Boolean): Options = {
    val __obj = js.Dynamic.literal(lossless = lossless.asInstanceOf[js.Any], updateSelector = updateSelector.asInstanceOf[js.Any])
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
    def setLossless(value: Boolean): Self = this.set("lossless", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateSelector(value: Boolean): Self = this.set("updateSelector", value.asInstanceOf[js.Any])
  }
  
}

