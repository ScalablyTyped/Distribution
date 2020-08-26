package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffNavigatorOptions extends js.Object {
  val alwaysRevealFirst: js.UndefOr[Boolean] = js.native
  val followsCaret: js.UndefOr[Boolean] = js.native
  val ignoreCharChanges: js.UndefOr[Boolean] = js.native
}

object IDiffNavigatorOptions {
  @scala.inline
  def apply(): IDiffNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffNavigatorOptions]
  }
  @scala.inline
  implicit class IDiffNavigatorOptionsOps[Self <: IDiffNavigatorOptions] (val x: Self) extends AnyVal {
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
    def setAlwaysRevealFirst(value: Boolean): Self = this.set("alwaysRevealFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysRevealFirst: Self = this.set("alwaysRevealFirst", js.undefined)
    @scala.inline
    def setFollowsCaret(value: Boolean): Self = this.set("followsCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowsCaret: Self = this.set("followsCaret", js.undefined)
    @scala.inline
    def setIgnoreCharChanges(value: Boolean): Self = this.set("ignoreCharChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCharChanges: Self = this.set("ignoreCharChanges", js.undefined)
  }
  
}

