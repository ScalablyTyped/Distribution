package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterSideOptions extends js.Object {
  /**
    * @description This function will be called after the menu has been opened.
    * @return {Function}
    */
  var callback: js.UndefOr[js.Function] = js.native
}

object SplitterSideOptions {
  @scala.inline
  def apply(): SplitterSideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterSideOptions]
  }
  @scala.inline
  implicit class SplitterSideOptionsOps[Self <: SplitterSideOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
  }
  
}

