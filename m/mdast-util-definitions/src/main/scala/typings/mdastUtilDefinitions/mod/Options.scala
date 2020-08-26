package typings.mdastUtilDefinitions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Turn on (`true`) to use CommonMark precedence: ignore definitions found later for duplicate definitions. The default behavior is to prefer the last found definition.
    *
    * @default false
    */
  var commonmark: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(commonmark: Boolean): Options = {
    val __obj = js.Dynamic.literal(commonmark = commonmark.asInstanceOf[js.Any])
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
    def setCommonmark(value: Boolean): Self = this.set("commonmark", value.asInstanceOf[js.Any])
  }
  
}

